diff --git a/fabric/fabric-zookeeper-spring/src/main/java/org/fusesource/fabric/zookeeper/spring/ZKClientFactoryBean.java b/fabric/fabric-zookeeper-spring/src/main/java/org/fusesource/fabric/zookeeper/spring/ZKClientFactoryBean.java
index 9d1d4ee..cc10493 100644
--- a/fabric/fabric-zookeeper-spring/src/main/java/org/fusesource/fabric/zookeeper/spring/ZKClientFactoryBean.java
+++ b/fabric/fabric-zookeeper-spring/src/main/java/org/fusesource/fabric/zookeeper/spring/ZKClientFactoryBean.java
@@ -109,7 +109,9 @@
 
     public void destroy() throws Exception {
         if (zkClient != null) {
-            zkClient.close();
+            // Note we cannot use zkClient.close()
+            // since you cannot currently close a client which is not connected
+            zkClient.destroy();
             zkClient = null;
         }
 
