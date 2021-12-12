diff --git a/src/main/java/graphql/schema/SchemaUtil.java b/src/main/java/graphql/schema/SchemaUtil.java
index 4e316e1..2c3754f 100644
--- a/src/main/java/graphql/schema/SchemaUtil.java
+++ b/src/main/java/graphql/schema/SchemaUtil.java
@@ -146,7 +146,7 @@
     }
 
     GraphQLType resolveTypeReference(GraphQLType type, Map<String, GraphQLType> typeMap) {
-        if (type instanceof GraphQLTypeReference) {
+        if (type instanceof GraphQLTypeReference || typeMap.containsKey(type.getName())) {
             GraphQLType resolvedType = typeMap.get(type.getName());
             if (resolvedType == null) {
                 throw new GraphQLException("type " + type.getName() + " not found in schema");
