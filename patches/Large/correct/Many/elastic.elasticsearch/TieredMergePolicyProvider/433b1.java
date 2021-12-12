diff --git a/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java b/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
index 07d2b7f..8db69d3 100644
--- a/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
+++ b/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
@@ -66,7 +66,7 @@
         this.maxMergeAtOnceExplicit = componentSettings.getAsInt("max_merge_at_once_explicit", 30);
         // TODO is this really a good default number for max_merge_segment, what happens for large indices, won't they end up with many segments?
         this.maxMergedSegment = componentSettings.getAsBytesSize("max_merged_segment", componentSettings.getAsBytesSize("max_merge_segment", new ByteSizeValue(5, ByteSizeUnit.GB)));
-        this.segmentsPerTier = componentSettings.getAsDouble("segments_per_tier", 9.2d);
+        this.segmentsPerTier = componentSettings.getAsDouble("segments_per_tier", 10.0d);
         this.reclaimDeletesWeight = componentSettings.getAsDouble("reclaim_deletes_weight", 2.0d);
 
         fixSettingsIfNeeded();
