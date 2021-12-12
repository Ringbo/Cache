diff --git a/src/main/java/graphql/execution/ExecutionStrategy.java b/src/main/java/graphql/execution/ExecutionStrategy.java
index 73dae6f..12ec173 100644
--- a/src/main/java/graphql/execution/ExecutionStrategy.java
+++ b/src/main/java/graphql/execution/ExecutionStrategy.java
@@ -219,13 +219,13 @@
         return result;
     }
 
-    protected ExecutionResult completeValueForEnum(GraphQLEnumType enumType, ExecutionSParameters parameters, Object result) {
+    protected ExecutionResult completeValueForEnum(GraphQLEnumType enumType, ExecutionStrategyParameters parameters, Object result) {
         Object serialized = enumType.getCoercing().serialize(result);
         serialized = parameters.nonNullFieldValidator().validate(serialized);
         return new ExecutionResultImpl(serialized, null);
     }
 
-    protected ExecutionResult completeValueForScalar(GraphQLScalarType scalarType, ExecutionParameters parameters, Object result) {
+    protected ExecutionResult completeValueForScalar(GraphQLScalarType scalarType, ExecutionStrategyParameters parameters, Object result) {
         Object serialized = scalarType.getCoercing().serialize(result);
         //6.6.1 http://facebook.github.io/graphql/#sec-Field-entries
         if (serialized instanceof Double && ((Double) serialized).isNaN()) {
