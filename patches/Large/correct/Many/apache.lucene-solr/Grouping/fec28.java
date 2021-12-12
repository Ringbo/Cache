diff --git a/solr/core/src/java/org/apache/solr/search/Grouping.java b/solr/core/src/java/org/apache/solr/search/Grouping.java
index 2a41d43..0d4c612 100755
--- a/solr/core/src/java/org/apache/solr/search/Grouping.java
+++ b/solr/core/src/java/org/apache/solr/search/Grouping.java
@@ -787,7 +787,7 @@
           SchemaField schemaField = searcher.getSchema().getField(groupBy);
           FieldType fieldType = schemaField.getType();
           String readableValue = fieldType.indexedToReadable(group.groupValue.utf8ToString());
-          IndexableField field = schemaField.createField(readableValue, 0.0f);
+          IndexableField field = schemaField.createField(readableValue, 1.0f);
           nl.add("groupValue", fieldType.toObject(field));
         } else {
           nl.add("groupValue", null);
