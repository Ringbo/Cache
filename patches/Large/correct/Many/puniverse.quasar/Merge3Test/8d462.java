diff --git a/src/test/java/co/paralleluniverse/lwthreads/Merge3Test.java b/src/test/java/co/paralleluniverse/lwthreads/Merge3Test.java
index bfc4e7c..1fe00f1 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/Merge3Test.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/Merge3Test.java
@@ -33,7 +33,7 @@
     
     @Test
     public void testMerge3() {
-        LightweightThread c = new LightweightThread(null, new Merge3Test());
+        LightweightThread c = new LightweightThread(null, null, new Merge3Test());
         c.exec();
     }
 }
