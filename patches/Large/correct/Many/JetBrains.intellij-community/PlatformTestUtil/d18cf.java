diff --git a/platform/testFramework/src/com/intellij/testFramework/PlatformTestUtil.java b/platform/testFramework/src/com/intellij/testFramework/PlatformTestUtil.java
index af02205..3a6c9d5 100644
--- a/platform/testFramework/src/com/intellij/testFramework/PlatformTestUtil.java
+++ b/platform/testFramework/src/com/intellij/testFramework/PlatformTestUtil.java
@@ -208,7 +208,7 @@
   }
 
   @TestOnly
-  public static void waitForAlarm(final int delay) {
+  public static void waitForAlarm(final int delay) throws InterruptedException {
     assert !ApplicationManager.getApplication().isWriteAccessAllowed(): "It's a bad idea to wait for an alarm under the write action. Somebody creates an alarm which requires read action and you are deadlocked.";
     assert ApplicationManager.getApplication().isDispatchThread();
 
@@ -236,7 +236,8 @@
     boolean sleptAlready = false;
     while (!invoked.get()) {
       UIUtil.dispatchAllInvocationEvents();
-      TimeoutUtil.sleep(sleptAlready ? 10 : delay);
+      //noinspection BusyWait
+      Thread.sleep(sleptAlready ? 10 : delay);
       sleptAlready = true;
     }
     UIUtil.dispatchAllInvocationEvents();
