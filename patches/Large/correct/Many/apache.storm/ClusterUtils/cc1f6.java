diff --git a/storm-core/src/jvm/org/apache/storm/cluster/ClusterUtils.java b/storm-core/src/jvm/org/apache/storm/cluster/ClusterUtils.java
index aae4231..1095fff 100644
--- a/storm-core/src/jvm/org/apache/storm/cluster/ClusterUtils.java
+++ b/storm-core/src/jvm/org/apache/storm/cluster/ClusterUtils.java
@@ -94,7 +94,7 @@
     public static List<ACL> mkTopoOnlyAcls(Map topoConf) throws NoSuchAlgorithmException {
         List<ACL> aclList = null;
         String payload = (String) topoConf.get(Config.STORM_ZOOKEEPER_TOPOLOGY_AUTH_PAYLOAD);
-        if (Utils.isZkAuthenticationConfiguredStormServer(topoConf)) {
+        if (Utils.isZkAuthenticationConfiguredTopology(topoConf)) {
             aclList = new ArrayList<>();
             ACL acl1 = ZooDefs.Ids.CREATOR_ALL_ACL.get(0);
             aclList.add(acl1);
