diff --git a/graylog2-server/src/main/java/org/graylog2/periodical/ConfigurationManagementPeriodical.java b/graylog2-server/src/main/java/org/graylog2/periodical/ConfigurationManagementPeriodical.java
index 5785af1..5e5cee8 100644
--- a/graylog2-server/src/main/java/org/graylog2/periodical/ConfigurationManagementPeriodical.java
+++ b/graylog2-server/src/main/java/org/graylog2/periodical/ConfigurationManagementPeriodical.java
@@ -75,7 +75,7 @@
 
         // All default retention strategy settings
         final ClosingRetentionStrategyConfig closingRetentionStrategyConfig = clusterConfigService.get(ClosingRetentionStrategyConfig.class);
-        final DeletionRetentionStrategy deletionRetentionStrategy = clusterConfigService.get(DeletionRetentionStrategy.class);
+        final DeletionRetentionStrategyConfig deletionRetentionStrategyConfig = clusterConfigService.get(DeletionRetentionStrategyConfig.class);
 
         if (closingRetentionStrategyConfig == null) {
             final ClosingRetentionStrategyConfig closingConfig = ClosingRetentionStrategyConfig.create(elasticsearchConfiguration.getMaxNumberOfIndices());
@@ -83,7 +83,7 @@
             LOG.info("Migrated \"{}\" setting: {}", "elasticsearch_max_number_of_indices", closingConfig);
         }
 
-        if (deletionRetentionStrategy == null) {
+        if (deletionRetentionStrategyConfig == null) {
             final DeletionRetentionStrategyConfig deletionConfig = DeletionRetentionStrategyConfig.create(elasticsearchConfiguration.getMaxNumberOfIndices());
             clusterConfigService.write(deletionConfig);
             LOG.info("Migrated \"{}\" setting: {}", "elasticsearch_max_number_of_indices", deletionConfig);
