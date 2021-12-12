diff --git a/src/test/java/co/paralleluniverse/lwthreads/UninitializedTest.java b/src/test/java/co/paralleluniverse/lwthreads/UninitializedTest.java
index 26c6cf4..c41395f 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/UninitializedTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/UninitializedTest.java
@@ -19,7 +19,7 @@
     
     @Test
     public void testUninitialized() {
-        LightweightThread co = new LightweightThread(null, this);
+        LightweightThread co = new LightweightThread(null, null, this);
         int count = 1;
         while(!co.exec())
             count++;
