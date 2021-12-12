diff --git a/src/test/java/org/mapdb/EngineTest.java b/src/test/java/org/mapdb/EngineTest.java
index c2f646c..5adb024 100644
--- a/src/test/java/org/mapdb/EngineTest.java
+++ b/src/test/java/org/mapdb/EngineTest.java
@@ -711,7 +711,7 @@
                     try {
                         for (; ; ) {
                             long A = a.incrementAndGet();
-                            Random r = new Random();
+                            Random r = new Random(A);
                             e.update(counterRecid, A, Serializer.LONG);
 
                             for (long recid : recids) {
@@ -727,7 +727,7 @@
                 }
             };
             t.start();
-            t.sleep(5000);
+            Thread.sleep(5000);
             t.stop();
             latch.await();
             if(!e.isClosed()){
