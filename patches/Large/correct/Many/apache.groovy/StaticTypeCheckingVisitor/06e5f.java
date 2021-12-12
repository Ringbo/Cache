diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index fdbf350..1ca5429 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -3593,7 +3593,7 @@
         return null;
     }
 
-    private static ClassNode inferSAMTypeGenericsInAssignment(ClassNode samUsage, MethodNode sam, ClassNode closureType, ClosureExpression closureExpression) {
+    private ClassNode inferSAMTypeGenericsInAssignment(ClassNode samUsage, MethodNode sam, ClassNode closureType, ClosureExpression closureExpression) {
         // if the sam type or closure type do not provide generics information, 
         // we cannot infer anything, thus we simply return the provided samUsage
         GenericsType[] samGt = samUsage.getGenericsTypes();
@@ -3602,7 +3602,7 @@
 
         // extract the generics from the return type
         Map<String,GenericsType> connections = new HashMap<String,GenericsType>();
-        extractGenericsConnections(connections,closureType,sam.getReturnType());
+        extractGenericsConnections(connections, getInferredReturnType(closureExpression),sam.getReturnType());
 
         // next we get the block parameter types and set the generics 
         // information just like before
