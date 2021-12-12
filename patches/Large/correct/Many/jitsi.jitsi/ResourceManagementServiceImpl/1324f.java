diff --git a/src/net/java/sip/communicator/impl/resources/ResourceManagementServiceImpl.java b/src/net/java/sip/communicator/impl/resources/ResourceManagementServiceImpl.java
index 1af29e7..7ef0e36 100644
--- a/src/net/java/sip/communicator/impl/resources/ResourceManagementServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/resources/ResourceManagementServiceImpl.java
@@ -554,7 +554,7 @@
      */
     public URL getSoundURL(String urlKey)
     {
-        String path = settingsResources.get(urlKey);
+        String path = soundResources.get(urlKey);
 
         if (path == null || path.length() == 0)
         {
