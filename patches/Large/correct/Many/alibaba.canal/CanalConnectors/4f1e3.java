diff --git a/client/src/main/java/com/alibaba/otter/canal/client/CanalConnectors.java b/client/src/main/java/com/alibaba/otter/canal/client/CanalConnectors.java
index de0aa2e..391b21d 100644
--- a/client/src/main/java/com/alibaba/otter/canal/client/CanalConnectors.java
+++ b/client/src/main/java/com/alibaba/otter/canal/client/CanalConnectors.java
@@ -28,7 +28,7 @@
      */
     public static CanalConnector newSingleConnector(SocketAddress address, String destination, String username,
                                                     String password) {
-        SimpleCanalConnector canalConnector = new SimpleCanalConnector(address, username, password, destination, null);
+        SimpleCanalConnector canalConnector = new SimpleCanalConnector(address, username, password, destination);
         canalConnector.setSoTimeout(30 * 1000);
         return canalConnector;
     }
