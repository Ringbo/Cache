diff --git a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/ZkPath.java b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/ZkPath.java
index 29e182b..cbc76ae 100644
--- a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/ZkPath.java
+++ b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/ZkPath.java
@@ -170,10 +170,10 @@
         return rc;
     }
 
-    public static void createContainerPaths(IZKClient zooKeeper, String container, String version, String profile) throws InterruptedException, KeeperException {
+    public static void createContainerPaths(IZKClient zooKeeper, String container, String version, String profiles) throws InterruptedException, KeeperException {
         boolean versionProvided = version != null;
         if (version == null) {
-            version = ZooKeeperUtils.get(zooKeeper, CONFIG_DEFAULT_VERSION.getPath());
+            version = ZooKeeperUtils.get(zooKeeper, CONFIG_VERSION.getPath(container));
         }
 
         if (version != null) {
@@ -182,7 +182,7 @@
             }
 
             if (zooKeeper.exists(ZkPath.CONFIG_VERSIONS_CONTAINER.getPath(version, container)) == null || versionProvided) {
-                ZooKeeperUtils.set(zooKeeper, ZkPath.CONFIG_VERSIONS_CONTAINER.getPath(version, container), profile);
+                ZooKeeperUtils.set(zooKeeper, ZkPath.CONFIG_VERSIONS_CONTAINER.getPath(version, container), profiles);
             }
         }
     }
