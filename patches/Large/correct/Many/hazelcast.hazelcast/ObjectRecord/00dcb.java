diff --git a/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecord.java b/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecord.java
index 4123557..3bc66f3 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecord.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/record/ObjectRecord.java
@@ -22,10 +22,10 @@
 
     private Object value;
 
-    public ObjectRecord() {
+    ObjectRecord() {
     }
 
-    public ObjectRecord(Data key, Object value) {
+    ObjectRecord(Data key, Object value) {
         super(key);
         this.value = value;
     }
