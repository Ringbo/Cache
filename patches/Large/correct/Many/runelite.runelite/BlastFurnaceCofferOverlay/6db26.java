diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceCofferOverlay.java b/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceCofferOverlay.java
index ef5c76c..67be188 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceCofferOverlay.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceCofferOverlay.java
@@ -44,7 +44,7 @@
 	private final PanelComponent panelComponent = new PanelComponent();
 
 	@Inject
-	BlastFurnaceCofferOverlay(Client client, BlastFurnacePlugin plugin)
+	private BlastFurnaceCofferOverlay(Client client, BlastFurnacePlugin plugin)
 	{
 		setPosition(OverlayPosition.TOP_LEFT);
 		this.client = client;
