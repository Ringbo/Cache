diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
index db1511a..8d5fcda 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
@@ -204,7 +204,7 @@
          * Constructs a stack node for a method definition.
          * @param ast AST for the method definition.
          */
-        public MethodNode(DetailAST ast) {
+        MethodNode(DetailAST ast) {
             method = ast;
             callingSuper = false;
         }
