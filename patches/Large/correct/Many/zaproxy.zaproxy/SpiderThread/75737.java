diff --git a/src/org/zaproxy/zap/extension/spider/SpiderThread.java b/src/org/zaproxy/zap/extension/spider/SpiderThread.java
index d3762f0..e1d078d 100644
--- a/src/org/zaproxy/zap/extension/spider/SpiderThread.java
+++ b/src/org/zaproxy/zap/extension/spider/SpiderThread.java
@@ -212,7 +212,7 @@
 			spider.setExcludeList(extension.getExcludeList());
 
 			// Add seeds accordingly
-			if (startNode != null)
+			if (startNode != null || justScanInScope)
 				addSeeds(spider, startNode);
 			else
 				spider.addSeed(startURI);
