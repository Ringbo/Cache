diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 6374aa2..7a2e478 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -488,7 +488,8 @@
         chooseSize(mErrorPopup, mError, tv);
         tv.setText(mError);
 
-        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY());
+        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY(),
+                Gravity.TOP | Gravity.LEFT);
         mErrorPopup.fixDirection(mErrorPopup.isAboveAnchor());
     }
 
