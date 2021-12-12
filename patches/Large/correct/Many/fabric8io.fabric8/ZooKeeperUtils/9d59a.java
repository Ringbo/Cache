diff --git a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/utils/ZooKeeperUtils.java b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/utils/ZooKeeperUtils.java
index 261de11..6c8a404 100644
--- a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/utils/ZooKeeperUtils.java
+++ b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/utils/ZooKeeperUtils.java
@@ -107,7 +107,7 @@
             if (changed) {
                 sb.delete(0, sb.length());
                 for (String part : parts) {
-                    if (data.length() > 0) {
+                    if (sb.length() > 0) {
                         sb.append(" ");
                     }
                     sb.append(part);
@@ -124,7 +124,7 @@
 
     public static List<String> getAllChildren(CuratorFramework curator, String path) throws Exception {
         List<String> children = getChildren(curator, path);
-        List<String> allChildren = new ArrayList();
+        List<String> allChildren = new ArrayList<String>();
         for (String child : children) {
             String fullPath = ZKPaths.makePath(path, child);
             allChildren.add(fullPath);
