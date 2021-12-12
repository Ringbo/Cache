diff --git a/src/main/java/lambdasinaction/chap6/ParallelStreams.java b/src/main/java/lambdasinaction/chap6/ParallelStreams.java
index 6182c3f..152e891 100644
--- a/src/main/java/lambdasinaction/chap6/ParallelStreams.java
+++ b/src/main/java/lambdasinaction/chap6/ParallelStreams.java
@@ -6,7 +6,7 @@
 
     public static long iterativeSum(long n) {
         long result = 0;
-        for (long i = 0; i < n; i++) {
+        for (long i = 0; i <= n; i++) {
             result += i;
         }
         return result;
