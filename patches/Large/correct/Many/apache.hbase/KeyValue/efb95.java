diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/KeyValue.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/KeyValue.java
index 0ee8b80..ae95738 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/KeyValue.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/KeyValue.java
@@ -2808,7 +2808,7 @@
   }
 
   @Override
-  public Cell deepClone() {
+  public ExtendedCell deepClone() {
     byte[] copy = Bytes.copy(this.bytes, this.offset, this.length);
     KeyValue kv = new KeyValue(copy, 0, copy.length);
     kv.setSequenceId(this.getSequenceId());
