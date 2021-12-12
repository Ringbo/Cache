diff --git a/hazelcast/src/main/java/com/hazelcast/map/record/DataRecord.java b/hazelcast/src/main/java/com/hazelcast/map/record/DataRecord.java
index 1d296a2..5761963 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/record/DataRecord.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/record/DataRecord.java
@@ -22,12 +22,12 @@
 
     protected Data value;
 
-    public DataRecord(Data keyData, Data value) {
+    DataRecord(Data keyData, Data value) {
         super(keyData);
         this.value = value;
     }
 
-    public DataRecord() {
+    DataRecord() {
     }
 
     /*
