diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index c38d9fb..5f7f1a2 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -459,7 +459,8 @@
     private void inferDiamondType(final ConstructorCallExpression cce, final ClassNode lType) {
         // check if constructor call expression makes use of the diamond operator
         ClassNode node = cce.getType();
-        if (node.isUsingGenerics() && node instanceof InnerClassNode && ((InnerClassNode) node).isAnonymous()) {
+        if (node.isUsingGenerics() && node instanceof InnerClassNode && ((InnerClassNode) node).isAnonymous()
+                && (node.getGenericsTypes()==null || node.getGenericsTypes().length==0) && lType.isUsingGenerics()) {
             // InterfaceA<Foo> obj = new InterfaceA<>() { ... }
             // InterfaceA<Foo> obj = new ClassA<>() { ... }
             // ClassA<Foo> obj = new ClassA<>() { ... }
