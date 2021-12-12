diff --git a/pinot-common/src/main/java/com/linkedin/pinot/common/data/MetricFieldSpec.java b/pinot-common/src/main/java/com/linkedin/pinot/common/data/MetricFieldSpec.java
index 17c3d2e..37f68c2 100644
--- a/pinot-common/src/main/java/com/linkedin/pinot/common/data/MetricFieldSpec.java
+++ b/pinot-common/src/main/java/com/linkedin/pinot/common/data/MetricFieldSpec.java
@@ -88,7 +88,7 @@
   }
 
   // Required by JSON de-serializer. DO NOT REMOVE.
-  public void setDerivedMetricType(@Nonnull DerivedMetricType derivedMetricType) {
+  public void setDerivedMetricType(@Nullable DerivedMetricType derivedMetricType) {
     _derivedMetricType = derivedMetricType;
   }
 
