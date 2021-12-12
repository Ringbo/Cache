diff --git a/core/java/com/android/internal/policy/DecorView.java b/core/java/com/android/internal/policy/DecorView.java
index d4ada95..b2ae835 100644
--- a/core/java/com/android/internal/policy/DecorView.java
+++ b/core/java/com/android/internal/policy/DecorView.java
@@ -1706,7 +1706,9 @@
             mDecorCaptionView.addView(root,
                     new ViewGroup.MarginLayoutParams(MATCH_PARENT, MATCH_PARENT));
         } else {
-            addView(root, new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT));
+
+            // Put it below the color views.
+            addView(root, 0, new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT));
         }
         mContentRoot = (ViewGroup) root;
         initializeElevation();
