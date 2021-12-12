diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/PluginManager.java b/runelite-client/src/main/java/net/runelite/client/plugins/PluginManager.java
index dc7f1d7..4810de9 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/PluginManager.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/PluginManager.java
@@ -90,7 +90,7 @@
 				public void stopping(Service.State from)
 				{
 					logger.debug("Plugin {} is stopping", plugin);
-					runelite.getEventBus().unregister(logger);
+					runelite.getEventBus().unregister(plugin);
 				}
 
 				@Override
@@ -100,7 +100,7 @@
 
 					if (from == Service.State.RUNNING)
 					{
-						runelite.getEventBus().unregister(logger);
+						runelite.getEventBus().unregister(plugin);
 					}
 				}
 			};
