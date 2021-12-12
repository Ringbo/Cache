diff --git a/src/com/google/javascript/jscomp/Compiler.java b/src/com/google/javascript/jscomp/Compiler.java
index 4373b53..0886fd8 100644
--- a/src/com/google/javascript/jscomp/Compiler.java
+++ b/src/com/google/javascript/jscomp/Compiler.java
@@ -553,7 +553,7 @@
    * base path is interpreted as a filename rather than a directory. E.g.:
    *   getRelativeTo("../foo/bar.js", "baz/bam/qux.js") --> "baz/foo/bar.js"
    */
-  private String getRelativeTo(String relative, String base) {
+  private static String getRelativeTo(String relative, String base) {
     return FileSystems.getDefault().getPath(base)
         .resolveSibling(relative)
         .normalize()
