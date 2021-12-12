diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index e0043fa..30dd17b 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -1167,7 +1167,7 @@
 
     @Override
     public int getVerticalScrollbarWidth() {
-        if (isEnabled()) {
+        if (isFastScrollAlwaysVisible()) {
             return Math.max(super.getVerticalScrollbarWidth(), mFastScroller.getWidth());
         }
         return super.getVerticalScrollbarWidth();
