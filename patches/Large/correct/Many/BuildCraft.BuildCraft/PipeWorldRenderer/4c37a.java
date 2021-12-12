diff --git a/common/buildcraft/transport/render/PipeWorldRenderer.java b/common/buildcraft/transport/render/PipeWorldRenderer.java
index dc481e0..7e98df5 100644
--- a/common/buildcraft/transport/render/PipeWorldRenderer.java
+++ b/common/buildcraft/transport/render/PipeWorldRenderer.java
@@ -518,7 +518,7 @@
 	}
 	
 	private boolean shouldRenderNormalPipeSide(PipeRenderState state, ForgeDirection direction){
-		return !state.pipeConnectionMatrix.isConnected(direction) && state.facadeMatrix.getFacadeBlockId(direction) != 0;
+		return !state.pipeConnectionMatrix.isConnected(direction) && state.facadeMatrix.getFacadeBlockId(direction) == 0;
 	}
 
 	@Override
