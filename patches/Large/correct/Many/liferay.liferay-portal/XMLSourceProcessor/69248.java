diff --git a/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java b/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
index 5008cd1..a9459a4 100644
--- a/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
+++ b/portal-impl/src/com/liferay/portal/tools/sourceformatter/XMLSourceProcessor.java
@@ -365,21 +365,21 @@
 					 portalSource && fileName.endsWith(".macro") ||
 					 portalSource && fileName.endsWith(".testcase")) {
 
-				newContent = formatPoshiXML(content);
+				newContent = formatPoshiXML(newContent);
 			}
 			else if (portalSource && fileName.endsWith("/service.xml")) {
 				formatServiceXML(fileName, newContent);
 			}
 			else if (portalSource && fileName.endsWith("/struts-config.xml")) {
-				formatStrutsConfigXML(fileName, content);
+				formatStrutsConfigXML(fileName, newContent);
 			}
 			else if (portalSource && fileName.endsWith("/tiles-defs.xml")) {
-				formatTilesDefsXML(fileName, content);
+				formatTilesDefsXML(fileName, newContent);
 			}
 			else if (portalSource && fileName.endsWith("WEB-INF/web.xml") ||
 					 !portalSource && fileName.endsWith("/web.xml")) {
 
-				newContent = formatWebXML(fileName, content);
+				newContent = formatWebXML(fileName, newContent);
 			}
 
 			newContent = formatXML(newContent);
