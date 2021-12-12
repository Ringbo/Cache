diff --git a/presto-main/src/main/java/com/facebook/presto/metadata/FunctionRegistry.java b/presto-main/src/main/java/com/facebook/presto/metadata/FunctionRegistry.java
index 5d27047..826451f 100644
--- a/presto-main/src/main/java/com/facebook/presto/metadata/FunctionRegistry.java
+++ b/presto-main/src/main/java/com/facebook/presto/metadata/FunctionRegistry.java
@@ -331,7 +331,7 @@
         return Iterables.any(functions.get(name), ParametricFunction::isAggregate);
     }
 
-    public FunctionInfo resolveFunction(QualifiedName name, List<TypeSignature> parameterTypes, final boolean approximate)
+    public FunctionInfo resolveFunction(QualifiedName name, List<TypeSignature> parameterTypes, boolean approximate)
     {
         List<ParametricFunction> candidates = functions.get(name).stream()
                 .filter(function -> function.isScalar() || function.isApproximate() == approximate)
@@ -444,7 +444,7 @@
     @VisibleForTesting
     public List<ParametricFunction> listOperators()
     {
-        final Set<String> operatorNames = Arrays.asList(OperatorType.values()).stream()
+        Set<String> operatorNames = Arrays.asList(OperatorType.values()).stream()
                 .map(FunctionRegistry::mangleOperatorName)
                 .collect(toImmutableSet());
 
