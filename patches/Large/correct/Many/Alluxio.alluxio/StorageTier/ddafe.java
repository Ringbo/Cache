diff --git a/core/server/worker/src/main/java/alluxio/worker/block/meta/StorageTier.java b/core/server/worker/src/main/java/alluxio/worker/block/meta/StorageTier.java
index 4eb6e79..99b84e5 100644
--- a/core/server/worker/src/main/java/alluxio/worker/block/meta/StorageTier.java
+++ b/core/server/worker/src/main/java/alluxio/worker/block/meta/StorageTier.java
@@ -119,7 +119,7 @@
     try {
       info = ShellUtils.getUnixMountInfo();
     } catch (IOException e) {
-      LOG.warn("Failed to get mount information: {}", e.getMessage());
+      LOG.debug("Failed to get mount information: {}", e.getMessage());
       return;
     }
     for (UnixMountInfo mountInfo : info) {
@@ -142,8 +142,9 @@
       if ((fsType.equalsIgnoreCase("tmpfs") || fsType.equalsIgnoreCase("ramfs"))
           && size < storageDir.getCapacityBytes()) {
         throw new IllegalStateException(String.format(
-            "tmpfs is smaller than the configured size: tmpfs size: %s, configured size: %s", size,
-            storageDir.getCapacityBytes()));
+            "tmpfs is smaller than the configured size: tmpfs size: %s, configured size: %s",
+            FormatUtils.getSizeFromBytes(size),
+            FormatUtils.getSizeFromBytes(storageDir.getCapacityBytes())));
       }
     }
   }
