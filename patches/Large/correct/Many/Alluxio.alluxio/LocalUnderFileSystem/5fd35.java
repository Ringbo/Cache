diff --git a/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java b/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
index 63ef766..1cbfe21 100644
--- a/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
+++ b/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
@@ -273,7 +273,7 @@
       }
     } catch (IOException e) {
       LOG.error("Fail to set owner for {} with user: {}, group: {}", path, user, group);
-      LOG.debug(e);
+      LOG.debug("Exception: ", e);
       LOG.warn("In order for Alluxio to set local files with the correct user and groups, "
           + "Alluxio should be the local file system superusers.");
       if (!Configuration.getBoolean(PropertyKey.UNDERFS_ALLOW_SET_OWNER_FAILURE)) {
