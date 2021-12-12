diff --git a/core/java/android/view/ViewGroup.java b/core/java/android/view/ViewGroup.java
index a02e76b..1e72625 100644
--- a/core/java/android/view/ViewGroup.java
+++ b/core/java/android/view/ViewGroup.java
@@ -4386,7 +4386,7 @@
             // Make sure we do not set both flags at the same time
             int opaqueFlag = isOpaque ? PFLAG_DIRTY_OPAQUE : PFLAG_DIRTY;
 
-            if (child.mLayerType == LAYER_TYPE_SOFTWARE) {
+            if (child.mLayerType != LAYER_TYPE_NONE) {
                 mPrivateFlags |= PFLAG_INVALIDATED;
                 mPrivateFlags &= ~PFLAG_DRAWING_CACHE_VALID;
             }
@@ -4497,7 +4497,7 @@
                 location[CHILD_LEFT_INDEX] = left;
                 location[CHILD_TOP_INDEX] = top;
 
-                if (mLayerType == LAYER_TYPE_SOFTWARE) {
+                if (mLayerType != LAYER_TYPE_NONE) {
                     mPrivateFlags |= PFLAG_INVALIDATED;
                 }
 
@@ -4515,7 +4515,7 @@
                     dirty.union(0, 0, mRight - mLeft, mBottom - mTop);
                 }
 
-                if (mLayerType == LAYER_TYPE_SOFTWARE) {
+                if (mLayerType != LAYER_TYPE_NONE) {
                     mPrivateFlags |= PFLAG_INVALIDATED;
                 }
 
