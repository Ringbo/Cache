diff --git a/src/org/wordpress/android/util/PostUploadService.java b/src/org/wordpress/android/util/PostUploadService.java
index e3534a1..d20dcfe 100644
--- a/src/org/wordpress/android/util/PostUploadService.java
+++ b/src/org/wordpress/android/util/PostUploadService.java
@@ -583,7 +583,7 @@
                 }
 
                 if (TextUtils.isEmpty(mimeType)) {
-                    mimeType = getMediaFileMimeType(imageFile, false);
+                    mimeType = getMediaFileMimeType(imageFile, true);
                 }
                 String fileName = getMediaFileName(imageFile, mimeType);
 
