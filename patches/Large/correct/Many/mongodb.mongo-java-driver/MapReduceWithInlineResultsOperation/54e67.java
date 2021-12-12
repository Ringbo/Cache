diff --git a/driver-core/src/main/com/mongodb/operation/MapReduceWithInlineResultsOperation.java b/driver-core/src/main/com/mongodb/operation/MapReduceWithInlineResultsOperation.java
index d1da669..f2bdc24 100644
--- a/driver-core/src/main/com/mongodb/operation/MapReduceWithInlineResultsOperation.java
+++ b/driver-core/src/main/com/mongodb/operation/MapReduceWithInlineResultsOperation.java
@@ -308,7 +308,7 @@
             public MapReduceBatchCursor<T> call(final ConnectionSource source, final Connection connection) {
                 return executeWrappedCommandProtocol(namespace.getDatabaseName(), getCommand(),
                                                      CommandResultDocumentCodec.create(decoder, "results"),
-                                                     connection, transformer(source, connection));
+                                                     connection, binding.getReadPreference(), transformer(source, connection));
             }
         });
     }
