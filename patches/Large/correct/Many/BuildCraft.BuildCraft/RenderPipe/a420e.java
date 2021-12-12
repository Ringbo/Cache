diff --git a/common/buildcraft/transport/render/RenderPipe.java b/common/buildcraft/transport/render/RenderPipe.java
index 7be4d55..705221f 100644
--- a/common/buildcraft/transport/render/RenderPipe.java
+++ b/common/buildcraft/transport/render/RenderPipe.java
@@ -297,10 +297,10 @@
 		for (int i = 0; i < 6; ++i) {
 			GL11.glPushMatrix();
 
-			GL11.glTranslatef(0.5F, 0.0F, 0.5F);
+			GL11.glTranslatef(0.5F, 0.5F, 0.5F);
 			GL11.glRotatef(angleY[i], 0, 1, 0);
 			GL11.glRotatef(angleZ[i], 0, 0, 1);
-			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
+			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
 
 			if (pow.displayPower[i] >= 1.0) {
 				short stage = pow.displayPower[i];
