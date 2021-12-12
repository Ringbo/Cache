diff --git a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
index 3a3ddb0..e928e75 100644
--- a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
+++ b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolatorFieldMapperTests.java
@@ -215,7 +215,7 @@
                         .field("query_field2", queryBuilder)
                         .endObject().bytes()
         );
-        assertThat(doc.rootDoc().getFields().size(), equalTo(24)); // also includes all other meta fields
+        assertThat(doc.rootDoc().getFields().size(), equalTo(12)); // also includes all other meta fields
         BytesRef queryBuilderAsBytes = doc.rootDoc().getField("query_field1.query_builder_field").binaryValue();
         assertQueryBuilder(queryBuilderAsBytes, queryBuilder);
 
@@ -245,7 +245,7 @@
                             .field("query_field", queryBuilder)
                         .endObject().endObject().bytes()
         );
-        assertThat(doc.rootDoc().getFields().size(), equalTo(20)); // also includes all other meta fields
+        assertThat(doc.rootDoc().getFields().size(), equalTo(9)); // also includes all other meta fields
         BytesRef queryBuilderAsBytes = doc.rootDoc().getField("object_field.query_field.query_builder_field").binaryValue();
         assertQueryBuilder(queryBuilderAsBytes, queryBuilder);
 
@@ -256,7 +256,7 @@
                             .endArray()
                         .endObject().bytes()
         );
-        assertThat(doc.rootDoc().getFields().size(), equalTo(20)); // also includes all other meta fields
+        assertThat(doc.rootDoc().getFields().size(), equalTo(9)); // also includes all other meta fields
         queryBuilderAsBytes = doc.rootDoc().getField("object_field.query_field.query_builder_field").binaryValue();
         assertQueryBuilder(queryBuilderAsBytes, queryBuilder);
 
