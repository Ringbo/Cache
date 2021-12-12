diff --git a/hbase-common/src/main/java/org/apache/hadoop/hbase/IndividualBytesFieldCell.java b/hbase-common/src/main/java/org/apache/hadoop/hbase/IndividualBytesFieldCell.java
index 0597c5e..14e35df 100644
--- a/hbase-common/src/main/java/org/apache/hadoop/hbase/IndividualBytesFieldCell.java
+++ b/hbase-common/src/main/java/org/apache/hadoop/hbase/IndividualBytesFieldCell.java
@@ -183,7 +183,7 @@
   }
 
   @Override
-  public Cell deepClone() {
+  public ExtendedCell deepClone() {
     // When being added to the memstore, deepClone() is called and KeyValue has less heap overhead.
     return new KeyValue(this);
   }
