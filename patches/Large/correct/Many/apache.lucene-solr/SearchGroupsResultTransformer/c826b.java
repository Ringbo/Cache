diff --git a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/SearchGroupsResultTransformer.java b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/SearchGroupsResultTransformer.java
index d1e1da2..9b45b20 100644
--- a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/SearchGroupsResultTransformer.java
+++ b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/SearchGroupsResultTransformer.java
@@ -110,9 +110,9 @@
           if (sortValue instanceof BytesRef) {
             UnicodeUtil.UTF8toUTF16((BytesRef)sortValue, spare);
             String indexedValue = spare.toString();
-            sortValue = (Comparable) fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 0.0f));
+            sortValue = (Comparable) fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 1.0f));
           } else if (sortValue instanceof String) {
-            sortValue = (Comparable) fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 0.0f));
+            sortValue = (Comparable) fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 1.0f));
           }
         }
         convertedSortValues[i] = sortValue;
