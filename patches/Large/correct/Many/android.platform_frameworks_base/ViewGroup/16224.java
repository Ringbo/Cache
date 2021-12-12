diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index a7e739d..506cd37 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -793,7 +793,8 @@
     @Override
     public ActionMode startActionModeForChild(
             View originalView, ActionMode.Callback callback, int type) {
-        if ((mGroupFlags & FLAG_START_ACTION_MODE_FOR_CHILD_IS_NOT_TYPED) == 0) {
+        if ((mGroupFlags & FLAG_START_ACTION_MODE_FOR_CHILD_IS_NOT_TYPED) == 0
+                && type == ActionMode.TYPE_PRIMARY) {
             ActionMode mode;
             try {
                 mGroupFlags |= FLAG_START_ACTION_MODE_FOR_CHILD_IS_TYPED;
