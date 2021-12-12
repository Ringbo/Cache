diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 20e2c46..f60aba3 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -1570,7 +1570,7 @@
         if (mInstallGesturesOverlay) {
             installGesturesOverlay();
             positionGesturesPopup();
-        } else if (mGesturesPopup != null) {
+        } else if (mGesturesPopup != null && mGesturesPopup.isShowing()) {
             mGesturesPopup.update(w, h);
         }
     }
