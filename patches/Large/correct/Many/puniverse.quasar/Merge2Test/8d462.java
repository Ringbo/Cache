diff --git a/src/test/java/co/paralleluniverse/lwthreads/Merge2Test.java b/src/test/java/co/paralleluniverse/lwthreads/Merge2Test.java
index 14e51cc..edd9d71 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/Merge2Test.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/Merge2Test.java
@@ -49,7 +49,7 @@
     @Test
     public void testMerge2() {
         try {
-            LightweightThread c = new LightweightThread(null, new Merge2Test());
+            LightweightThread c = new LightweightThread(null, null, new Merge2Test());
             c.exec();
             assertTrue("Should not reach here", false);
         } catch (NullPointerException ex) {
