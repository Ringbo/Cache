diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index d73b5ca..9af8f2c 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -5995,7 +5995,10 @@
             }
         }
 
-        protected boolean isLayoutRtl() {
+        /**
+         * @hide
+         */
+        public boolean isLayoutRtl() {
             return (layoutDirection == View.LAYOUT_DIRECTION_RTL);
         }
 
