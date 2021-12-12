diff --git a/OsmAnd-java/src/net/osmand/binary/RouteDataObject.java b/OsmAnd-java/src/net/osmand/binary/RouteDataObject.java
index 006585c..9b6e1a0 100644
--- a/OsmAnd-java/src/net/osmand/binary/RouteDataObject.java
+++ b/OsmAnd-java/src/net/osmand/binary/RouteDataObject.java
@@ -116,7 +116,7 @@
 					}
 				}
 			}
-			if (refDeafult != null) {
+			if (refDefault != null) {
 				return refDefault;
 			}
 			return names.get(region.refTypeRule);
