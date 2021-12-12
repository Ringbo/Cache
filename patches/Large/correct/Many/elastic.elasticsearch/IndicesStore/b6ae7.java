diff --git a/src/main/java/org/elasticsearch/indices/store/IndicesStore.java b/src/main/java/org/elasticsearch/indices/store/IndicesStore.java
index 9291874..f4985c2 100644
--- a/src/main/java/org/elasticsearch/indices/store/IndicesStore.java
+++ b/src/main/java/org/elasticsearch/indices/store/IndicesStore.java
@@ -95,7 +95,7 @@
         // we limit with 20MB / sec by default with a default type set to merge sice 0.90.1
         this.rateLimitingType = componentSettings.get("throttle.type", StoreRateLimiting.Type.MERGE.name());
         rateLimiting.setType(rateLimitingType);
-        this.rateLimitingThrottle = componentSettings.getAsBytesSize("throttle.max_bytes_per_sec", new ByteSizeValue(50, ByteSizeUnit.MB));
+        this.rateLimitingThrottle = componentSettings.getAsBytesSize("throttle.max_bytes_per_sec", new ByteSizeValue(20, ByteSizeUnit.MB));
         rateLimiting.setMaxRate(rateLimitingThrottle);
 
         logger.debug("using indices.store.throttle.type [{}], with index.store.throttle.max_bytes_per_sec [{}]", rateLimitingType, rateLimitingThrottle);
