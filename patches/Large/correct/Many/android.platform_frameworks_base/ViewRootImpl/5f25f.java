diff --git a/core/java/android/view/ViewRootImpl.java b/core/java/android/view/ViewRootImpl.java
index 354e815..0f9a2ac 100644
--- a/core/java/android/view/ViewRootImpl.java
+++ b/core/java/android/view/ViewRootImpl.java
@@ -1449,7 +1449,7 @@
                             }
 
                             DisplayList displayList = mView.mDisplayList;
-                            if (displayList != null) {
+                            if (displayList != null && displayList.isValid()) {
                                 layerCanvas.drawDisplayList(displayList, null,
                                         DisplayList.FLAG_CLIP_CHILDREN);
                             } else {
