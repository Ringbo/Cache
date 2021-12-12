diff --git a/hbase-client/src/main/java/org/apache/hadoop/hbase/client/Increment.java b/hbase-client/src/main/java/org/apache/hadoop/hbase/client/Increment.java
index 957fcdd..d480e1c 100644
--- a/hbase-client/src/main/java/org/apache/hadoop/hbase/client/Increment.java
+++ b/hbase-client/src/main/java/org/apache/hadoop/hbase/client/Increment.java
@@ -174,7 +174,7 @@
    * @since 0.95.0
    */
   public Map<byte[], NavigableMap<byte [], Long>> getFamilyMapOfLongs() {
-    NavigableMap<byte[], List<? extends Cell>> map = super.getFamilyMap();
+    NavigableMap<byte[], List<? extends Cell>> map = super.getFamilyCellMap();
     Map<byte [], NavigableMap<byte[], Long>> results =
       new TreeMap<byte[], NavigableMap<byte [], Long>>(Bytes.BYTES_COMPARATOR);
     for (Map.Entry<byte [], List<? extends Cell>> entry: map.entrySet()) {
