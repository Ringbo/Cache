diff --git a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
index 69ea262..0602400 100644
--- a/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
+++ b/DataExtractionOSM/src/net/osmand/router/BinaryRoutePlanner.java
@@ -1019,7 +1019,7 @@
 					t = TurnType.valueOf(TurnType.TSLL, leftSide);
 				} else if (mpi < 120) {
 					t = TurnType.valueOf(TurnType.TL, leftSide);
-				} else if (mpi < 135) {
+				} else if (mpi < 135 || leftSide) {
 					t = TurnType.valueOf(TurnType.TSHL, leftSide);
 				} else {
 					t = TurnType.valueOf(TurnType.TU, leftSide);
@@ -1029,7 +1029,7 @@
 					t = TurnType.valueOf(TurnType.TSLR, leftSide);
 				} else if (mpi > -120) {
 					t = TurnType.valueOf(TurnType.TR, leftSide);
-				} else if (mpi > -135) {
+				} else if (mpi > -135 || !leftSide) {
 					t = TurnType.valueOf(TurnType.TSHR, leftSide);
 				} else {
 					t = TurnType.valueOf(TurnType.TU, leftSide);
