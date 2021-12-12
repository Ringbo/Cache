diff --git a/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java b/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
index 3a4c3d1..8780842 100644
--- a/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
+++ b/library-core/src/main/java/com/mikepenz/iconics/IconicsDrawable.java
@@ -888,7 +888,7 @@
     @Override
     protected boolean onStateChange(int[] stateSet) {
         boolean ret = false;
-        if (mIconColor != null) {
+        if (mIconColor != null && mIconColor.isStateful()) {
             updateIconColor();
             ret = true;
         }
