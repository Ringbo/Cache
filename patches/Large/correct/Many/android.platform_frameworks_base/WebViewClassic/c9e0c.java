diff --git a/core/java/android/webkit/WebViewClassic.java b/core/java/android/webkit/WebViewClassic.java
index 0024fd3..4db9f6c 100644
--- a/core/java/android/webkit/WebViewClassic.java
+++ b/core/java/android/webkit/WebViewClassic.java
@@ -5416,7 +5416,7 @@
         ClipData clipData = cm.getPrimaryClip();
         if (clipData != null) {
             ClipData.Item clipItem = clipData.getItemAt(0);
-            CharSequence pasteText = clipItem.getText();
+            CharSequence pasteText = clipItem.coerceToText(mContext);
             if (mInputConnection != null) {
                 mInputConnection.replaceSelection(pasteText);
             }
