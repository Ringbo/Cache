diff --git a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestRaptorMetadata.java b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestRaptorMetadata.java
index 0e700db..613bc44 100644
--- a/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestRaptorMetadata.java
+++ b/presto-raptor/src/test/java/com/facebook/presto/raptor/metadata/TestRaptorMetadata.java
@@ -687,7 +687,7 @@
         return buildTable(properties, tableMetadataBuilder(DEFAULT_TEST_LINEITEMS)
                 .column("orderkey", BIGINT)
                 .column("partkey", BIGINT)
-                .column("quantity", BIGINT)
+                .column("quantity", DOUBLE)
                 .column("price", DOUBLE));
     }
 
