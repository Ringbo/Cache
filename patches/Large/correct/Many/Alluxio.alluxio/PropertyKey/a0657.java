diff --git a/core/common/src/main/java/alluxio/PropertyKey.java b/core/common/src/main/java/alluxio/PropertyKey.java
index dc3435c..b69659c 100644
--- a/core/common/src/main/java/alluxio/PropertyKey.java
+++ b/core/common/src/main/java/alluxio/PropertyKey.java
@@ -241,7 +241,7 @@
   USER_NETWORK_NETTY_CHANNEL_POOL_SIZE_MAX(Name.USER_NETWORK_NETTY_CHANNEL_POOL_SIZE_MAX, 1024),
   USER_NETWORK_NETTY_CHANNEL_POOL_GC_THRESHOLD_MS(
       Name.USER_NETWORK_NETTY_CHANNEL_POOL_GC_THRESHOLD_MS, 300 * Constants.SECOND_MS),
-  USER_UFS_DELEGATION_ENABLED(Name.USER_UFS_DELEGATION_ENABLED, false),
+  USER_UFS_DELEGATION_ENABLED(Name.USER_UFS_DELEGATION_ENABLED, true),
   USER_UFS_DELEGATION_READ_BUFFER_SIZE_BYTES(Name.USER_UFS_DELEGATION_READ_BUFFER_SIZE_BYTES,
       "8MB"),
   USER_UFS_DELEGATION_WRITE_BUFFER_SIZE_BYTES(Name.USER_UFS_DELEGATION_WRITE_BUFFER_SIZE_BYTES,