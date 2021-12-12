diff --git a/OsmAnd-java/src/net/osmand/render/RenderingRuleProperty.java b/OsmAnd-java/src/net/osmand/render/RenderingRuleProperty.java
index f8f87a3..236e4f6 100644
--- a/OsmAnd-java/src/net/osmand/render/RenderingRuleProperty.java
+++ b/OsmAnd-java/src/net/osmand/render/RenderingRuleProperty.java
@@ -137,7 +137,7 @@
 				int colon = value.indexOf(':');
 				if(colon != -1) {
 					int c  = 0;
-					if(c > 0) {
+					if(colon > 0) {
 						c += Integer.parseInt(value.substring(0, colon));
 					}
 					c += Integer.parseInt(value.substring(colon + 1));
@@ -171,7 +171,7 @@
 				int colon = value.indexOf(':');
 				if(colon != -1) {
 					float c = 0;
-					if(c > 0) {
+					if(colon > 0) {
 						c += Float.parseFloat(value.substring(0, colon));
 					}
 					c += Float.parseFloat(value.substring(colon + 1));
