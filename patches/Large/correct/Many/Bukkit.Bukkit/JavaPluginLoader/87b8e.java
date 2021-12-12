diff --git a/src/org/bukkit/plugin/java/JavaPluginLoader.java b/src/org/bukkit/plugin/java/JavaPluginLoader.java
index 3f17112..a33e61f 100644
--- a/src/org/bukkit/plugin/java/JavaPluginLoader.java
+++ b/src/org/bukkit/plugin/java/JavaPluginLoader.java
@@ -82,10 +82,10 @@
             PlayerListener trueListener = (PlayerListener)listener;
 
             switch (event.getType()) {
-                case JOIN:
+                case PLAYER_JOIN:
                     trueListener.onPlayerJoin((PlayerEvent)event);
                     break;
-                case QUIT:
+                case PLAYER_QUIT:
                     trueListener.onPlayerQuit((PlayerEvent)event);
                     break;
             }
