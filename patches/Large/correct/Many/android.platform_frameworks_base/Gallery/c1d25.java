diff --git a/core/java/android/widget/Gallery.java b/core/java/android/widget/Gallery.java
index e0c5bbd..c4ef11c 100644
--- a/core/java/android/widget/Gallery.java
+++ b/core/java/android/widget/Gallery.java
@@ -891,7 +891,7 @@
             lp = (Gallery.LayoutParams) generateDefaultLayoutParams();
         }
 
-        addViewInLayout(child, fromLeft != mIsRtl ? -1 : 0, lp);
+        addViewInLayout(child, fromLeft != mIsRtl ? -1 : 0, lp, true);
 
         child.setSelected(offset == 0);
 
