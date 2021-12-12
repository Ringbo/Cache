diff --git a/plugin/src/test/java/org/elasticsearch/xpack/deprecation/DeprecationInfoActionResponseTests.java b/plugin/src/test/java/org/elasticsearch/xpack/deprecation/DeprecationInfoActionResponseTests.java
index b79ff69..504cf65 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/deprecation/DeprecationInfoActionResponseTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/deprecation/DeprecationInfoActionResponseTests.java
@@ -79,7 +79,7 @@
             null, null, null, null, null, null));
         List<NodeStats> nodeStats = Collections.singletonList(new NodeStats(discoveryNode, 0L, null,
             null, null, null, null, null, null, null, null,
-            null, null, null));
+            null, null, null, null));
         IndexNameExpressionResolver resolver = new IndexNameExpressionResolver(Settings.EMPTY);
         IndicesOptions indicesOptions = IndicesOptions.fromOptions(false, false,
             true, true);
