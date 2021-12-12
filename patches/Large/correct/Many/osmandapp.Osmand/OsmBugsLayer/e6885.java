diff --git a/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java b/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
index 3ec4e7c..09d1bd4 100644
--- a/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
+++ b/OsmAnd/src/net/osmand/plus/osmedit/OsmBugsLayer.java
@@ -595,7 +595,7 @@
 				description = comments.get(0);
 				typeName = sb.toString();
 			}
-			if (description != null) {
+			if (description != null && description.length() < 100) {
 				if (comments.size() > 0) {
 					comments.remove(0);
 				}
