diff --git a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/config/DetectorTests.java b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/config/DetectorTests.java
index d7d28e8..99c0656 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/config/DetectorTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/config/DetectorTests.java
@@ -147,11 +147,11 @@
         }
         String fieldName = null;
         if (randomBoolean()) {
-            detector.setPartitionFieldName(fieldName = randomAlphaOfLengthBetween(1, 20));
+            detector.setPartitionFieldName(fieldName = randomAlphaOfLengthBetween(6, 20));
         } else if (randomBoolean() && Detector.NO_OVER_FIELD_NAME_FUNCTIONS.contains(function) == false) {
-            detector.setOverFieldName(fieldName = randomAlphaOfLengthBetween(1, 20));
+            detector.setOverFieldName(fieldName = randomAlphaOfLengthBetween(6, 20));
         } else if (randomBoolean() && Detector.NO_BY_FIELD_NAME_FUNCTIONS.contains(function) == false) {
-            detector.setByFieldName(fieldName = randomAlphaOfLengthBetween(1, 20));
+            detector.setByFieldName(fieldName = randomAlphaOfLengthBetween(6, 20));
         }
         if (randomBoolean()) {
             detector.setExcludeFrequent(randomFrom(Detector.ExcludeFrequent.values()));
