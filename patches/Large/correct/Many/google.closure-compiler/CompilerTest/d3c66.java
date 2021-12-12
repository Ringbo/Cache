diff --git a/test/com/google/javascript/jscomp/CompilerTest.java b/test/com/google/javascript/jscomp/CompilerTest.java
index 0e8c212..68c2d59 100644
--- a/test/com/google/javascript/jscomp/CompilerTest.java
+++ b/test/com/google/javascript/jscomp/CompilerTest.java
@@ -155,7 +155,7 @@
         error.contains("Failed to load module \"missing\" at gin.js"));
   }
 
-  private String normalize(String path) {
+  private static String normalize(String path) {
     return path.replace(File.separator, "/");
   }
 
