diff --git a/driver-core/src/main/com/mongodb/operation/GroupOperation.java b/driver-core/src/main/com/mongodb/operation/GroupOperation.java
index 506ed84..1074a96 100644
--- a/driver-core/src/main/com/mongodb/operation/GroupOperation.java
+++ b/driver-core/src/main/com/mongodb/operation/GroupOperation.java
@@ -187,7 +187,7 @@
             public BatchCursor<T> call(final ConnectionSource connectionSource, final Connection connection) {
                 return executeWrappedCommandProtocol(namespace.getDatabaseName(), getCommand(),
                                                      CommandResultDocumentCodec.create(decoder, "retval"),
-                                                     connection, transformer(connectionSource, connection));
+                                                     connection, binding.getReadPreference(), transformer(connectionSource, connection));
             }
         });
     }
