diff --git a/src/test/java/co/paralleluniverse/lwthreads/ArrayTest.java b/src/test/java/co/paralleluniverse/lwthreads/ArrayTest.java
index 744476d..ad416b5 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/ArrayTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/ArrayTest.java
@@ -20,7 +20,7 @@
     
     @Test
     public void testArray() {
-        LightweightThread co = new LightweightThread(null, this);
+        LightweightThread co = new LightweightThread(null, null, this);
         co.exec();
         assertEquals(42, l1.i);
     }
