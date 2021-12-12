diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java b/modules/elasticsearch/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
index 773b282..10c27b5 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/index/merge/policy/TieredMergePolicyProvider.java
@@ -139,7 +139,7 @@
             }
 
             int maxMergeAtOnceExplicit = settings.getAsInt("index.merge.policy.max_merge_at_once_explicit", TieredMergePolicyProvider.this.maxMergeAtOnceExplicit);
-            if (maxMergeAtOnce != TieredMergePolicyProvider.this.maxMergeAtOnceExplicit) {
+            if (maxMergeAtOnceExplicit != TieredMergePolicyProvider.this.maxMergeAtOnceExplicit) {
                 logger.info("updating [max_merge_at_once_explicit] from [{}] to [{}]", TieredMergePolicyProvider.this.maxMergeAtOnceExplicit, maxMergeAtOnceExplicit);
                 TieredMergePolicyProvider.this.maxMergeAtOnceExplicit = maxMergeAtOnceExplicit;
                 for (CustomTieredMergePolicyProvider policy : policies) {
