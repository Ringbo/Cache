diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 9568492..c5632ec9 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -1621,7 +1621,8 @@
                 // We can remember the focused view to restore after re-layout
                 // if the data hasn't changed, or if the focused position is a
                 // header or footer.
-                if (!dataChanged || isDirectChildHeaderOrFooter(focusedChild)) {
+                if (!dataChanged || isDirectChildHeaderOrFooter(focusedChild)
+                        || focusedChild.hasTransientState() || mAdapterHasStableIds) {
                     focusLayoutRestoreDirectChild = focusedChild;
                     // Remember the specific view that had focus.
                     focusLayoutRestoreView = findFocus();
