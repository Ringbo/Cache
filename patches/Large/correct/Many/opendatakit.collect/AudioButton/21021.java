diff --git a/collect_app/src/main/java/org/odk/collect/android/views/AudioButton.java b/collect_app/src/main/java/org/odk/collect/android/views/AudioButton.java
index 463530a..ad8ee68 100644
--- a/collect_app/src/main/java/org/odk/collect/android/views/AudioButton.java
+++ b/collect_app/src/main/java/org/odk/collect/android/views/AudioButton.java
@@ -93,7 +93,7 @@
                 mediaPlayer.start();
             } catch (IOException e) {
                 String errorMsg = c.getString(R.string.audio_file_invalid, audioFilename);
-                Timber.e(e, errorMsg);
+                Timber.e(errorMsg);
                 ToastUtils.showLongToast(errorMsg);
             }
 
