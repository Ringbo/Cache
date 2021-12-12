diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java b/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
index ee7206f..fe2733b 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/stack/StackScrollAlgorithm.java
@@ -171,7 +171,10 @@
         for (int i = 0; i < childCount; i++) {
             View child = algorithmState.visibleChildren.get(i);
             StackScrollState.ViewState childViewState = resultState.getViewStateForView(child);
-            childViewState.belowSpeedBump = speedBumpIndex != -1 && i > speedBumpIndex;
+
+            // The speed bump can also be gone, so equality needs to be taken when comparing
+            // indices.
+            childViewState.belowSpeedBump = speedBumpIndex != -1 && i >= speedBumpIndex;
         }
     }
 
