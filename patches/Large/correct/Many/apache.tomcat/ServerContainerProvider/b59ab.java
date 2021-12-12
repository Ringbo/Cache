diff --git a/java/javax/websocket/server/ServerContainerProvider.java b/java/javax/websocket/server/ServerContainerProvider.java
index 3cdb9b5..e87156e 100644
--- a/java/javax/websocket/server/ServerContainerProvider.java
+++ b/java/javax/websocket/server/ServerContainerProvider.java
@@ -32,7 +32,7 @@
      * Use the service loader API to obtain a reference to the
      * {@link ServerContainer}.
      */
-    static ServerContainer getServerContainer() {
+    public static ServerContainer getServerContainer() {
         ServerContainer result = null;
 
         ServiceLoader<ServerContainerProvider> serviceLoader =
