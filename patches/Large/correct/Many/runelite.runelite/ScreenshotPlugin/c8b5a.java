diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
index 779f48b..e3b948d 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
@@ -468,7 +468,7 @@
 			}
 
 			File playerFolder;
-			if (client.getLocalPlayer() != null)
+			if (client.getLocalPlayer() != null && client.getLocalPlayer().getName() != null)
 			{
 				playerFolder = new File(SCREENSHOT_DIR, client.getLocalPlayer().getName());
 			}
