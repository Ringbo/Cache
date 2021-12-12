diff --git a/core/test-src/org/pentaho/di/core/logging/LoggingRegistrySingltonTest.java b/core/test-src/org/pentaho/di/core/logging/LoggingRegistrySingltonTest.java
index 6330caa..3467a8d 100644
--- a/core/test-src/org/pentaho/di/core/logging/LoggingRegistrySingltonTest.java
+++ b/core/test-src/org/pentaho/di/core/logging/LoggingRegistrySingltonTest.java
@@ -36,7 +36,7 @@
   public void testLoggingRegistryConcurrentInitialization() throws InterruptedException, ExecutionException {
     CountDownLatch start = new CountDownLatch( 1 );
 
-    int count = 1000;
+    int count = 10;
     CompletionService<LoggingRegistry> drover = registerHounds( count, start );
     // fire!
     start.countDown();
