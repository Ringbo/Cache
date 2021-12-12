diff --git a/src/org/zaproxy/zap/spider/parser/SpiderHtmlParser.java b/src/org/zaproxy/zap/spider/parser/SpiderHtmlParser.java
index 3c307a1..36cf1d4 100644
--- a/src/org/zaproxy/zap/spider/parser/SpiderHtmlParser.java
+++ b/src/org/zaproxy/zap/spider/parser/SpiderHtmlParser.java
@@ -165,7 +165,7 @@
 					Matcher matcher = urlPattern.matcher(content);
 					if (matcher.find()) {
 						String url = matcher.group(1);
-						processURL(message, depth, baseURL, url);
+						processURL(message, depth, url, baseURL);
 					}
 				}
 			}
