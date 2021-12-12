diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
index a2e98c7..2aba2ac 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
@@ -497,7 +497,7 @@
 
     protected R createRecord(Data key, Object value, long expiryTime,
                              long now, boolean disableWriteThrough, int completionId, String origin) {
-        R record = createRecord(value, expiryTime);
+        R record = createRecord(value, now, expiryTime);
         try {
             doPutRecord(key, record);
         } catch (Throwable error) {
