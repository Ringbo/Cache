diff --git a/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java b/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
index aa40577..785e83e 100644
--- a/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
+++ b/underfs/local/src/main/java/alluxio/underfs/local/LocalUnderFileSystem.java
@@ -272,7 +272,7 @@
         FileUtils.changeLocalFileGroup(path, group);
       }
     } catch (IOException e) {
-      LOG.error("Fail to set owner for {} with user: {}, group: {}", path, user, group, e);
+      LOG.error("Fail to set owner for {} with user: {}, group: {}", path, user, group);
       LOG.warn("In order for Alluxio to set local files with the correct user and groups, "
           + "Alluxio should be the local file system superusers.");
       if (!Configuration.getBoolean(PropertyKey.UNDERFS_ALLOW_SET_OWNER_FAILURE)) {
