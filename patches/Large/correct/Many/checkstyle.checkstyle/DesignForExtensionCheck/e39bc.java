diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/DesignForExtensionCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/DesignForExtensionCheck.java
index d02f1a8..c2c5fd7 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/DesignForExtensionCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/design/DesignForExtensionCheck.java
@@ -157,7 +157,7 @@
      * @param methodDef method definition token.
      * @return true if a method has a javadoc comment.
      */
-    private boolean hasJavadocComment(DetailAST methodDef) {
+    private static boolean hasJavadocComment(DetailAST methodDef) {
         final DetailAST modifiers = methodDef.findFirstToken(TokenTypes.MODIFIERS);
         return modifiers.branchContains(TokenTypes.BLOCK_COMMENT_BEGIN);
     }
@@ -167,7 +167,7 @@
      * @param ast method definition token.
      * @return true if a methods is native.
      */
-    private boolean isNativeMethod(DetailAST ast) {
+    private static boolean isNativeMethod(DetailAST ast) {
         final DetailAST mods = ast.findFirstToken(TokenTypes.MODIFIERS);
         return mods.branchContains(TokenTypes.LITERAL_NATIVE);
     }
@@ -201,7 +201,7 @@
      * @param methodDef method definition token.
      * @return true if a method can be overridden in a subclass.
      */
-    private boolean canBeOverridden(DetailAST methodDef) {
+    private static boolean canBeOverridden(DetailAST methodDef) {
         final DetailAST modifiers = methodDef.findFirstToken(TokenTypes.MODIFIERS);
         return ScopeUtils.getSurroundingScope(methodDef).isIn(Scope.PROTECTED)
             && !ScopeUtils.isInInterfaceOrAnnotationBlock(methodDef)
