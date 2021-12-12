diff --git a/core/java/com/android/internal/app/ResolverActivity.java b/core/java/com/android/internal/app/ResolverActivity.java
index 80f4b99..ceb06f5 100644
--- a/core/java/com/android/internal/app/ResolverActivity.java
+++ b/core/java/com/android/internal/app/ResolverActivity.java
@@ -1941,7 +1941,8 @@
             final int checkedPos = mAdapterView.getCheckedItemPosition();
             final boolean hasValidSelection = checkedPos != ListView.INVALID_POSITION;
             if (!useLayoutWithDefault()
-                    && (!hasValidSelection || mLastSelected != checkedPos)) {
+                    && (!hasValidSelection || mLastSelected != checkedPos)
+                    && mAlwaysButton != null) {
                 setAlwaysButtonEnabled(hasValidSelection, checkedPos, true);
                 mOnceButton.setEnabled(hasValidSelection);
                 if (hasValidSelection) {
