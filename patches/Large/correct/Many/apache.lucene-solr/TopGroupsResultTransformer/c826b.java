diff --git a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
index 141f152..710370a 100644
--- a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
+++ b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
@@ -199,9 +199,9 @@
             if (sortValue instanceof BytesRef) {
               UnicodeUtil.UTF8toUTF16((BytesRef)sortValue, spare);
               String indexedValue = spare.toString();
-              sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 0.0f));
+              sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 1.0f));
             } else if (sortValue instanceof String) {
-              sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 0.0f));
+              sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 1.0f));
             }
           }
           convertedSortValues[j] = sortValue;
@@ -252,9 +252,9 @@
           if (sortValue instanceof BytesRef) {
             UnicodeUtil.UTF8toUTF16((BytesRef)sortValue, spare);
             String indexedValue = spare.toString();
-            sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 0.0f));
+            sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable(indexedValue), 1.0f));
           } else if (sortValue instanceof String) {
-            sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 0.0f));
+            sortValue = fieldType.toObject(field.createField(fieldType.indexedToReadable((String) sortValue), 1.0f));
           }
         }
         convertedSortValues[j] = sortValue;
