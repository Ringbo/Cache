diff --git a/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java b/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
index e52c666..fbd2849 100644
--- a/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
+++ b/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
@@ -1207,9 +1207,12 @@
 				int turn;
 				if (laneOptions[j].equals("none") || laneOptions[j].equals("through")) {
 					turn = TurnType.C;
-				} else if (laneOptions[j].equals("slight_right")) {
+					
+				} else if (laneOptions[j].equals("slight_right") || 
+						laneOptions[j].equals("merge_to_right")) {
 					turn = TurnType.TSLR;
-				} else if (laneOptions[j].equals("slight_left")) {
+				} else if (laneOptions[j].equals("slight_left") || 
+						laneOptions[j].equals("merge_to_left")) {
 					turn = TurnType.TSLL;
 				} else if (laneOptions[j].equals("right")) {
 					turn = TurnType.TR;
