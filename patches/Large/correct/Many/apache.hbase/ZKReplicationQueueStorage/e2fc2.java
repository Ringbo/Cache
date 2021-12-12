diff --git a/hbase-replication/src/main/java/org/apache/hadoop/hbase/replication/ZKReplicationQueueStorage.java b/hbase-replication/src/main/java/org/apache/hadoop/hbase/replication/ZKReplicationQueueStorage.java
index 499ee0a..d4363db 100644
--- a/hbase-replication/src/main/java/org/apache/hadoop/hbase/replication/ZKReplicationQueueStorage.java
+++ b/hbase-replication/src/main/java/org/apache/hadoop/hbase/replication/ZKReplicationQueueStorage.java
@@ -134,26 +134,30 @@
   }
 
   /**
+   * <p>
    * Put all regions under /hbase/replication/regions znode will lead to too many children because
-   * of the huge number of regions in real production environment. So here we use hash of encoded
-   * region name to distribute the znode into multiple znodes. <br>
+   * of the huge number of regions in real production environment. So here we will distribute the
+   * znodes to multiple directories.
+   * </p>
+   * <p>
    * So the final znode path will be format like this:
    *
    * <pre>
-   * /hbase/replication/regions/e1/ff/dd04e76a6966d4ffa908ed0586764767-100
+   * /hbase/replication/regions/dd/04/e76a6966d4ffa908ed0586764767-100
    * </pre>
    *
-   * The e1 indicate the first level hash of encoded region name, and the ff indicate the second
-   * level hash of encoded region name, the 100 indicate the peer id. <br>
-   * Note that here we use two-level hash because if only one-level hash (such as mod 65535), it
-   * will still lead to too many children under the /hbase/replication/regions znode.
+   * Here the full encoded region name is dd04e76a6966d4ffa908ed0586764767, and we use the first two
+   * characters 'dd' as the first level directory name, and use the next two characters '04' as the
+   * second level directory name, and the rest part as the prefix of the znode, and the suffix '100'
+   * is the peer id.
+   * </p>
    * @param encodedRegionName the encoded region name.
    * @param peerId peer id for replication.
    * @return ZNode path to persist the max sequence id that we've pushed for the given region and
    *         peer.
    */
   @VisibleForTesting
-  public String getSerialReplicationRegionPeerNode(String encodedRegionName, String peerId) {
+  String getSerialReplicationRegionPeerNode(String encodedRegionName, String peerId) {
     if (encodedRegionName == null || encodedRegionName.length() != RegionInfo.MD5_HEX_LENGTH) {
       throw new IllegalArgumentException(
           "Invalid encoded region name: " + encodedRegionName + ", length should be 32.");
@@ -161,7 +165,7 @@
     return new StringBuilder(regionsZNode).append(ZNodePaths.ZNODE_PATH_SEPARATOR)
         .append(encodedRegionName.substring(0, 2)).append(ZNodePaths.ZNODE_PATH_SEPARATOR)
         .append(encodedRegionName.substring(2, 4)).append(ZNodePaths.ZNODE_PATH_SEPARATOR)
-        .append(encodedRegionName).append("-").append(peerId).toString();
+        .append(encodedRegionName.substring(4)).append("-").append(peerId).toString();
   }
 
   @Override
