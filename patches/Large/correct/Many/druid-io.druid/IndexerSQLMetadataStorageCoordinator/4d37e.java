diff --git a/server/src/main/java/org/apache/druid/metadata/IndexerSQLMetadataStorageCoordinator.java b/server/src/main/java/org/apache/druid/metadata/IndexerSQLMetadataStorageCoordinator.java
index c234148..c77dee1 100644
--- a/server/src/main/java/org/apache/druid/metadata/IndexerSQLMetadataStorageCoordinator.java
+++ b/server/src/main/java/org/apache/druid/metadata/IndexerSQLMetadataStorageCoordinator.java
@@ -893,7 +893,7 @@
       // Not in the desired start state.
       log.error(
           "Not updating metadata, existing state[%s] in metadata store doesn't match to the new start state[%s].",
-          oldCommitMetadataBytesFromDb,
+          oldCommitMetadataFromDb,
           startMetadata
       );
       return DataSourceMetadataUpdateResult.FAILURE;
