diff --git a/core/java/android/widget/Editor.java b/core/java/android/widget/Editor.java
index df97112..e065dc1 100644
--- a/core/java/android/widget/Editor.java
+++ b/core/java/android/widget/Editor.java
@@ -544,7 +544,8 @@
         chooseSize(mErrorPopup, mError, tv);
         tv.setText(mError);
 
-        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY());
+        mErrorPopup.showAsDropDown(mTextView, getErrorX(), getErrorY(),
+                Gravity.TOP | Gravity.LEFT);
         mErrorPopup.fixDirection(mErrorPopup.isAboveAnchor());
     }
 
