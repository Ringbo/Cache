diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index 92e8f44..5f2b3d0 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -493,7 +493,8 @@
         chooseSize(mErrorPopup, mError, tv);
         tv.setText(mError);
 
-        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY());
+        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY(),
+                Gravity.TOP | Gravity.LEFT);
         mErrorPopup.fixDirection(mErrorPopup.isAboveAnchor());
     }
 
