diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
index 35fba9a..e57a025 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
@@ -240,7 +240,7 @@
                         }
                     }
 
-                    connectionManager.markOwnerAddressAsClosed();
+                    connectionManager.markOwnerConnectionAsClosed();
                     IOUtil.closeResource(conn);
                     conn = null;
                     fireConnectionEvent(true);
