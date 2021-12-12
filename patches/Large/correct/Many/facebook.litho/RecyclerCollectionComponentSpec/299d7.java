diff --git a/litho-sections-widget/src/main/java/com/facebook/litho/sections/widget/RecyclerCollectionComponentSpec.java b/litho-sections-widget/src/main/java/com/facebook/litho/sections/widget/RecyclerCollectionComponentSpec.java
index 0bbbf93..fad8007 100644
--- a/litho-sections-widget/src/main/java/com/facebook/litho/sections/widget/RecyclerCollectionComponentSpec.java
+++ b/litho-sections-widget/src/main/java/com/facebook/litho/sections/widget/RecyclerCollectionComponentSpec.java
@@ -183,8 +183,8 @@
             .recyclerViewId(recyclerViewId)
             .overScrollMode(overScrollMode)
             .recyclerEventsController(internalEventsController)
-            .refreshHandler(canPTR ? null : RecyclerCollectionComponent.onRefresh(c, sectionTree))
-            .pullToRefresh(!canPTR)
+            .refreshHandler(!canPTR ? null : RecyclerCollectionComponent.onRefresh(c, sectionTree))
+            .pullToRefresh(canPTR)
             .itemDecoration(itemDecoration)
             .canMeasure(canMeasureRecycler)
             .horizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled)
