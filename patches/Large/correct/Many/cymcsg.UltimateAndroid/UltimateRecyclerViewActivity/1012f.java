diff --git a/UltimateAndroidGradle/demoofui/src/main/java/com/marshalchen/common/demoofui/ultimaterecyclerview/UltimateRecyclerViewActivity.java b/UltimateAndroidGradle/demoofui/src/main/java/com/marshalchen/common/demoofui/ultimaterecyclerview/UltimateRecyclerViewActivity.java
index 7b2495a..ff6bca5 100644
--- a/UltimateAndroidGradle/demoofui/src/main/java/com/marshalchen/common/demoofui/ultimaterecyclerview/UltimateRecyclerViewActivity.java
+++ b/UltimateAndroidGradle/demoofui/src/main/java/com/marshalchen/common/demoofui/ultimaterecyclerview/UltimateRecyclerViewActivity.java
@@ -106,7 +106,7 @@
             }
         });
 
-        ultimateRecyclerView.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
+        ultimateRecyclerView.setDefaultOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
             @Override
             public void onRefresh() {
                 new Handler().postDelayed(new Runnable() {
@@ -175,7 +175,7 @@
                             toolbar.startActionMode(UltimateRecyclerViewActivity.this);
                             toggleSelection(position);
                             dragDropTouchListener.startDrag();
-                            ultimateRecyclerView.enableSwipeRefresh(false);
+                            ultimateRecyclerView.enableDefaultSwipeRefresh(false);
                         }
 
                     }
@@ -221,7 +221,7 @@
             @Override
             protected void onItemDrop(RecyclerView recyclerView, int position) {
                 Logs.d("drop----");
-                ultimateRecyclerView.enableSwipeRefresh(true);
+                ultimateRecyclerView.enableDefaultSwipeRefresh(true);
             }
         };
         dragDropTouchListener.setCustomDragHighlight(getResources().getDrawable(R.drawable.custom_drag_frame));
