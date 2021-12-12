diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index c4c3242..27f493a 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -3327,7 +3327,7 @@
                     child.mRenderNode.setClipToBounds(clipChildren);
                 }
             }
-            invalidate();
+            invalidate(true);
         }
     }
 
@@ -3342,7 +3342,7 @@
     public void setClipToPadding(boolean clipToPadding) {
         if (hasBooleanFlag(FLAG_CLIP_TO_PADDING) != clipToPadding) {
             setBooleanFlag(FLAG_CLIP_TO_PADDING, clipToPadding);
-            invalidate();
+            invalidate(true);
         }
     }
 
