diff --git a/DataExtractionOSM/src/net/osmand/router/RouteResultPreparation.java b/DataExtractionOSM/src/net/osmand/router/RouteResultPreparation.java
index 48e7d34..92875d9 100644
--- a/DataExtractionOSM/src/net/osmand/router/RouteResultPreparation.java
+++ b/DataExtractionOSM/src/net/osmand/router/RouteResultPreparation.java
@@ -314,7 +314,7 @@
 					t = TurnType.valueOf(TurnType.TSLL, leftSide);
 				} else if (mpi < 120) {
 					t = TurnType.valueOf(TurnType.TL, leftSide);
-				} else if (mpi < 135) {
+				} else if (mpi < 135 || leftSide) {
 					t = TurnType.valueOf(TurnType.TSHL, leftSide);
 				} else {
 					t = TurnType.valueOf(TurnType.TU, leftSide);
@@ -324,7 +324,7 @@
 					t = TurnType.valueOf(TurnType.TSLR, leftSide);
 				} else if (mpi > -120) {
 					t = TurnType.valueOf(TurnType.TR, leftSide);
-				} else if (mpi > -135) {
+				} else if (mpi > -135 || !leftSide) {
 					t = TurnType.valueOf(TurnType.TSHR, leftSide);
 				} else {
 					t = TurnType.valueOf(TurnType.TU, leftSide);
