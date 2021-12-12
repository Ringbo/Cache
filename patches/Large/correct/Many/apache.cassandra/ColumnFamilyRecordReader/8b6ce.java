diff --git a/src/java/org/apache/cassandra/hadoop/ColumnFamilyRecordReader.java b/src/java/org/apache/cassandra/hadoop/ColumnFamilyRecordReader.java
index 20d6068..aac61ad 100644
--- a/src/java/org/apache/cassandra/hadoop/ColumnFamilyRecordReader.java
+++ b/src/java/org/apache/cassandra/hadoop/ColumnFamilyRecordReader.java
@@ -416,7 +416,7 @@
         {
             key.clear();
             key.put(this.getCurrentKey());
-            key.rewind();
+            key.flip();
 
             value.clear();
             value.putAll(this.getCurrentValue());
