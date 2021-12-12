diff --git a/src/org/zaproxy/zap/spider/SpiderParam.java b/src/org/zaproxy/zap/spider/SpiderParam.java
index 32a1dfc..507bf90 100644
--- a/src/org/zaproxy/zap/spider/SpiderParam.java
+++ b/src/org/zaproxy/zap/spider/SpiderParam.java
@@ -118,9 +118,9 @@
 	/** Whether comments should be parsed for URIs. */
 	private boolean parseComments = true;
 	/** Whether robots.txt file should be parsed for URIs. */
-	private boolean parseRobotsTxt = false;
+	private boolean parseRobotsTxt = true;
 	/** Whether sitemap.xml file should be parsed for URIs. */
-	private boolean parseSitemapXml = false;
+	private boolean parseSitemapXml = true;
 	/** Whether SVN entries files should be parsed for URIs. */
 	private boolean parseSVNentries = false;
 	/** Whether Git files should be parsed for URIs. */
@@ -221,13 +221,13 @@
 		}
 
 		try {
-			this.parseRobotsTxt = getConfig().getBoolean(SPIDER_PARSE_ROBOTS_TXT, false);
+			this.parseRobotsTxt = getConfig().getBoolean(SPIDER_PARSE_ROBOTS_TXT, true);
 		} catch (Exception e) {
 			log.error("Error while parsing config file: " + e.getMessage(), e);
 		}
 		
 		try {
-			this.parseSitemapXml = getConfig().getBoolean(SPIDER_PARSE_SITEMAP_XML, false);
+			this.parseSitemapXml = getConfig().getBoolean(SPIDER_PARSE_SITEMAP_XML, true);
 		} catch (Exception e) {
 			log.error("Error while parsing config file: " + e.getMessage(), e);
 		}
