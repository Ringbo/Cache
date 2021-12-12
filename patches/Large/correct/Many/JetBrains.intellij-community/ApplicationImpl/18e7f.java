diff --git a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
index 7e6b0c7..8392bef 100644
--- a/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/application/impl/ApplicationImpl.java
@@ -96,7 +96,7 @@
 public class ApplicationImpl extends PlatformComponentManagerImpl implements ApplicationEx {
   private static final Logger LOG = Logger.getInstance("#com.intellij.application.impl.ApplicationImpl");
 
-  private final ReadMostlyRWLock myLock;
+  final ReadMostlyRWLock myLock;
 
   private final ModalityInvokator myInvokator = new ModalityInvokatorImpl();
 
@@ -110,7 +110,7 @@
   private final String myName;
 
   private final Stack<Class> myWriteActionsStack = new Stack<>(); // accessed from EDT only, no need to sync
-  private int myWriteStackBase = 0;
+  private int myWriteStackBase;
   private volatile Thread myWriteActionThread;
 
   private int myInEditorPaintCounter; // EDT only
@@ -163,7 +163,7 @@
 
     AWTExceptionHandler.register(); // do not crash AWT on exceptions
 
-    Disposer.setDebugMode((isInternal || isUnitTestMode || Disposer.isDebugDisposerOn()));
+    Disposer.setDebugMode(isInternal || isUnitTestMode || Disposer.isDebugDisposerOn());
 
     myStartTime = System.currentTimeMillis();
     mySplash = splash;
@@ -487,7 +487,7 @@
   @Override
   protected void setProgressDuringInit(@NotNull ProgressIndicator indicator) {
     float start = PluginManagerCore.PLUGINS_PROGRESS_PART + PluginManagerCore.LOADERS_PROGRESS_PART;
-    indicator.setFraction(start + (getPercentageOfComponentsLoaded() * (1 - start)));
+    indicator.setFraction(start + getPercentageOfComponentsLoaded() * (1 - start));
   }
 
   private static void createLocatorFile() {
@@ -1187,11 +1187,10 @@
       if (!myLock.isWriteLocked()) {
         assertNoPsiLock();
         if (!myLock.tryWriteLock()) {
-          Future<?> reportSlowWrite = ourDumpThreadsOnLongWriteActionWaiting > 0 ?
-                                      JobScheduler.getScheduler()
-                                        .scheduleWithFixedDelay(() -> PerformanceWatcher.getInstance().dumpThreads("waiting", true),
+          Future<?> reportSlowWrite = ourDumpThreadsOnLongWriteActionWaiting <= 0 ? null :
+              JobScheduler.getScheduler().scheduleWithFixedDelay(() -> PerformanceWatcher.getInstance().dumpThreads("waiting", true),
                                                                 ourDumpThreadsOnLongWriteActionWaiting,
-                                                                ourDumpThreadsOnLongWriteActionWaiting, TimeUnit.MILLISECONDS) : null;
+                                                                 ourDumpThreadsOnLongWriteActionWaiting, TimeUnit.MILLISECONDS);
           myLock.writeLock();
           if (reportSlowWrite != null) {
             reportSlowWrite.cancel(false);
