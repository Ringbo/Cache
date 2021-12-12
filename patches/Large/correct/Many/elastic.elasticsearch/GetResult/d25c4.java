diff --git a/src/main/java/org/elasticsearch/index/get/GetResult.java b/src/main/java/org/elasticsearch/index/get/GetResult.java
index b8d9f8f..04a2aed 100644
--- a/src/main/java/org/elasticsearch/index/get/GetResult.java
+++ b/src/main/java/org/elasticsearch/index/get/GetResult.java
@@ -309,7 +309,7 @@
     @Override
     public void readFrom(StreamInput in) throws IOException {
         index = in.readUTF();
-        type = in.readUTF();
+        type = in.readOptionalUTF();
         id = in.readUTF();
         version = in.readLong();
         exists = in.readBoolean();
@@ -334,7 +334,7 @@
     @Override
     public void writeTo(StreamOutput out) throws IOException {
         out.writeUTF(index);
-        out.writeUTF(type);
+        out.writeOptionalUTF(type);
         out.writeUTF(id);
         out.writeLong(version);
         out.writeBoolean(exists);
