diff --git a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/ParallelBatchImporter.java b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/ParallelBatchImporter.java
index a355fe6..dde3559 100644
--- a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/ParallelBatchImporter.java
+++ b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/ParallelBatchImporter.java
@@ -276,7 +276,8 @@
             // Stage 5a -- link relationship chains together for dense nodes
             nodeRelationshipCache.setForwardScan( false );
             executeStages( new RelationshipLinkbackStage( topic, config, neoStore.getRelationshipStore(),
-                    nodeRelationshipCache, nextRelationshipId, true/*dense*/ ) );
+                    nodeRelationshipCache, nextRelationshipId,
+                    relationshipStage.getNextRelationshipId(), true/*dense*/ ) );
             nextRelationshipId = relationshipStage.getNextRelationshipId();
             nodeRelationshipCache.clearChangedChunks( true/*dense*/ ); // cheap higher level clearing
         }
@@ -290,7 +291,7 @@
         // Stage 5b -- link relationship chains together for sparse nodes
         nodeRelationshipCache.setForwardScan( false );
         executeStages( new RelationshipLinkbackStage( topic, config, neoStore.getRelationshipStore(),
-                nodeRelationshipCache, 0, false/*sparse*/ ) );
+                nodeRelationshipCache, 0, nextRelationshipId, false/*sparse*/ ) );
 
         if ( minorityRelationshipTypes.length > 0 )
         {
