diff --git a/src/test/java/org/elasticsearch/search/aggregations/bucket/DateHistogramTests.java b/src/test/java/org/elasticsearch/search/aggregations/bucket/DateHistogramTests.java
index 8e28216..a8cece6 100644
--- a/src/test/java/org/elasticsearch/search/aggregations/bucket/DateHistogramTests.java
+++ b/src/test/java/org/elasticsearch/search/aggregations/bucket/DateHistogramTests.java
@@ -1134,7 +1134,7 @@
         if (frequently()) {
             boundsMinKey = baseKey.minusDays(addedBucketsLeft * interval);
         } else {
-            boundsMinKey = baseKey.plus(addedBucketsLeft * interval);
+            boundsMinKey = baseKey.plusDays(addedBucketsLeft * interval);
             addedBucketsLeft = 0;
         }
         DateTime boundsMin = boundsMinKey.plusDays(randomIntBetween(0, interval - 1));
