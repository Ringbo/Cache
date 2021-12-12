diff --git a/core/java/com/android/internal/widget/ResolverDrawerLayout.java b/core/java/com/android/internal/widget/ResolverDrawerLayout.java
index 8b9d503..e84cc27 100644
--- a/core/java/com/android/internal/widget/ResolverDrawerLayout.java
+++ b/core/java/com/android/internal/widget/ResolverDrawerLayout.java
@@ -245,7 +245,7 @@
                 final float y = ev.getY();
                 mInitialTouchX = x;
                 mInitialTouchY = mLastTouchY = y;
-                mOpenOnClick = isListChildUnderClipped(x, y) && mCollapsibleHeight > 0;
+                mOpenOnClick = isListChildUnderClipped(x, y) && mCollapseOffset > 0;
             }
             break;
 
