diff --git a/community/kernel/src/test/java/org/neo4j/unsafe/impl/batchimport/RelationshipLinkbackStageTest.java b/community/kernel/src/test/java/org/neo4j/unsafe/impl/batchimport/RelationshipLinkbackStageTest.java
index a867686..bcdfebb 100644
--- a/community/kernel/src/test/java/org/neo4j/unsafe/impl/batchimport/RelationshipLinkbackStageTest.java
+++ b/community/kernel/src/test/java/org/neo4j/unsafe/impl/batchimport/RelationshipLinkbackStageTest.java
@@ -41,7 +41,7 @@
         long highId = 5;
         RelationshipStore store = StoreWithReservedId.newRelationshipStoreMock( highId );
         RelationshipLinkbackStage stage = new RelationshipLinkbackStage( "Test",
-                Configuration.DEFAULT, store, newCache(), 0, false );
+                Configuration.DEFAULT, store, newCache(), 0, highId, false );
 
         ExecutionSupervisors.superviseExecution( ExecutionMonitors.invisible(), Configuration.DEFAULT, stage );
 
