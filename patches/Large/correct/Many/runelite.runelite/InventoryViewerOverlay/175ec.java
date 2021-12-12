diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/inventoryviewer/InventoryViewerOverlay.java b/runelite-client/src/main/java/net/runelite/client/plugins/inventoryviewer/InventoryViewerOverlay.java
index d1604b0..c024d21 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/inventoryviewer/InventoryViewerOverlay.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/inventoryviewer/InventoryViewerOverlay.java
@@ -56,7 +56,7 @@
 	{
 		setPosition(OverlayPosition.BOTTOM_RIGHT);
 		panelComponent.setWrapping(4);
-		panelComponent.setGap(new Point(6, 5));
+		panelComponent.setGap(new Point(6, 4));
 		panelComponent.setOrientation(PanelComponent.Orientation.HORIZONTAL);
 		this.itemManager = itemManager;
 		this.client = client;
