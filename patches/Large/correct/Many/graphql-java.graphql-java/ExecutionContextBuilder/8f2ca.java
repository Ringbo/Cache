diff --git a/src/main/java/graphql/execution/ExecutionContextBuilder.java b/src/main/java/graphql/execution/ExecutionContextBuilder.java
index 6e83e5f..71385b2 100644
--- a/src/main/java/graphql/execution/ExecutionContextBuilder.java
+++ b/src/main/java/graphql/execution/ExecutionContextBuilder.java
@@ -116,7 +116,7 @@
             operation = operationsByName.get(operationName);
         }
         if (operation == null) {
-            throw new GraphQLException();
+            throw new GraphQLException("no operation found");
         }
         Map<String, Object> variableValues = valuesResolver.getVariableValues(graphQLSchema, operation.getVariableDefinitions(), variables);
 
@@ -130,7 +130,7 @@
                 fragmentsByName,
                 operation,
                 variableValues,
-                root,
-                context);
+                context,
+                root);
     }
 }
