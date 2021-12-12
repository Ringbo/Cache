diff --git a/buildcraft_client/buildcraft/energy/RenderEngine.java b/buildcraft_client/buildcraft/energy/RenderEngine.java
index 6754e5f..ab4a594 100644
--- a/buildcraft_client/buildcraft/energy/RenderEngine.java
+++ b/buildcraft_client/buildcraft/energy/RenderEngine.java
@@ -39,25 +39,25 @@
 	public RenderEngine() {
 
 		// constructor:
-		box = new ModelRenderer(model, 0, 0);
+		box = new ModelRenderer(model, 0, 1);
 		box.addBox(-8F, -8F, -8F, 16, 4, 16);
 		box.rotationPointX = 8;
 		box.rotationPointY = 8;
 		box.rotationPointZ = 8;
 
-		trunk = new ModelRenderer(model, 0, 0);
+		trunk = new ModelRenderer(model, 1, 1);
 		trunk.addBox(-4F, -4F, -4F, 8, 12, 8);
 		trunk.rotationPointX = 8F;
 		trunk.rotationPointY = 8F;
 		trunk.rotationPointZ = 8F;
 
-		movingBox = new ModelRenderer(model, 0, 0);
+		movingBox = new ModelRenderer(model, 0, 1);
 		movingBox.addBox(-8F, -4, -8F, 16, 4, 16);
 		movingBox.rotationPointX = 8F;
 		movingBox.rotationPointY = 8F;
 		movingBox.rotationPointZ = 8F;
 
-		chamber = new ModelRenderer(model, 0, 0);
+		chamber = new ModelRenderer(model, 1, 1);
 		chamber.addBox(-5F, -4, -5F, 10, 2, 10);
 		chamber.rotationPointX = 8F;
 		chamber.rotationPointY = 8F;
