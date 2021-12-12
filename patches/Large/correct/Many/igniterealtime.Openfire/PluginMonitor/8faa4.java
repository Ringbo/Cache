diff --git a/src/java/org/jivesoftware/openfire/container/PluginMonitor.java b/src/java/org/jivesoftware/openfire/container/PluginMonitor.java
index 879557c..5422256 100644
--- a/src/java/org/jivesoftware/openfire/container/PluginMonitor.java
+++ b/src/java/org/jivesoftware/openfire/container/PluginMonitor.java
@@ -154,7 +154,7 @@
                             if ( Files.exists( dir ) && Files.getLastModifiedTime( jarFile ).toMillis() > Files.getLastModifiedTime( dir ).toMillis() )
                             {
                                 // If this is the first time that the monitor process is running, then plugins won't be loaded yet. Therefore, just delete the directory.
-                                if ( pluginManager.isExecuted() )
+                                if ( !pluginManager.isExecuted() )
                                 {
                                     int count = 0;
                                     // Attempt to delete the folder for up to 5 seconds.
