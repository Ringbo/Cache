diff --git a/server/sonar-server/src/main/java/org/sonar/server/plugins/PluginDownloader.java b/server/sonar-server/src/main/java/org/sonar/server/plugins/PluginDownloader.java
index 9c1d731..1a6fa83 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/plugins/PluginDownloader.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/plugins/PluginDownloader.java
@@ -132,7 +132,7 @@
         } catch (Exception e) {
           String message = String.format("Fail to download the plugin (%s, version %s) from %s (error is : %s)",
             release.getArtifact().getKey(), release.getVersion().getName(), release.getDownloadUrl(), e.getMessage());
-          LOG.debug(message, e);
+          LOG.debug(message);
           throw new SonarException(message, e);
         }
       }
