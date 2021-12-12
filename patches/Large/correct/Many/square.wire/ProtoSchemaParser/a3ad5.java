diff --git a/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java b/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
index 4192eed..ef6a733 100644
--- a/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
+++ b/protoparser/src/main/java/com/squareup/proto/ProtoSchemaParser.java
@@ -79,7 +79,7 @@
     return writer.toCharArray();
   }
 
-  public ProtoFile readProtoFile() {
+  ProtoFile readProtoFile() {
     while (true) {
       String documentation = readDocumentation();
       if (pos == data.length) {
