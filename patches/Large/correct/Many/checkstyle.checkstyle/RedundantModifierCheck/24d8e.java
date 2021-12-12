diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/RedundantModifierCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/RedundantModifierCheck.java
index 99e9cca..8468de9 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/RedundantModifierCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/modifier/RedundantModifierCheck.java
@@ -192,7 +192,7 @@
      * @param ast AST node
      * @return true if it is an enum member
      */
-    private boolean isEnumMember(DetailAST ast) {
+    private static boolean isEnumMember(DetailAST ast) {
         final DetailAST parentTypeDef = ast.getParent().getParent();
         return parentTypeDef.getType() == TokenTypes.ENUM_DEF;
     }
