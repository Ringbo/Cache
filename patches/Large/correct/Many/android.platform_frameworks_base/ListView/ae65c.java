diff --git a/core/java/android/widget/ListView.java b/core/java/android/widget/ListView.java
index 1f29b16..946f009 100644
--- a/core/java/android/widget/ListView.java
+++ b/core/java/android/widget/ListView.java
@@ -2428,7 +2428,7 @@
         if (mItemsCanFocus && (focusResult == null)
                 && selectedView != null && selectedView.hasFocus()) {
             final View focused = selectedView.findFocus();
-            if (distanceToView(focused) > 0) {
+            if (!isViewAncestorOf(focused, this) || distanceToView(focused) > 0) {
                 focused.clearFocus();
             }
         }
