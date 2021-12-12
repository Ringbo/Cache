diff --git a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/swipe/SwipeLayout.java b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/swipe/SwipeLayout.java
index 1d58463..4d9d3a3 100755
--- a/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/swipe/SwipeLayout.java
+++ b/UltimateRecyclerView/ultimaterecyclerview/src/main/java/com/marshalchen/ultimaterecyclerview/swipe/SwipeLayout.java
@@ -1510,8 +1510,8 @@
         setCurrentDragEdge(dragEdge);
     }
 
-
-    protected void onViewRemoved(View child) {
+    @Override
+    public void onViewRemoved(View child) {
         for (Map.Entry<DragEdge, View> entry : new HashMap<DragEdge, View>(mDragEdges).entrySet()) {
             if (entry.getValue() == child) {
                 mDragEdges.remove(entry.getKey());
