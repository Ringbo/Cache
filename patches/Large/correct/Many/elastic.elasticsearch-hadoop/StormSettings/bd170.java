diff --git a/storm/src/main/java/org/elasticsearch/storm/cfg/StormSettings.java b/storm/src/main/java/org/elasticsearch/storm/cfg/StormSettings.java
index bfbb0b7..ae26a9b 100644
--- a/storm/src/main/java/org/elasticsearch/storm/cfg/StormSettings.java
+++ b/storm/src/main/java/org/elasticsearch/storm/cfg/StormSettings.java
@@ -105,7 +105,7 @@
         Properties props = new Properties();
 
         if (cfg != null) {
-            for (Entry<Object, Object> entry : props.entrySet()) {
+            for (Entry<Object, Object> entry : cfg.entrySet()) {
                 if (entry.getKey() instanceof String) {
                     props.put(entry.getKey().toString(), entry.getValue().toString());
                 }
