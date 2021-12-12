diff --git a/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacTreeRefScanner.java b/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacTreeRefScanner.java
index 196d3d1..6587fbe 100644
--- a/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacTreeRefScanner.java
+++ b/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacTreeRefScanner.java
@@ -120,7 +120,7 @@
   public Tree visitMethodInvocation(MethodInvocationTree node, JavacReferenceCollectorListener.ReferenceCollector collector) {
     if (node.getMethodSelect() instanceof IdentifierTree) {
       Element element = collector.getReferencedElement(node.getMethodSelect());
-      if (element.getKind() != ElementKind.CONSTRUCTOR) {
+      if (element != null && element.getKind() != ElementKind.CONSTRUCTOR) {
         Set<Modifier> modifiers = element.getModifiers();
         if (!modifiers.contains(Modifier.STATIC) && !modifiers.contains(Modifier.PRIVATE)) {
           TypeElement currentClass = myCurrentEnclosingElement.peek();
