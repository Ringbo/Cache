diff --git a/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GalleryProvider.java b/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GalleryProvider.java
index 9f1a3bc..1c15455 100644
--- a/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GalleryProvider.java
+++ b/source-gallery/src/main/java/com/google/android/apps/muzei/gallery/GalleryProvider.java
@@ -339,7 +339,7 @@
                         writeUriToFile(context, imageUri, getCacheFileForUri(context, imageUri));
                     } catch (IOException e) {
                         Log.e(TAG, "Error downloading gallery image " + imageUri, e);
-                        throw new SQLException("Error downloading gallery image " + imageUri);
+                        throw new SQLException("Error downloading gallery image " + imageUri, e);
                     }
                 }
             }
