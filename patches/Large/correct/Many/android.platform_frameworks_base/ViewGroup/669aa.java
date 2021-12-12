diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index f1d0cc0..db1c00a 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -5904,7 +5904,10 @@
             }
         }
 
-        protected boolean isLayoutRtl() {
+        /**
+         * @hide
+         */
+        public boolean isLayoutRtl() {
             return (layoutDirection == View.LAYOUT_DIRECTION_RTL);
         }
 
