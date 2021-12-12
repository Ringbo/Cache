diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index 41890d6..3e0cd6b 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -5893,7 +5893,10 @@
             }
         }
 
-        protected boolean isLayoutRtl() {
+        /**
+         * @hide
+         */
+        public boolean isLayoutRtl() {
             return (layoutDirection == View.LAYOUT_DIRECTION_RTL);
         }
 
