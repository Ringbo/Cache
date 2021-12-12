diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index f9ca8cb..777beed 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -720,7 +720,7 @@
     @Override
     public void getFocusedRect(Rect r) {
         View view = getSelectedView();
-        if (view != null) {
+        if (view != null && view.getParent() == this) {
             // the focused rectangle of the selected view offset into the
             // coordinate space of this view.
             view.getFocusedRect(r);
