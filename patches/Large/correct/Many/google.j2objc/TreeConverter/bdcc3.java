diff --git a/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java b/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
index cf2d624..425b7cc 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/javac/TreeConverter.java
@@ -646,14 +646,15 @@
 
   private TreeNode convertEnhancedForStatement(JCTree.JCEnhancedForLoop node) {
     return new EnhancedForStatement()
-        .setParameter((SingleVariableDeclaration) convertSingleVariable(node.getVariable()))
+        .setParameter((SingleVariableDeclaration) convertSingleVariable(node.getVariable())
+            .setPosition(getPosition(node)))
         .setExpression((Expression) convert(node.getExpression()))
         .setBody((Statement) convert(node.getStatement()));
   }
 
   private TreeNode convertEnum(JCTree.JCClassDecl node) {
     if (node.sym.isAnonymous()) {
-      return (TypeDeclaration) convertClassDeclaration(node);
+      return convertClassDeclaration(node).setPosition(getPosition(node));
     }
     EnumDeclaration newNode = (EnumDeclaration) new EnumDeclaration();
     convertBodyDeclaration(node, node.getModifiers(), newNode, node.sym);
@@ -728,7 +729,7 @@
     }
     if (node.getIdentifier().toString().equals("class")) {
       return new TypeLiteral(node.type)
-          .setType((Type) convertType(selected.type, pos, false));
+          .setType((Type) convertType(selected.type, pos, false).setPosition(getPosition(node)));
     }
     if (selected.getKind() == Kind.IDENTIFIER && !node.sym.getKind().isField()) {
       JCIdent ident = (JCTree.JCIdent) selected;
@@ -1029,7 +1030,7 @@
     PackageDeclaration newNode = new PackageDeclaration()
         .setPackageElement(pkg);
     for (JCTree.JCAnnotation pkgAnnotation : unit.getPackageAnnotations()) {
-      newNode.addAnnotation((Annotation) convertAnnotation(pkgAnnotation));
+      newNode.addAnnotation((Annotation) convert(pkgAnnotation));
     }
     return (PackageDeclaration) newNode.setName(convertName((PackageSymbol) pkg, getPosition(node)))
         .setJavadoc((Javadoc) getAssociatedJavaDoc(unit, pkg))
@@ -1081,8 +1082,9 @@
 
   private TreeNode convertSynchronized(JCTree.JCSynchronized node) {
     return new SynchronizedStatement()
-        .setExpression((Expression) convertWithoutParens(node.getExpression()))
-        .setBody((Block) convertBlock(node.getBlock()));
+        .setExpression((Expression) convertWithoutParens(node.getExpression())
+            .setPosition(getPosition(node)))
+        .setBody((Block) convert(node.getBlock()));
   }
 
   private TreeNode convertThrow(JCTree.JCThrow node) {
