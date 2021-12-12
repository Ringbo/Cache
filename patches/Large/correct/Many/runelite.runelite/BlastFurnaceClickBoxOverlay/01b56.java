diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceClickBoxOverlay.java b/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceClickBoxOverlay.java
index 07f5aa2..9dba17d 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceClickBoxOverlay.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/blastfurnace/BlastFurnaceClickBoxOverlay.java
@@ -51,7 +51,7 @@
 	private final BlastFurnaceConfig config;
 
 	@Inject
-	BlastFurnaceClickBoxOverlay(Client client, BlastFurnacePlugin plugin, BlastFurnaceConfig config)
+	private BlastFurnaceClickBoxOverlay(Client client, BlastFurnacePlugin plugin, BlastFurnaceConfig config)
 	{
 		setPosition(OverlayPosition.DYNAMIC);
 		this.client = client;
