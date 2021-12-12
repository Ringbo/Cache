diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index 339038e..dac02fa 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -763,19 +763,19 @@
         }
 
         // Figure out maximum size available to this view
-        int maxAvailable = tempEnd - tempStart;
+        final int maxAvailable = tempEnd - tempStart;
 
         if (childStart != VALUE_NOT_SET && childEnd != VALUE_NOT_SET) {
-            // Constraints fixed both edges, so child must be an exact size
+            // Constraints fixed both edges, so child must be an exact size.
             childSpecMode = MeasureSpec.EXACTLY;
-            childSpecSize = maxAvailable;
+            childSpecSize = Math.max(0, maxAvailable);
         } else {
             if (childSize >= 0) {
-                // Child wanted an exact size. Give as much as possible
+                // Child wanted an exact size. Give as much as possible.
                 childSpecMode = MeasureSpec.EXACTLY;
 
                 if (maxAvailable >= 0) {
-                    // We have a maxmum size in this dimension.
+                    // We have a maximum size in this dimension.
                     childSpecSize = Math.min(maxAvailable, childSize);
                 } else {
                     // We can grow in this dimension.
@@ -783,20 +783,19 @@
                 }
             } else if (childSize == LayoutParams.MATCH_PARENT) {
                 // Child wanted to be as big as possible. Give all available
-                // space
+                // space.
                 childSpecMode = MeasureSpec.EXACTLY;
-                childSpecSize = maxAvailable;
+                childSpecSize = Math.max(0, maxAvailable);
             } else if (childSize == LayoutParams.WRAP_CONTENT) {
-                // Child wants to wrap content. Use AT_MOST
-                // to communicate available space if we know
-                // our max size
+                // Child wants to wrap content. Use AT_MOST to communicate
+                // available space if we know our max size.
                 if (maxAvailable >= 0) {
                     // We have a maximum size in this dimension.
                     childSpecMode = MeasureSpec.AT_MOST;
                     childSpecSize = maxAvailable;
                 } else {
                     // We can grow in this dimension. Child can be as big as it
-                    // wants
+                    // wants.
                     childSpecMode = MeasureSpec.UNSPECIFIED;
                     childSpecSize = 0;
                 }
