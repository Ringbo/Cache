diff --git a/src/rajawali/materials/TextureManager.java b/src/rajawali/materials/TextureManager.java
index 736bbc4..4244df2 100644
--- a/src/rajawali/materials/TextureManager.java
+++ b/src/rajawali/materials/TextureManager.java
@@ -279,7 +279,7 @@
 		        		for (int i = 0; i < buffer.length; i++) {
 		        			GLES20.glTexImage2D(GLES20.GL_TEXTURE_2D, i, bitmapFormat, w, h, 0, bitmapFormat, GLES20.GL_UNSIGNED_BYTE, buffer[i]);
 		        			w = w > 1 ? w / 2 : 1;
-		        			h = h > 1 ? w / 2 : 1;
+		        			h = h > 1 ? h / 2 : 1;
 		        		}
 	        		}
 	        	} else { 
@@ -290,7 +290,7 @@
 		        		for (int i = 0; i < buffer.length; i++) {
 	        				GLES20.glCompressedTexImage2D(GLES20.GL_TEXTURE_2D, i, compressionFormat, w, h, 0, buffer[i].capacity(), buffer[i]);
 	        				w = w > 1 ? w / 2 : 1;
-	        				h = h > 1 ? w / 2 : 1;
+	        				h = h > 1 ? h / 2 : 1;
 		        		}
 	        		}
 	        	}
