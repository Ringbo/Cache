diff --git a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
index 6087ecb..5192d90 100644
--- a/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
+++ b/src/main/org/codehaus/groovy/antlr/AntlrParserPlugin.java
@@ -741,7 +741,7 @@
 
     protected AnnotationNode annotation(AST annotationNode) {
         AST node = annotationNode.getFirstChild();
-        String name = identifier(node);
+        String name = qualifiedName(node);
         AnnotationNode annotatedNode = new AnnotationNode(ClassHelper.make(name));
         configureAST(annotatedNode, node);
         while (true) {
