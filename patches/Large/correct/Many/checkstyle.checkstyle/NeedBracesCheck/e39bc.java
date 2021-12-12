diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/blocks/NeedBracesCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/blocks/NeedBracesCheck.java
index d63d573..9ff376a 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/blocks/NeedBracesCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/blocks/NeedBracesCheck.java
@@ -219,7 +219,7 @@
      * @param ast ast to test.
      * @return true if current ast is default and it is part of annotation.
      */
-    private boolean isDefaultInAnnotation(DetailAST ast) {
+    private static boolean isDefaultInAnnotation(DetailAST ast) {
         boolean isDefaultInAnnotation = false;
         if (ast.getType() == TokenTypes.LITERAL_DEFAULT
                 && ast.getParent().getType() == TokenTypes.ANNOTATION_FIELD_DEF) {
