diff --git a/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/index/engine/FollowingEngineTests.java b/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/index/engine/FollowingEngineTests.java
index a637c50..56ee10a 100644
--- a/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/index/engine/FollowingEngineTests.java
+++ b/x-pack/plugin/ccr/src/test/java/org/elasticsearch/xpack/ccr/index/engine/FollowingEngineTests.java
@@ -281,7 +281,8 @@
                         xContentRegistry, IndexSettingsModule.newIndexSettings(shardId.getIndexName(), indexSettings.getSettings())),
                 new NoneCircuitBreakerService(),
                 () -> SequenceNumbers.NO_OPS_PERFORMED,
-                () -> primaryTerm.get()
+                () -> primaryTerm.get(),
+                EngineTestCase::createTombstoneDoc
         );
     }
 
