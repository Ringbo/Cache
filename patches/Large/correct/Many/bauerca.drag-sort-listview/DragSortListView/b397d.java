diff --git a/src/com/mobeta/android/dslv/DragSortListView.java b/src/com/mobeta/android/dslv/DragSortListView.java
index d561fda..2a731d2 100644
--- a/src/com/mobeta/android/dslv/DragSortListView.java
+++ b/src/com/mobeta/android/dslv/DragSortListView.java
@@ -451,7 +451,7 @@
 
             boolean useDefault = a.getBoolean(
                     R.styleable.DragSortListView_use_default_controller,
-                    false);
+                    true);
 
             if (useDefault) {
                 boolean removeEnabled = a.getBoolean(
