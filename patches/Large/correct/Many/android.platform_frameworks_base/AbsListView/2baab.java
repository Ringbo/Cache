diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index f2692da..50cdc0e 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -3252,7 +3252,7 @@
                                     ((TransitionDrawable) d).resetTransition();
                                 }
                             }
-                            d.setHotspot(x, y);
+                            mSelector.setHotspot(x, y);
                         }
 
                         if (longClickable) {
