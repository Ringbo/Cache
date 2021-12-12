diff --git a/common/buildcraft/core/render/RenderEntityBlock.java b/common/buildcraft/core/render/RenderEntityBlock.java
index f8ac485..11955ee 100644
--- a/common/buildcraft/core/render/RenderEntityBlock.java
+++ b/common/buildcraft/core/render/RenderEntityBlock.java
@@ -164,7 +164,7 @@
 					lightZ = (int) (Math.floor(entity.posZ) + kBase);
 
 					GL11.glDisable(2896 /* GL_LIGHTING */);
-					renderBlock(util, world, lightX, lightY, lightZ, false, true);
+					renderBlock(util, world, 0, 0, 0, lightX, lightY, lightZ, false, true);
 					GL11.glEnable(2896 /* GL_LIGHTING */);
 					GL11.glPopMatrix();
 
