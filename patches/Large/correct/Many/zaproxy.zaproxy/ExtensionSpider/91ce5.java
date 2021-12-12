diff --git a/src/org/zaproxy/zap/extension/spider/ExtensionSpider.java b/src/org/zaproxy/zap/extension/spider/ExtensionSpider.java
index 034e5b0..99c828f 100644
--- a/src/org/zaproxy/zap/extension/spider/ExtensionSpider.java
+++ b/src/org/zaproxy/zap/extension/spider/ExtensionSpider.java
@@ -801,7 +801,7 @@
 
 	public void showSpiderDialog(SiteNode node) {
 		if (spiderDialog == null) {
-			spiderDialog = new SpiderDialog(this, View.getSingleton().getMainFrame(), new Dimension(700, 400));
+			spiderDialog = new SpiderDialog(this, View.getSingleton().getMainFrame(), new Dimension(700, 430));
 		}
 		if (spiderDialog.isVisible()) {
 			// Its behind you! Actually not needed no the window is alwaysOnTop, but keeping in case we change that ;)
