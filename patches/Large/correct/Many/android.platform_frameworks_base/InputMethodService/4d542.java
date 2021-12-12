diff --git a/core/java/android/inputmethodservice/InputMethodService.java b/core/java/android/inputmethodservice/InputMethodService.java
index 8937490..8f751ef 100644
--- a/core/java/android/inputmethodservice/InputMethodService.java
+++ b/core/java/android/inputmethodservice/InputMethodService.java
@@ -1464,12 +1464,12 @@
     
     public void showStatusIcon(@DrawableRes int iconResId) {
         mStatusIcon = iconResId;
-        mImm.showStatusIcon(mToken, getPackageName(), iconResId);
+        mImm.showStatusIconInternal(mToken, getPackageName(), iconResId);
     }
     
     public void hideStatusIcon() {
         mStatusIcon = 0;
-        mImm.hideStatusIcon(mToken);
+        mImm.hideStatusIconInternal(mToken);
     }
     
     /**
@@ -1480,7 +1480,7 @@
      * @param id Unique identifier of the new input method ot start.
      */
     public void switchInputMethod(String id) {
-        mImm.setInputMethod(mToken, id);
+        mImm.setInputMethodInternal(mToken, id);
     }
     
     public void setExtractView(View view) {
