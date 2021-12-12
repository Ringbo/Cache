diff --git a/core/java/android/webkit/WebViewClassic.java b/core/java/android/webkit/WebViewClassic.java
index 67041ac..c7dacf3 100644
--- a/core/java/android/webkit/WebViewClassic.java
+++ b/core/java/android/webkit/WebViewClassic.java
@@ -5419,7 +5419,7 @@
         ClipData clipData = cm.getPrimaryClip();
         if (clipData != null) {
             ClipData.Item clipItem = clipData.getItemAt(0);
-            CharSequence pasteText = clipItem.getText();
+            CharSequence pasteText = clipItem.coerceToText(mContext);
             if (mInputConnection != null) {
                 mInputConnection.replaceSelection(pasteText);
             }
