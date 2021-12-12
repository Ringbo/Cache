diff --git a/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java b/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
index 192e1fa..7d061ee 100644
--- a/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/cache/impl/AbstractCacheRecordStore.java
@@ -294,7 +294,8 @@
         }
         doRemoveRecord(key, source);
         if (isEventsEnabled()) {
-            publishEvent(createCacheExpiredEvent(key, toEventData(record), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+            publishEvent(createCacheExpiredEvent(toEventData(key), toEventData(record),
+                                                 CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                  origin, IGNORE_COMPLETION));
         }
         return true;
@@ -318,7 +319,8 @@
         }
         doRemoveRecord(key, source);
         if (isEventsEnabled()) {
-            publishEvent(createCacheExpiredEvent(key, toEventData(record), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+            publishEvent(createCacheExpiredEvent(toEventData(key), toEventData(record),
+                                                 CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                  origin, IGNORE_COMPLETION));
         }
         return null;
@@ -378,7 +380,7 @@
                 record.setExpirationTime(expiryTime);
                 if (isEventsEnabled()) {
                     CacheEventContext cacheEventContext =
-                            createBaseEventContext(CacheEventType.EXPIRATION_TIME_UPDATED, toHeapData(key),
+                            createBaseEventContext(CacheEventType.EXPIRATION_TIME_UPDATED, toEventData(key),
                                                    toEventData(record.getValue()), expiryTime, null, IGNORE_COMPLETION);
                     cacheEventContext.setAccessHit(record.getAccessHit());
                     publishEvent(cacheEventContext);
@@ -493,7 +495,8 @@
         final R record = createRecord(value, expirationTime);
         updateHasExpiringEntry(record);
         if (isEventsEnabled()) {
-            publishEvent(createCacheCreatedEvent(keyData, toEventData(value), expirationTime, origin, completionId));
+            publishEvent(createCacheCreatedEvent(toEventData(keyData), toEventData(value),
+                                                 expirationTime, origin, completionId));
         }
         return record;
     }
@@ -514,7 +517,7 @@
             return record;
         }
         if (isEventsEnabled()) {
-            publishEvent(createCacheCompleteEvent(key, CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+            publishEvent(createCacheCompleteEvent(toEventData(key), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                   origin, completionId));
         }
         return null;
@@ -1002,7 +1005,7 @@
             } else {
                 result = false;
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, completionId));
+                    publishEvent(createCacheCompleteEvent(toEventData(key), completionId));
                 }
             }
             onPutIfAbsent(key, value, expiryPolicy, source, disableWriteThrough,
@@ -1046,7 +1049,7 @@
             if (record == null || isExpired) {
                 replaced = false;
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, completionId));
+                    publishEvent(createCacheCompleteEvent(toEventData(key), completionId));
                 }
             } else {
                 replaced = updateRecordWithExpiry(key, value, record, expiryPolicy,
@@ -1099,7 +1102,7 @@
             }
             if (!replaced) {
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, completionId));
+                    publishEvent(createCacheCompleteEvent(toEventData(key), completionId));
                 }
             }
             onReplace(key, oldValue, newValue, expiryPolicy, source, false, record, isExpired, replaced);
@@ -1131,7 +1134,7 @@
                 obj = null;
                 replaced = false;
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, completionId));
+                    publishEvent(createCacheCompleteEvent(toEventData(key), completionId));
                 }
             } else {
                 replaced = updateRecordWithExpiry(key, value, record, expiryPolicy,
@@ -1182,7 +1185,7 @@
             if (record == null || isExpired) {
                 removed = false;
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+                    publishEvent(createCacheCompleteEvent(toEventData(key), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                           origin, completionId));
                 }
             } else {
@@ -1235,7 +1238,7 @@
             }
             if (!removed) {
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+                    publishEvent(createCacheCompleteEvent(toEventData(key), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                           origin, completionId));
                 }
             }
@@ -1284,7 +1287,7 @@
                 obj = null;
                 removed = false;
                 if (isEventsEnabled()) {
-                    publishEvent(createCacheCompleteEvent(key, CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
+                    publishEvent(createCacheCompleteEvent(toEventData(key), CacheRecord.EXPIRATION_TIME_NOT_AVAILABLE,
                                                           origin, completionId));
                 }
             } else {
