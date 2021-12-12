diff --git a/ChipsLayoutManager/src/main/java/com/beloo/widget/spanlayoutmanager/layouter/RTLDownLayouter.java b/ChipsLayoutManager/src/main/java/com/beloo/widget/spanlayoutmanager/layouter/RTLDownLayouter.java
index 9a04181..c8182d9 100644
--- a/ChipsLayoutManager/src/main/java/com/beloo/widget/spanlayoutmanager/layouter/RTLDownLayouter.java
+++ b/ChipsLayoutManager/src/main/java/com/beloo/widget/spanlayoutmanager/layouter/RTLDownLayouter.java
@@ -35,7 +35,7 @@
 
     @Override
     void addView(View view) {
-        layoutManager.addView(view, 0);
+        layoutManager.addView(view);
     }
 
     @Override
