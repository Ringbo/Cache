diff --git a/src/test/java/co/paralleluniverse/lwthreads/ThrowTest.java b/src/test/java/co/paralleluniverse/lwthreads/ThrowTest.java
index 50a0615..b82ab72 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/ThrowTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/ThrowTest.java
@@ -76,7 +76,7 @@
     public void testThrow() {
         results.clear();
         
-        LightweightThread co = new LightweightThread(null, this);
+        LightweightThread co = new LightweightThread(null, null, this);
         try {
             exec(co);
             results.add("B");
