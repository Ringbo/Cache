diff --git a/src/java/org/apache/cassandra/db/DefsTable.java b/src/java/org/apache/cassandra/db/DefsTable.java
index c258d0b..78c3b1b 100644
--- a/src/java/org/apache/cassandra/db/DefsTable.java
+++ b/src/java/org/apache/cassandra/db/DefsTable.java
@@ -89,7 +89,7 @@
             throw new RuntimeException("Cannot read system table! Are you upgrading a pre-release version?");
 
         ByteBuffer value = avroschema.value();
-        Schema schema = Schema.parse(ByteBufferUtil.string(value, value.position(), value.remaining()));
+        Schema schema = Schema.parse(ByteBufferUtil.string(value));
 
         // deserialize keyspaces using schema
         Collection<KSMetaData> keyspaces = new ArrayList<KSMetaData>();
