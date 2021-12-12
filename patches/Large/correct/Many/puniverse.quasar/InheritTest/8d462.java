diff --git a/src/test/java/co/paralleluniverse/lwthreads/InheritTest.java b/src/test/java/co/paralleluniverse/lwthreads/InheritTest.java
index de096cc..af40d17 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/InheritTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/InheritTest.java
@@ -19,7 +19,7 @@
     @Test
     public void testInherit() {
         final C dut = new C();
-        LightweightThread c = new LightweightThread(null, new SuspendableRunnable() {
+        LightweightThread c = new LightweightThread(null, null, new SuspendableRunnable() {
             @Override
             public void run() throws SuspendExecution {
                 dut.myMethod();
