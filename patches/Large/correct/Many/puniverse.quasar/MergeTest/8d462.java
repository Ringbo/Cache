diff --git a/src/test/java/co/paralleluniverse/lwthreads/MergeTest.java b/src/test/java/co/paralleluniverse/lwthreads/MergeTest.java
index 2c56792..f09c2e3 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/MergeTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/MergeTest.java
@@ -31,7 +31,7 @@
 
     @Test
     public void testMerge() {
-        LightweightThread c = new LightweightThread(null, new MergeTest());
+        LightweightThread c = new LightweightThread(null, null, new MergeTest());
         c.exec();
     }
 }
