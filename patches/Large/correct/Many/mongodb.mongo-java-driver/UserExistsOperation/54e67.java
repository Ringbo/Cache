diff --git a/driver-core/src/main/com/mongodb/operation/UserExistsOperation.java b/driver-core/src/main/com/mongodb/operation/UserExistsOperation.java
index 09baace..b009626 100644
--- a/driver-core/src/main/com/mongodb/operation/UserExistsOperation.java
+++ b/driver-core/src/main/com/mongodb/operation/UserExistsOperation.java
@@ -87,7 +87,8 @@
                 } else {
                     final SingleResultCallback<Boolean> wrappedCallback = releasingCallback(errorHandlingCallback(callback), connection);
                     if (serverIsAtLeastVersionTwoDotSix(connection.getDescription())) {
-                        executeWrappedCommandProtocolAsync(databaseName, getCommand(), connection, transformer(), wrappedCallback);
+                        executeWrappedCommandProtocolAsync(databaseName, getCommand(), new BsonDocumentCodec(), connection,
+                                binding.getReadPreference(), transformer(), wrappedCallback);
                     } else {
                         connection.queryAsync(new MongoNamespace(databaseName, "system.users"),
                                               new BsonDocument("user", new BsonString(userName)), null, 1, 0,
