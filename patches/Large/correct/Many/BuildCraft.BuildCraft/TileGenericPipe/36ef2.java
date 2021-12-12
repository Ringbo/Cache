diff --git a/common/buildcraft/transport/TileGenericPipe.java b/common/buildcraft/transport/TileGenericPipe.java
index 1182842..f6f8cbd 100644
--- a/common/buildcraft/transport/TileGenericPipe.java
+++ b/common/buildcraft/transport/TileGenericPipe.java
@@ -611,7 +611,7 @@
 				if (pipe == null && coreState.pipeId != 0){
 					initialize(BlockGenericPipe.createPipe(coreState.pipeId));
 				}
-				if (pipe != null) {
+				if (pipe != null && coreState.gateKind != GateKind.None.ordinal()) {
 					if (pipe.gate == null) {
 						pipe.gate = new GateVanilla(pipe);
 					}
