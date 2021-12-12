diff --git a/src/main/java/graphql/execution/InputMapDefinesTooManyFieldsException.java b/src/main/java/graphql/execution/InputMapDefinesTooManyFieldsException.java
index 30bb61a..0a1e308 100644
--- a/src/main/java/graphql/execution/InputMapDefinesTooManyFieldsException.java
+++ b/src/main/java/graphql/execution/InputMapDefinesTooManyFieldsException.java
@@ -12,7 +12,7 @@
 public class InputMapDefinesTooManyFieldsException extends GraphQLException {
 
     public InputMapDefinesTooManyFieldsException(GraphQLType graphQLType, String fieldName) {
-        super(String.format("The variables input contains a field name '%s' that is not defined for input object type '%s' ", GraphQLTypeUtil.getUnwrappedTypeName(graphQLType), fieldName));
+        super(String.format("The variables input contains a field name '%s' that is not defined for input object type '%s' ", fieldName, GraphQLTypeUtil.getUnwrappedTypeName(graphQLType)));
     }
 
 }
