diff --git a/packages/SystemUI/src/com/android/systemui/qs/PageIndicator.java b/packages/SystemUI/src/com/android/systemui/qs/PageIndicator.java
index b22ea4c..2629f30 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/PageIndicator.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/PageIndicator.java
@@ -24,7 +24,7 @@
     // The size of a single dot in relation to the whole animation.
     private static final float SINGLE_SCALE = .4f;
 
-    private static final float MINOR_ALPHA = .3f;
+    private static final float MINOR_ALPHA = .42f;
 
     private final ArrayList<Integer> mQueuedPositions = new ArrayList<>();
 
@@ -53,7 +53,7 @@
             removeViewAt(getChildCount() - 1);
         }
         TypedArray array = getContext().obtainStyledAttributes(
-                new int[]{android.R.attr.colorForeground});
+                new int[]{android.R.attr.colorControlActivated});
         int color = array.getColor(0, 0);
         array.recycle();
         while (numPages > getChildCount()) {
