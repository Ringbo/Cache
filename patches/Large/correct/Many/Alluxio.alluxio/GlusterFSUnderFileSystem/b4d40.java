diff --git a/underfs/glusterfs/src/main/java/alluxio/underfs/glusterfs/GlusterFSUnderFileSystem.java b/underfs/glusterfs/src/main/java/alluxio/underfs/glusterfs/GlusterFSUnderFileSystem.java
index 389ac7e..d75cc89 100644
--- a/underfs/glusterfs/src/main/java/alluxio/underfs/glusterfs/GlusterFSUnderFileSystem.java
+++ b/underfs/glusterfs/src/main/java/alluxio/underfs/glusterfs/GlusterFSUnderFileSystem.java
@@ -31,7 +31,7 @@
  * </p>
  */
 @ThreadSafe
-public class GlusterFSUnderFileSystem extends HdfsUnderFileSystem {
+public final class GlusterFSUnderFileSystem extends HdfsUnderFileSystem {
 
   /**
    * Constant for the Gluster FS URI scheme.
@@ -41,7 +41,9 @@
   /**
    * Prepares the Hadoop configuration necessary.
    *
+   * @param path the gluster path to serve as ufs
    * @param ufsConf Hadoop configuration
+   * @return a prepared configuration
    */
   public static Configuration prepareConfiguration(String path, Map<String, String> ufsConf) {
     if (path.startsWith(SCHEME)) {
@@ -70,6 +72,7 @@
    *
    * @param uri the {@link AlluxioURI} for this UFS
    * @param conf the configuration for Hadoop or GlusterFS
+   * @return a new Gluster FS {@link UnderFileSystem}
    */
   public static GlusterFSUnderFileSystem createInstance(AlluxioURI uri, Map<String, String> conf) {
     Configuration hadoopConf = prepareConfiguration(uri.toString(), conf);
