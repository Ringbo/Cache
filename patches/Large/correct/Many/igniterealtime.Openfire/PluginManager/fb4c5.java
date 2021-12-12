diff --git a/src/java/org/jivesoftware/wildfire/container/PluginManager.java b/src/java/org/jivesoftware/wildfire/container/PluginManager.java
index dddbdf0..3f02a52 100644
--- a/src/java/org/jivesoftware/wildfire/container/PluginManager.java
+++ b/src/java/org/jivesoftware/wildfire/container/PluginManager.java
@@ -350,7 +350,7 @@
                 Log.warn("Plugin " + pluginDir + " could not be loaded: no plugin.xml file found");
             }
         }
-        catch (Exception e) {
+        catch (Throwable e) {
             Log.error("Error loading plugin", e);
         }
     }
