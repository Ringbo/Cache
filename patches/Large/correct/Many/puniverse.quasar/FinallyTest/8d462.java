diff --git a/src/test/java/co/paralleluniverse/lwthreads/FinallyTest.java b/src/test/java/co/paralleluniverse/lwthreads/FinallyTest.java
index de509b0..3608e86 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/FinallyTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/FinallyTest.java
@@ -64,7 +64,7 @@
         results.clear();
         
         try {
-            LightweightThread co = new LightweightThread(null, this);
+            LightweightThread co = new LightweightThread(null, null, this);
             exec(co);
             results.add("B");
             exec(co);
