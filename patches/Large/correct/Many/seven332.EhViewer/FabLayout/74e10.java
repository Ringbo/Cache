diff --git a/app/src/main/java/com/hippo/widget/FabLayout.java b/app/src/main/java/com/hippo/widget/FabLayout.java
index 4fa3558..913e7d1 100644
--- a/app/src/main/java/com/hippo/widget/FabLayout.java
+++ b/app/src/main/java/com/hippo/widget/FabLayout.java
@@ -353,11 +353,11 @@
     public void onClick(View v) {
         if (this == v) {
             setExpanded(false);
-        } else if (mOnClickFabListener != null && mExpanded) {
+        } else if (mOnClickFabListener != null) {
             int position = indexOfChild(v);
             if (position == getChildCount() - 1) {
                 mOnClickFabListener.onClickPrimaryFab(this, (FloatingActionButton) v);
-            } else if (position >= 0) {
+            } else if (position >= 0 && mExpanded) {
                 mOnClickFabListener.onClickSecondaryFab(this, (FloatingActionButton) v, position);
             }
         }
