diff --git a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionSchemaCacheLoader.java b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionSchemaCacheLoader.java
index 221e0f8..8b3409f 100644
--- a/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionSchemaCacheLoader.java
+++ b/thirdeye/thirdeye-pinot/src/main/java/com/linkedin/thirdeye/client/cache/CollectionSchemaCacheLoader.java
@@ -120,7 +120,7 @@
     TimeGranularity outputGranularity = new TimeGranularity(GRANULARITY_SIZE,
         timeFieldSpec.getOutgoingGranularitySpec().getTimeType());
     TimeSpec spec =
-        new TimeSpec(timeFieldSpec.getOutgoingTimeColumnName(), outputGranularity, format);
+        new TimeSpec(timeFieldSpec.getOutGoingTimeColumnName(), outputGranularity, format);
     return spec;
   }
 
