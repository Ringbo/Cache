diff --git a/wire-java-generator/src/main/java/com/squareup/wire/java/JavaGenerator.java b/wire-java-generator/src/main/java/com/squareup/wire/java/JavaGenerator.java
index 6649048..0e6498b 100644
--- a/wire-java-generator/src/main/java/com/squareup/wire/java/JavaGenerator.java
+++ b/wire-java-generator/src/main/java/com/squareup/wire/java/JavaGenerator.java
@@ -195,7 +195,7 @@
       ImmutableMap<ProtoType, ClassName> protoTypeToCustomJavaName,
       ImmutableMap<ProtoType, AdapterConstant> protoTypeToAdapterConstant) {
     if (!this.nameToProtoFieldsJavaName.isEmpty()) {
-      throw new IllegalStateException();
+      throw new IllegalStateException("Redefining custom proto adapter is illegal.");
     }
 
     Map<ProtoType, ClassName> nameToJavaName = new LinkedHashMap<>(this.nameToJavaName);
