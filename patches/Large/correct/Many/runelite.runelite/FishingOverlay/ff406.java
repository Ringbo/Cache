diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/fishing/FishingOverlay.java b/runelite-client/src/main/java/net/runelite/client/plugins/fishing/FishingOverlay.java
index 49f2c50..d5739cf 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/fishing/FishingOverlay.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/fishing/FishingOverlay.java
@@ -78,7 +78,8 @@
 		}
 
 		panelComponent.getLines().clear();
-		if (client.getLocalPlayer().getInteracting() != null && client.getLocalPlayer().getInteracting().getName().equals(FISHING_SPOT))
+		if (client.getLocalPlayer().getInteracting() != null && client.getLocalPlayer().getInteracting().getName()
+			.contains(FISHING_SPOT))
 		{
 			panelComponent.setTitle("You are fishing");
 			panelComponent.setTitleColor(Color.GREEN);
