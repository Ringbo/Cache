diff --git a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
index 71b45a4..5f8519d 100644
--- a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
+++ b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
@@ -209,7 +209,7 @@
                         .field("query_field2", queryBuilder)
                         .endObject().bytes()
         );
-        assertThat(doc.rootDoc().getFields().size(), equalTo(22)); // also includes all other meta fields
+        assertThat(doc.rootDoc().getFields().size(), equalTo(24)); // also includes all other meta fields
         BytesRef queryBuilderAsBytes = doc.rootDoc().getField("query_field1.query_builder_field").binaryValue();
         assertQueryBuilder(queryBuilderAsBytes, queryBuilder);
 
