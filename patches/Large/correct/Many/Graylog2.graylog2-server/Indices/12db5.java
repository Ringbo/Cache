diff --git a/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java b/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
index ca08bae..241a2cb 100644
--- a/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
+++ b/graylog2-server/src/main/java/org/graylog2/indexer/indices/Indices.java
@@ -571,7 +571,7 @@
                 .path("primaries")
                 .path("store")
                 .path("size_in_bytes");
-        return Optional.of(sizeInBytes).filter(JsonNode::isLong).map(JsonNode::asLong);
+        return Optional.of(sizeInBytes).filter(JsonNode::isNumber).map(JsonNode::asLong);
     }
 
     public Set<IndexStatistics> getIndicesStats(final IndexSet indexSet) {
