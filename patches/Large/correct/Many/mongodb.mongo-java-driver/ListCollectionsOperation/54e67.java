diff --git a/driver-core/src/main/com/mongodb/operation/ListCollectionsOperation.java b/driver-core/src/main/com/mongodb/operation/ListCollectionsOperation.java
index 7cb9b3e..099f5e1 100644
--- a/driver-core/src/main/com/mongodb/operation/ListCollectionsOperation.java
+++ b/driver-core/src/main/com/mongodb/operation/ListCollectionsOperation.java
@@ -175,7 +175,7 @@
                 if (serverIsAtLeastVersionThreeDotZero(connection.getDescription())) {
                     try {
                         return executeWrappedCommandProtocol(databaseName, getCommand(), createCommandDecoder(), connection,
-                                                             commandTransformer(source));
+                                binding.getReadPreference(), commandTransformer(source));
                     } catch (MongoCommandException e) {
                         return rethrowIfNotNamespaceError(e, createEmptyBatchCursor(createNamespace(), decoder,
                                 source.getServerDescription().getAddress(), batchSize));
