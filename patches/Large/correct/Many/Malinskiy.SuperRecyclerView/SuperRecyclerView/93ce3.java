diff --git a/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java b/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
index 5bfb70f..0cf4dca 100644
--- a/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
+++ b/SuperRecyclerView/src/main/java/com/malinskiy/superrecyclerview/SuperRecyclerView.java
@@ -175,7 +175,7 @@
                             break;
                     }
 
-                    if (((totalItemCount - lastVisibleItemPosition) == ITEM_LEFT_TO_LOAD_MORE ||
+                    if (((totalItemCount - lastVisibleItemPosition) <= ITEM_LEFT_TO_LOAD_MORE ||
                          (totalItemCount - lastVisibleItemPosition) == 0 && totalItemCount > visibleItemCount)
                         && !isLoadingMore) {
 
