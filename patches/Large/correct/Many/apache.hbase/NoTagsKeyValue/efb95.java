diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsKeyValue.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsKeyValue.java
index 8a57a01..088aff5 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsKeyValue.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/NoTagsKeyValue.java
@@ -51,7 +51,7 @@
   }
 
   @Override
-  public Cell deepClone() {
+  public ExtendedCell deepClone() {
     byte[] copy = Bytes.copy(this.bytes, this.offset, this.length);
     KeyValue kv = new NoTagsKeyValue(copy, 0, copy.length);
     kv.setSequenceId(this.getSequenceId());
