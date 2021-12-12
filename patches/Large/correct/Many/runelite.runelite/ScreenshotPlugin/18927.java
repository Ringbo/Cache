diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
index 17a990c..a9b8e93 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotPlugin.java
@@ -502,7 +502,7 @@
 	 *
 	 * @param fileName    Filename to use, without file extension.
 	 */
-	void takeScreenshot(String fileName)
+	private void takeScreenshot(String fileName)
 	{
 		if (client.getGameState() == GameState.LOGIN_SCREEN)
 		{
