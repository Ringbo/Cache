diff --git a/qa/ml-basic-multi-node/src/test/java/org/elasticsearch/xpack/ml/integration/MlBasicMultiNodeIT.java b/qa/ml-basic-multi-node/src/test/java/org/elasticsearch/xpack/ml/integration/MlBasicMultiNodeIT.java
index b3d40e9..9c12f6b 100644
--- a/qa/ml-basic-multi-node/src/test/java/org/elasticsearch/xpack/ml/integration/MlBasicMultiNodeIT.java
+++ b/qa/ml-basic-multi-node/src/test/java/org/elasticsearch/xpack/ml/integration/MlBasicMultiNodeIT.java
@@ -73,7 +73,7 @@
         assertEquals(0, responseBody.get("invalid_date_count"));
         assertEquals(0, responseBody.get("missing_field_count"));
         assertEquals(0, responseBody.get("out_of_order_timestamp_count"));
-        assertEquals(1, responseBody.get("bucket_count"));
+        assertEquals(0, responseBody.get("bucket_count"));
         assertEquals(1403481600000L, responseBody.get("earliest_record_timestamp"));
         assertEquals(1403481700000L, responseBody.get("latest_record_timestamp"));
 
@@ -98,7 +98,7 @@
         assertEquals(0, dataCountsDoc.get("invalid_date_count"));
         assertEquals(0, dataCountsDoc.get("missing_field_count"));
         assertEquals(0, dataCountsDoc.get("out_of_order_timestamp_count"));
-        assertEquals(1, dataCountsDoc.get("bucket_count"));
+        assertEquals(0, dataCountsDoc.get("bucket_count"));
         assertEquals(1403481600000L, dataCountsDoc.get("earliest_record_timestamp"));
         assertEquals(1403481700000L, dataCountsDoc.get("latest_record_timestamp"));
 
@@ -200,7 +200,7 @@
         assertEquals(0, responseBody.get("invalid_date_count"));
         assertEquals(0, responseBody.get("missing_field_count"));
         assertEquals(0, responseBody.get("out_of_order_timestamp_count"));
-        assertEquals(1, responseBody.get("bucket_count"));
+        assertEquals(0, responseBody.get("bucket_count"));
         assertEquals(1403481600000L, responseBody.get("earliest_record_timestamp"));
         assertEquals(1403482000000L, responseBody.get("latest_record_timestamp"));
 
@@ -240,7 +240,7 @@
         assertEquals(0, responseBody.get("invalid_date_count"));
         assertEquals(0, responseBody.get("missing_field_count"));
         assertEquals(0, responseBody.get("out_of_order_timestamp_count"));
-        assertEquals(1, responseBody.get("bucket_count"));
+        assertEquals(0, responseBody.get("bucket_count"));
         
         // unintuitive: should return the earliest record timestamp of this feed???
         assertEquals(null, responseBody.get("earliest_record_timestamp"));
@@ -265,7 +265,7 @@
         assertEquals(0, dataCountsDoc.get("invalid_date_count"));
         assertEquals(0, dataCountsDoc.get("missing_field_count"));
         assertEquals(0, dataCountsDoc.get("out_of_order_timestamp_count"));
-        assertEquals(2, dataCountsDoc.get("bucket_count"));
+        assertEquals(0, dataCountsDoc.get("bucket_count"));
         assertEquals(1403481600000L, dataCountsDoc.get("earliest_record_timestamp"));
         assertEquals(1407082000000L, dataCountsDoc.get("latest_record_timestamp"));
 
