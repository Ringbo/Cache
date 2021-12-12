diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/action/admin/indices/stats/IndicesStats.java b/modules/elasticsearch/src/main/java/org/elasticsearch/action/admin/indices/stats/IndicesStats.java
index 624bf14..66809ea 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/action/admin/indices/stats/IndicesStats.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/action/admin/indices/stats/IndicesStats.java
@@ -159,7 +159,7 @@
         builder.endObject();
 
         builder.startObject("total");
-        primaries().toXContent(builder, params);
+        total().toXContent(builder, params);
         builder.endObject();
 
         builder.startObject(Fields.INDICES);
