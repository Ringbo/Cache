diff --git a/shield/src/main/java/org/elasticsearch/shield/audit/index/IndexAuditTrail.java b/shield/src/main/java/org/elasticsearch/shield/audit/index/IndexAuditTrail.java
index 27f9bc3..67196f5 100644
--- a/shield/src/main/java/org/elasticsearch/shield/audit/index/IndexAuditTrail.java
+++ b/shield/src/main/java/org/elasticsearch/shield/audit/index/IndexAuditTrail.java
@@ -739,7 +739,7 @@
         Settings.Builder builder = Settings.builder();
         for (Map.Entry<String, String> entry : newSettings.getAsMap().entrySet()) {
             String name = "index." + entry.getKey();
-            if (FORBIDDEN_INDEX_SETTING.contains(name)) {
+            if (FORBIDDEN_INDEX_SETTING.equals(name)) {
                 logger.warn("overriding the default [{}} setting is forbidden. ignoring...", name);
                 continue;
             }
