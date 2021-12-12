diff --git a/media/java/android/media/tv/TvInputManager.java b/media/java/android/media/tv/TvInputManager.java
index f809f54..78714d2 100644
--- a/media/java/android/media/tv/TvInputManager.java
+++ b/media/java/android/media/tv/TvInputManager.java
@@ -535,7 +535,7 @@
             mHandler.post(new Runnable() {
                 @Override
                 public void run() {
-                    mListener.onInputUpdated(inputId);
+                    mCallback.onInputUpdated(inputId);
                 }
             });
         }
@@ -732,7 +732,7 @@
             @Override
             public void onInputUpdated(String inputId) {
                 synchronized (mLock) {
-                    for (TvInputListenerRecord record : mTvInputListenerRecordsList) {
+                    for (TvInputCallbackRecord record : mCallbackRecords) {
                         record.postInputUpdated(inputId);
                     }
                 }
