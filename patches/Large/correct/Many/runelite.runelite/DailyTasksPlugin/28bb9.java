diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/dailytaskindicators/DailyTasksPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/dailytaskindicators/DailyTasksPlugin.java
index ec8b4a0..f8587b6 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/dailytaskindicators/DailyTasksPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/dailytaskindicators/DailyTasksPlugin.java
@@ -46,7 +46,8 @@
 import net.runelite.client.plugins.PluginDescriptor;
 
 @PluginDescriptor(
-	name = "Daily Task Indicator"
+	name = "Daily Task Indicator",
+	enabledByDefault = false
 )
 @Slf4j
 public class DailyTasksPlugin extends Plugin
@@ -139,7 +140,7 @@
 	private boolean checkCanCollectEssence()
 	{
 		int value = client.getSetting(Varbits.DAILY_ESSENCE);
-		return value < 0; // 1 = can't claim
+		return value == 0; // 1 = can't claim
 	}
 
 	private void cacheColors()
