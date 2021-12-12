diff --git a/collect_app/src/main/java/org/odk/collect/android/widgets/ExStringWidget.java b/collect_app/src/main/java/org/odk/collect/android/widgets/ExStringWidget.java
index 94a35c5..6a883a4 100644
--- a/collect_app/src/main/java/org/odk/collect/android/widgets/ExStringWidget.java
+++ b/collect_app/src/main/java/org/odk/collect/android/widgets/ExStringWidget.java
@@ -107,7 +107,7 @@
         mAnswer.setTextSize(TypedValue.COMPLEX_UNIT_DIP, mAnswerFontsize);
         mAnswer.setLayoutParams(params);
         mTextBackground = mAnswer.getBackground();
-        mAnswer.setBackgroundDrawable(null);
+        mAnswer.setBackground(null);
 
         // capitalize nothing
         mAnswer.setKeyListener(new TextKeyListener(Capitalize.NONE, false));
@@ -122,7 +122,7 @@
         }
 
         if (mPrompt.isReadOnly()) {
-            mAnswer.setBackgroundDrawable(null);
+            mAnswer.setBackground(null);
         }
 
         if (mPrompt.isReadOnly() || mHasExApp) {
@@ -172,7 +172,7 @@
             private void onException(String toastText) {
                 mHasExApp = false;
                 if (!mPrompt.isReadOnly()) {
-                    mAnswer.setBackgroundDrawable(mTextBackground);
+                    mAnswer.setBackground(mTextBackground);
                     mAnswer.setFocusable(true);
                     mAnswer.setFocusableInTouchMode(true);
                     mAnswer.setClickable(true);
