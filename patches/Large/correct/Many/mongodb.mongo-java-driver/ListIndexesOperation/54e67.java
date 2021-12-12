diff --git a/driver-core/src/main/com/mongodb/operation/ListIndexesOperation.java b/driver-core/src/main/com/mongodb/operation/ListIndexesOperation.java
index efe2dd0..bbfa4c7 100644
--- a/driver-core/src/main/com/mongodb/operation/ListIndexesOperation.java
+++ b/driver-core/src/main/com/mongodb/operation/ListIndexesOperation.java
@@ -139,7 +139,7 @@
                 if (serverIsAtLeastVersionThreeDotZero(connection.getDescription())) {
                     try {
                         return executeWrappedCommandProtocol(namespace.getDatabaseName(), getCommand(), createCommandDecoder(), connection,
-                                                             transformer(source));
+                                binding.getReadPreference(), transformer(source));
                     } catch (MongoCommandException e) {
                         return rethrowIfNotNamespaceError(e, createEmptyBatchCursor(namespace, decoder,
                                                                                     source.getServerDescription().getAddress(), batchSize));
