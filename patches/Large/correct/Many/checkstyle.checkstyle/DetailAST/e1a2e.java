diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/DetailAST.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/DetailAST.java
index 08c0d77..bdb846a 100755
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/DetailAST.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/DetailAST.java
@@ -266,7 +266,7 @@
      * @param ast DetailAST node.
      * @return Column number if non-comment node exists, -1 otherwise.
      */
-    private int findColumnNo(DetailAST ast) {
+    private static int findColumnNo(DetailAST ast) {
         int resultNo = -1;
         DetailAST node = ast;
         while (node != null) {
@@ -288,7 +288,7 @@
      * @param ast DetailAST node.
      * @return Line number if non-comment node exists, -1 otherwise.
      */
-    private int findLineNo(DetailAST ast) {
+    private static int findLineNo(DetailAST ast) {
         int resultNo = -1;
         DetailAST node = ast;
         while (node != null) {
