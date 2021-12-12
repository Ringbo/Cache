diff --git a/src/main/java/org/elasticsearch/index/store/support/AbstractIndexStore.java b/src/main/java/org/elasticsearch/index/store/support/AbstractIndexStore.java
index 6c4bc59..5fea4f8 100644
--- a/src/main/java/org/elasticsearch/index/store/support/AbstractIndexStore.java
+++ b/src/main/java/org/elasticsearch/index/store/support/AbstractIndexStore.java
@@ -45,7 +45,7 @@
     class ApplySettings implements IndexSettingsService.Listener {
         @Override
         public void onRefreshSettings(Settings settings) {
-            String rateLimitingType = indexSettings.get(INDEX_STORE_THROTTLE_TYPE, AbstractIndexStore.this.rateLimitingType);
+            String rateLimitingType = settings.get(INDEX_STORE_THROTTLE_TYPE, AbstractIndexStore.this.rateLimitingType);
             if (!rateLimitingType.equals(AbstractIndexStore.this.rateLimitingType)) {
                 logger.info("updating index.store.throttle.type from [{}] to [{}]", AbstractIndexStore.this.rateLimitingType, rateLimitingType);
                 if (rateLimitingType.equalsIgnoreCase("node")) {
