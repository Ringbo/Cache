diff --git a/src/org/anddev/andengine/opengl/texture/compressed/pvr/PVRCCZTexture.java b/src/org/anddev/andengine/opengl/texture/compressed/pvr/PVRCCZTexture.java
index a0ce2b4..b0c3f74 100644
--- a/src/org/anddev/andengine/opengl/texture/compressed/pvr/PVRCCZTexture.java
+++ b/src/org/anddev/andengine/opengl/texture/compressed/pvr/PVRCCZTexture.java
@@ -58,7 +58,7 @@
 
 	@Override
 	protected final InputStream getInputStream() throws IOException {
-		final InputStream inputStream = this.getInputStream();
+		final InputStream inputStream = this.onGetInputStream();
 
 		final CCZHeader cczHeader = new CCZHeader(StreamUtils.streamToBytes(inputStream, CCZHeader.SIZE));
 
