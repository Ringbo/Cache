diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotOverlay.java b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotOverlay.java
index 07248ed..a5fd92a 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotOverlay.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/screenshot/ScreenshotOverlay.java
@@ -47,7 +47,7 @@
 import net.runelite.client.ui.overlay.OverlayPosition;
 import net.runelite.client.ui.overlay.OverlayPriority;
 
-public class ScreenshotOverlay extends Overlay
+class ScreenshotOverlay extends Overlay
 {
 	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("MMM. dd, yyyy");
 	private static final int REPORT_BUTTON_X_OFFSET = 404;
@@ -59,7 +59,7 @@
 	private final Queue<Consumer<Image>> consumers = new ConcurrentLinkedQueue<>();
 
 	@Inject
-	public ScreenshotOverlay(Client client, DrawManager drawManager, ScreenshotPlugin plugin)
+	private ScreenshotOverlay(Client client, DrawManager drawManager, ScreenshotPlugin plugin)
 	{
 		setPosition(OverlayPosition.DYNAMIC);
 		setPriority(OverlayPriority.HIGH);
@@ -110,7 +110,7 @@
 		return null;
 	}
 
-	public void queueForTimestamp(Consumer<Image> screenshotConsumer)
+	void queueForTimestamp(Consumer<Image> screenshotConsumer)
 	{
 		if (plugin.getReportButton() == null)
 		{
