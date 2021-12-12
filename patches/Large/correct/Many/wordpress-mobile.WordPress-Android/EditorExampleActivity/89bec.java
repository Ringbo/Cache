diff --git a/libs/editor/example/src/main/java/org/wordpress/android/editor/example/EditorExampleActivity.java b/libs/editor/example/src/main/java/org/wordpress/android/editor/example/EditorExampleActivity.java
index ae25d17..80f7b7c 100644
--- a/libs/editor/example/src/main/java/org/wordpress/android/editor/example/EditorExampleActivity.java
+++ b/libs/editor/example/src/main/java/org/wordpress/android/editor/example/EditorExampleActivity.java
@@ -252,7 +252,7 @@
                     while (count < 1.1) {
                         sleep(500);
 
-                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, false, count);
+                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, count);
 
                         count += 0.1;
                     }
@@ -284,7 +284,7 @@
                     while (count < 0.6) {
                         sleep(500);
 
-                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, false, count);
+                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, count);
 
                         count += 0.1;
                     }
@@ -312,7 +312,7 @@
                     while (count < 1.1) {
                         sleep(2000);
 
-                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, false, count);
+                        ((EditorMediaUploadListener) mEditorFragment).onMediaUploadProgress(mediaId, count);
 
                         count += 0.1;
                     }
