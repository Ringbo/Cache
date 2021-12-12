diff --git a/DataExtractionOSM/src/net/osmand/render/OsmandRenderingRulesParser.java b/DataExtractionOSM/src/net/osmand/render/OsmandRenderingRulesParser.java
index 28f6d6b..365e2dd 100644
--- a/DataExtractionOSM/src/net/osmand/render/OsmandRenderingRulesParser.java
+++ b/DataExtractionOSM/src/net/osmand/render/OsmandRenderingRulesParser.java
@@ -153,7 +153,7 @@
 				String dnc = attributes.getValue("defaultNightColor");
 				int defautNightColor = defaultColor;
 				if(dnc != null && dnc.length() > 0){
-					defautNightColor = parseColor(dc);
+					defautNightColor = parseColor(dnc);
 				}
 				visitor.rendering(attributes.getValue("name"), attributes.getValue("depends"), defaultColor, defautNightColor); //$NON-NLS-1$ //$NON-NLS-2$
 			} else {
