diff --git a/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java b/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
index c687db0..6bff0f5 100644
--- a/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
+++ b/OsmAnd-java/src/net/osmand/router/RouteResultPreparation.java
@@ -440,11 +440,11 @@
 				}
 				if (ut) {
 					tnext.setSkipToSpeak(true);
-					if (tl && TurnType.isLeftTurnNoUTurn(t.getValue())) {
+					if (tl && TurnType.isLeftTurnNoUTurn(tnext.getValue())) {
 						TurnType tt = TurnType.valueOf(TurnType.TU, false);
 						tt.setLanes(t.getLanes());
 						return tt;
-					} else if (tr && TurnType.isRightTurnNoUTurn(t.getValue())) {
+					} else if (tr && TurnType.isRightTurnNoUTurn(tnext.getValue())) {
 						TurnType tt = TurnType.valueOf(TurnType.TU, true);
 						tt.setLanes(t.getLanes());
 						return tt;
