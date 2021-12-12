diff --git a/src/htmlparser/org/htmlparser/tests/BenchmarkP.java b/src/htmlparser/org/htmlparser/tests/BenchmarkP.java
index ca568d0..6c5dc94 100755
--- a/src/htmlparser/org/htmlparser/tests/BenchmarkP.java
+++ b/src/htmlparser/org/htmlparser/tests/BenchmarkP.java
@@ -58,7 +58,7 @@
 
     public static void main(String[] args)
     {
-        if (args != null & args.length > 0)
+        if (args != null && args.length > 0)
         {
             String strurl = args[0];
             boolean addLink = true;
