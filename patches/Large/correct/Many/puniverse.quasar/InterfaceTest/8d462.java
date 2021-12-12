diff --git a/src/test/java/co/paralleluniverse/lwthreads/InterfaceTest.java b/src/test/java/co/paralleluniverse/lwthreads/InterfaceTest.java
index 6e3ed50..7160607 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/InterfaceTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/InterfaceTest.java
@@ -45,7 +45,7 @@
     @Test
     public void testSuspend() {
 //		final I i = new C();
-        LightweightThread co = new LightweightThread(null, new SuspendableRunnable() {
+        LightweightThread co = new LightweightThread(null, null, new SuspendableRunnable() {
             @Override
             public final void run() throws SuspendExecution {
                 // next line causes an error because of incomplete merge in TypeInterpreter
