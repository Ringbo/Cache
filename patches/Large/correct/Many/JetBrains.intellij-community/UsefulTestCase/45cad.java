diff --git a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
index 6c9ffc9..6ff767b 100644
--- a/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/UsefulTestCase.java
@@ -1088,7 +1088,7 @@
   public static void waitForAppLeakingThreads(long timeout, @NotNull TimeUnit timeUnit) {
     EdtTestUtil.runInEdtAndWait(() -> {
       Application application = ApplicationManager.getApplication();
-      if (application != null) {
+      if (application != null && !application.isDisposed()) {
         FileBasedIndexImpl index = (FileBasedIndexImpl)FileBasedIndex.getInstance();
         if (index != null) index.waitForVfsEventsExecuted(timeout, timeUnit);
 
