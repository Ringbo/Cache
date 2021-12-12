diff --git a/src/test/java/co/paralleluniverse/lwthreads/CatchTest.java b/src/test/java/co/paralleluniverse/lwthreads/CatchTest.java
index 6bd2b86..13b9e48 100644
--- a/src/test/java/co/paralleluniverse/lwthreads/CatchTest.java
+++ b/src/test/java/co/paralleluniverse/lwthreads/CatchTest.java
@@ -75,7 +75,7 @@
         results.clear();
 
         try {
-            LightweightThread co = new LightweightThread(null, this);
+            LightweightThread co = new LightweightThread(null, null, this);
             exec(co);
             results.add("B");
             exec(co);
