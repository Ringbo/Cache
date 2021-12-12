diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/gpu/SceneUploader.java b/runelite-client/src/main/java/net/runelite/client/plugins/gpu/SceneUploader.java
index 7749f82..778b386 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/gpu/SceneUploader.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/gpu/SceneUploader.java
@@ -475,7 +475,7 @@
 		int color3 = color3s[face];
 
 		int alpha = 0;
-		if (transparencies != null)
+		if (transparencies != null && (faceTextures == null || faceTextures[face] == -1))
 		{
 			alpha = (transparencies[face] & 0xFF) << 24;
 		}
