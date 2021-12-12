diff --git a/merger/src/main/java/com/metamx/druid/merger/coordinator/http/IndexerCoordinatorNode.java b/merger/src/main/java/com/metamx/druid/merger/coordinator/http/IndexerCoordinatorNode.java
index f7e5fbe..d7ab574 100644
--- a/merger/src/main/java/com/metamx/druid/merger/coordinator/http/IndexerCoordinatorNode.java
+++ b/merger/src/main/java/com/metamx/druid/merger/coordinator/http/IndexerCoordinatorNode.java
@@ -480,7 +480,7 @@
                   ),
                   configFactory.build(EC2AutoScalingStrategyConfig.class)
               );
-            } else if (config.getStorageImpl().equalsIgnoreCase("noop")) {
+            } else if (config.getStrategyImpl().equalsIgnoreCase("noop")) {
               strategy = new NoopScalingStrategy();
             } else {
               throw new ISE("Invalid strategy implementation: %s",config.getStrategyImpl());
