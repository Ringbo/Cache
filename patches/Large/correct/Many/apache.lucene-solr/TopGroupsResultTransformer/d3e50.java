diff --git a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
index dd39630..b67dae1 100644
--- a/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
+++ b/solr/core/src/java/org/apache/solr/search/grouping/distributed/shardresultserializer/TopGroupsResultTransformer.java
@@ -184,7 +184,7 @@
         documents.add(document);
 
         Document doc = retrieveDocument(uniqueField, searchGroup.scoreDocs[i].doc);
-        document.add("id", uniqueField.getType().toObject(doc.getField(uniqueField.getName())));
+        document.add("id", uniqueField.getType().toExternal(doc.getField(uniqueField.getName())));
         if (!Float.isNaN(searchGroup.scoreDocs[i].score))  {
           document.add("score", searchGroup.scoreDocs[i].score);
         }
@@ -237,7 +237,7 @@
       documents.add(document);
 
       Document doc = retrieveDocument(uniqueField, scoreDoc.doc);
-      document.add("id", uniqueField.getType().toObject(doc.getField(uniqueField.getName())));
+      document.add("id", uniqueField.getType().toExternal(doc.getField(uniqueField.getName())));
       if (rb.getGroupingSpec().isNeedScore())  {
         document.add("score", scoreDoc.score);
       }
