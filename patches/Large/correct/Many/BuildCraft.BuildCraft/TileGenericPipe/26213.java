diff --git a/common/buildcraft/transport/TileGenericPipe.java b/common/buildcraft/transport/TileGenericPipe.java
index 128ba1c..41eab32 100644
--- a/common/buildcraft/transport/TileGenericPipe.java
+++ b/common/buildcraft/transport/TileGenericPipe.java
@@ -59,7 +59,7 @@
 	private class CoreState implements IClientState {
 
 		public int pipeId = -1;
-		public int gateKind = 0;
+		public int gateKind = -1;
 
 		@Override
 		public void writeData(DataOutputStream data) throws IOException {
@@ -613,7 +613,7 @@
 				if (pipe == null && coreState.pipeId != 0){
 					initialize(BlockGenericPipe.createPipe(coreState.pipeId));
 				}
-				if (pipe != null) {
+				if (pipe != null && GateKind.values()[coreState.gateKind] != GateKind.None) {
 					if (pipe.gate == null) {
 						pipe.gate = new GateVanilla(pipe);
 					}
