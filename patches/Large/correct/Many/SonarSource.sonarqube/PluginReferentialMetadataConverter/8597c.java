diff --git a/sonar-server/src/main/java/org/sonar/server/plugins/PluginReferentialMetadataConverter.java b/sonar-server/src/main/java/org/sonar/server/plugins/PluginReferentialMetadataConverter.java
index 07c8f2d..ec41398 100644
--- a/sonar-server/src/main/java/org/sonar/server/plugins/PluginReferentialMetadataConverter.java
+++ b/sonar-server/src/main/java/org/sonar/server/plugins/PluginReferentialMetadataConverter.java
@@ -63,7 +63,7 @@
     pluginManifest.setHomepage(metadata.getHomepage());
     pluginManifest.setBasePlugin(metadata.getBasePlugin());
     pluginManifest.setParent(metadata.getParent());
-    pluginManifest.setRequiresPlugins(metadata.getRequiredPlugins().toArray(new String []{}));
+    pluginManifest.setRequirePlugins(metadata.getRequiredPlugins().toArray(new String []{}));
     return pluginManifest;
   }
 }
