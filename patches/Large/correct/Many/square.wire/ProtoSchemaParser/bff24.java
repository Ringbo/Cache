diff --git a/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java b/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
index 5c3e9ed..2e27f05 100644
--- a/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
+++ b/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
@@ -82,7 +82,7 @@
     return writer.toCharArray();
   }
 
-  public ProtoFile readProtoFile() {
+  ProtoFile readProtoFile() {
     while (true) {
       String documentation = readDocumentation();
       if (pos == data.length) {
