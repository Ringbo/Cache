diff --git a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/internal/OsgiZkClient.java b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/internal/OsgiZkClient.java
index 7f6f14f..a389348 100644
--- a/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/internal/OsgiZkClient.java
+++ b/fabric/fabric-zookeeper/src/main/java/org/fusesource/fabric/zookeeper/internal/OsgiZkClient.java
@@ -284,7 +284,7 @@
     public void updated(Dictionary properties) throws ConfigurationException {
         synchronized (_lock) {
             String url = System.getProperty("zookeeper.url");
-            Timespan timeout = new Timespan(10, Timespan.TimeUnit.SECOND);
+            Timespan timeout = new Timespan(30, Timespan.TimeUnit.SECOND);
             if (properties != null) {
                 if (properties.get("zookeeper.url") != null) {
                     url = (String) properties.get("zookeeper.url");
