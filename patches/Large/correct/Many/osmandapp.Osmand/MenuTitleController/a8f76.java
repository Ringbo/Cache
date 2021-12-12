diff --git a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuTitleController.java b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuTitleController.java
index a27302e..c4918b3 100644
--- a/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuTitleController.java
+++ b/OsmAnd/src/net/osmand/plus/mapcontextmenu/MenuTitleController.java
@@ -145,7 +145,7 @@
 							if(Algorithms.isEmpty(streetName)) {
 								streetName = "";
 							}
-							if(Algorithms.isEmpty(ref)) {
+							if(!Algorithms.isEmpty(ref)) {
 								streetName += ", "+ ref;
 							}
 							streetStr = streetName;
