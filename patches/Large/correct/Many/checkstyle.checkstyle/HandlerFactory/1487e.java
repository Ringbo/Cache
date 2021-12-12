diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/HandlerFactory.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/HandlerFactory.java
index df140be..b0d960c 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/HandlerFactory.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/HandlerFactory.java
@@ -162,7 +162,7 @@
      *
      * @return new instance.
      */
-    AbstractExpressionHandler createMethodCallHandler(IndentationCheck indentCheck,
+    private AbstractExpressionHandler createMethodCallHandler(IndentationCheck indentCheck,
         DetailAST ast, AbstractExpressionHandler parent) {
         AbstractExpressionHandler theParent = parent;
         DetailAST astNode = ast.getFirstChild();
