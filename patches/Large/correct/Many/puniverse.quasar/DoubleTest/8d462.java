diff --git a/src/test/java/co/paralleluniverse/lwthreads/DoubleTest.java b/src/test/java/co/paralleluniverse/lwthreads/DoubleTest.java
index f6bb3a9..223a048 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/DoubleTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/DoubleTest.java
@@ -19,7 +19,7 @@
 
     @Test
     public void testDouble() {
-        LightweightThread co = new LightweightThread(null, this);
+        LightweightThread co = new LightweightThread(null, null, this);
         co.exec();
         assertEquals(0, result, 1e-8);
         boolean res = co.exec();
