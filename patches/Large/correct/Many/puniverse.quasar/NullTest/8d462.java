diff --git a/src/test/java/co/paralleluniverse/lwthreads/NullTest.java b/src/test/java/co/paralleluniverse/lwthreads/NullTest.java
index 3d69404..bce4d2c 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/NullTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/NullTest.java
@@ -19,7 +19,7 @@
     
     @Test
     public void testNull() {
-        LightweightThread co = new LightweightThread(null, this);
+        LightweightThread co = new LightweightThread(null, null, this);
         int count = 1;
         while(!co.exec())
             count++;
