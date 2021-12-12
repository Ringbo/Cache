diff --git a/hazelcast/src/main/java/com/hazelcast/map/record/DataRecordWithStats.java b/hazelcast/src/main/java/com/hazelcast/map/record/DataRecordWithStats.java
index 7df635f..33d038c 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/record/DataRecordWithStats.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/record/DataRecordWithStats.java
@@ -22,7 +22,7 @@
 
     protected Data value;
 
-    public DataRecordWithStats(Data keyData, Data value) {
+    DataRecordWithStats(Data keyData, Data value) {
         super(keyData);
         this.value = value;
     }
