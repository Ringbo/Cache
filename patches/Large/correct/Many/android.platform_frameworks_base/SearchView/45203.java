diff --git a/core/java/android/widget/SearchView.java b/core/java/android/widget/SearchView.java
index 1820c3f..dcd58b0 100644
--- a/core/java/android/widget/SearchView.java
+++ b/core/java/android/widget/SearchView.java
@@ -824,7 +824,7 @@
             invalidate();
         }
         updateVoiceButton(!hasText);
-        updateViewsVisibility(mIconifiedByDefault);
+        updateCloseButton();
         if (mOnQueryChangeListener != null) {
             mOnQueryChangeListener.onQueryTextChanged(newText.toString());
         }
