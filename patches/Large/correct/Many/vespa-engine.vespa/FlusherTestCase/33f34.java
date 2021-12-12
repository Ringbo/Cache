diff --git a/logserver/src/test/java/com/yahoo/logserver/FlusherTestCase.java b/logserver/src/test/java/com/yahoo/logserver/FlusherTestCase.java
index d74504b..79d16de 100644
--- a/logserver/src/test/java/com/yahoo/logserver/FlusherTestCase.java
+++ b/logserver/src/test/java/com/yahoo/logserver/FlusherTestCase.java
@@ -14,7 +14,7 @@
     public void testFlusher() throws InterruptedException {
         Flusher flusher = new Flusher();
         LogDispatcherTestCase.MockHandler handler = new LogDispatcherTestCase.MockHandler();
-        flusher.register(handler);
+        Flusher.register(handler);
         flusher.start();
         Thread.sleep(5000);
         flusher.interrupt();
