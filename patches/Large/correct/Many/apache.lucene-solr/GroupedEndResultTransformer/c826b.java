diff --git a/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java b/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
index 94e64ce..a531d8b 100644
--- a/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
+++ b/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
@@ -69,7 +69,7 @@
           SimpleOrderedMap<Object> groupResult = new SimpleOrderedMap<Object>();
           if (group.groupValue != null) {
             groupResult.add(
-                "groupValue", groupFieldType.toObject(groupField.createField(group.groupValue.utf8ToString(), 0.0f))
+                "groupValue", groupFieldType.toObject(groupField.createField(group.groupValue.utf8ToString(), 1.0f))
             );
           } else {
             groupResult.add("groupValue", null);
