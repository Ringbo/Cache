diff --git a/src/main/java/com/pahimar/ee3/client/renderer/item/ItemCalcinatorRenderer.java b/src/main/java/com/pahimar/ee3/client/renderer/item/ItemCalcinatorRenderer.java
index 91f78be..208e388 100644
--- a/src/main/java/com/pahimar/ee3/client/renderer/item/ItemCalcinatorRenderer.java
+++ b/src/main/java/com/pahimar/ee3/client/renderer/item/ItemCalcinatorRenderer.java
@@ -89,7 +89,7 @@
         FMLClientHandler.instance().getClient().renderEngine.bindTexture(Textures.MODEL_CALCINATOR);
 
         // Render
-        modelCalcinator.render();
+        modelCalcinator.renderPart("Calcinator");
 
         GL11.glEnable(GL11.GL_LIGHTING);
         GL11.glPopMatrix();
