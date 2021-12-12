diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java b/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
index 52abfaf..2379774 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/BlockInStream.java
@@ -112,7 +112,7 @@
     }
 
     boolean shortCircuit = Configuration.getBoolean(PropertyKey.USER_SHORT_CIRCUIT_ENABLED);
-    boolean sourceSupportsDomainSocket = !NettyUtils.isDomainSocketSupported(dataSource);
+    boolean sourceSupportsDomainSocket = NettyUtils.isDomainSocketSupported(dataSource);
     boolean sourceIsLocal = dataSourceType == BlockInStreamSource.LOCAL;
 
     // Short circuit
