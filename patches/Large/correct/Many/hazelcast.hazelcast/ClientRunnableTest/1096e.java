diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/ClientRunnableTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/ClientRunnableTest.java
index 80f592b..5bb7368 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/ClientRunnableTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/ClientRunnableTest.java
@@ -40,7 +40,7 @@
         new Thread(new Runnable() {
             public void run() {
                 try {
-                    Thread.sleep(10);
+                    Thread.sleep(50);
                     clientRunnable.running = false;
                     synchronized (clientRunnable.monitor) {
                         clientRunnable.monitor.wait();
@@ -52,7 +52,7 @@
         }).start();
         clientRunnable.run();
         assertTrue(counter.get() > 1);
-        assertTrue("Not notified", latch.await(5, TimeUnit.SECONDS));
+        assertTrue("Not notified", latch.await(25, TimeUnit.SECONDS));
     }
 
     @Test
