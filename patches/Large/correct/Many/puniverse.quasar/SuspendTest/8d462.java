diff --git a/src/test/java/co/paralleluniverse/lwthreads/SuspendTest.java b/src/test/java/co/paralleluniverse/lwthreads/SuspendTest.java
index e9196c9..75f261d 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/SuspendTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/SuspendTest.java
@@ -40,7 +40,7 @@
     @Test
     public void testSuspend() {
         SuspendTest test = new SuspendTest();
-        LightweightThread co = new LightweightThread(null, test);
+        LightweightThread co = new LightweightThread(null, null, test);
 
         while (!exec(co))
             System.out.println("State=" + co.getState());
