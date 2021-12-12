diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/comments/CompareTreesWithComments.java b/src/test/java/com/puppycrawl/tools/checkstyle/comments/CompareTreesWithComments.java
index 7d72aef..30345e8 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/comments/CompareTreesWithComments.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/comments/CompareTreesWithComments.java
@@ -23,7 +23,7 @@
         Assert.assertTrue(isAstEquals(expectedTree, aRootAST));
     }
 
-    private boolean isAstEquals(DetailAST expected, DetailAST actual) {
+    private static boolean isAstEquals(DetailAST expected, DetailAST actual) {
         boolean result = false;
         if (expected == actual) {
             result = true;
