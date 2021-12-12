diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/screenmarkers/ScreenMarkerPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/screenmarkers/ScreenMarkerPlugin.java
index 89cf218..963eeb6 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/screenmarkers/ScreenMarkerPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/screenmarkers/ScreenMarkerPlugin.java
@@ -104,7 +104,7 @@
 		screenMarkers.forEach(overlayManager::add);
 
 		pluginPanel = injector.getInstance(ScreenMarkerPluginPanel.class);
-		pluginPanel.init();
+		pluginPanel.rebuild();
 
 		BufferedImage icon;
 		synchronized (ImageIO.class)
