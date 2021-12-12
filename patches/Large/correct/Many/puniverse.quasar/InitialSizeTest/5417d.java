diff --git a/src/test/java/co/paralleluniverse/lwthreads/InitialSizeTest.java b/src/test/java/co/paralleluniverse/lwthreads/InitialSizeTest.java
index b669b04..64149f6 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/InitialSizeTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/InitialSizeTest.java
@@ -31,7 +31,7 @@
     }
     
     private void testWithSize(int stackSize) {
-        LightweightThread c = new LightweightThread(null, this, stackSize);
+        LightweightThread c = new LightweightThread(null, null, this, stackSize);
         assertEquals(getStackSize(c), stackSize);
         boolean res = c.exec();
         assertEquals(res, false);
