diff --git a/src/test/java/net/hydromatic/optiq/test/OptiqAssert.java b/src/test/java/net/hydromatic/optiq/test/OptiqAssert.java
index 8f76b07..0e56aea 100644
--- a/src/test/java/net/hydromatic/optiq/test/OptiqAssert.java
+++ b/src/test/java/net/hydromatic/optiq/test/OptiqAssert.java
@@ -229,7 +229,7 @@
                             optiqConnection.getRootSchema();
                         ReflectiveSchema.create(
                             optiqConnection, rootSchema, name, schema);
-                        connection.setSchema(name);
+                        optiqConnection.setSchema(name);
                         return optiqConnection;
                     }
                 });
