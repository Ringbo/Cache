diff --git a/graylog2-server/src/main/java/org/graylog2/indexer/retention/strategies/DeletionRetentionStrategy.java b/graylog2-server/src/main/java/org/graylog2/indexer/retention/strategies/DeletionRetentionStrategy.java
index 1c1b5b5..7d06246 100644
--- a/graylog2-server/src/main/java/org/graylog2/indexer/retention/strategies/DeletionRetentionStrategy.java
+++ b/graylog2-server/src/main/java/org/graylog2/indexer/retention/strategies/DeletionRetentionStrategy.java
@@ -67,6 +67,6 @@
 
     @Override
     public Class<?> configurationClass() {
-        return DeletionRetentionStrategy.class;
+        return DeletionRetentionStrategyConfig.class;
     }
 }
