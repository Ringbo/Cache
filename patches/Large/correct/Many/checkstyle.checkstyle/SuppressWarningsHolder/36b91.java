diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
index cf423bb..50af412 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
@@ -306,7 +306,7 @@
      * @return get target of annotation
      */
     private static DetailAST getAnnotationTarget(DetailAST ast) {
-        DetailAST targetAST;
+        final DetailAST targetAST;
         final DetailAST parentAST = ast.getParent();
         switch (parentAST.getType()) {
             case TokenTypes.MODIFIERS:
