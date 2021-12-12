diff --git a/common/buildcraft/energy/render/RenderEngine.java b/common/buildcraft/energy/render/RenderEngine.java
index eed3524..08058fb 100644
--- a/common/buildcraft/energy/render/RenderEngine.java
+++ b/common/buildcraft/energy/render/RenderEngine.java
@@ -168,7 +168,7 @@
 		bindTexture(chamberTexture);
 
 		float chamberf = 2F / 16F;
-		int chamberc = ((int) step + 2) / 2;
+		int chamberc = ((int) step + 4) / 2;
 
 		for (int i = 0; i <= step + 2; i += 2) {
 			chamber.render(factor);
