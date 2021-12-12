diff --git a/marvel/src/main/java/org/elasticsearch/marvel/agent/collector/AbstractCollector.java b/marvel/src/main/java/org/elasticsearch/marvel/agent/collector/AbstractCollector.java
index 0f461a4..76c44e2 100644
--- a/marvel/src/main/java/org/elasticsearch/marvel/agent/collector/AbstractCollector.java
+++ b/marvel/src/main/java/org/elasticsearch/marvel/agent/collector/AbstractCollector.java
@@ -58,7 +58,7 @@
      * Indicates if the current collector is allowed to collect data
      */
     protected boolean shouldCollect() {
-        if (licensee.collectionEnabled()) {
+        if (!licensee.collectionEnabled()) {
             logger.trace("collector [{}] can not collect data due to invalid license", name());
             return false;
         }
