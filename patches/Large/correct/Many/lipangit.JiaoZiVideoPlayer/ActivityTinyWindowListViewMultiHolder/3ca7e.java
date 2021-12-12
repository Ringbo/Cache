diff --git a/app/src/main/java/cn/jzvd/demo/ActivityTinyWindowListViewMultiHolder.java b/app/src/main/java/cn/jzvd/demo/ActivityTinyWindowListViewMultiHolder.java
index b460e73..a0b024f 100644
--- a/app/src/main/java/cn/jzvd/demo/ActivityTinyWindowListViewMultiHolder.java
+++ b/app/src/main/java/cn/jzvd/demo/ActivityTinyWindowListViewMultiHolder.java
@@ -48,7 +48,7 @@
 
             @Override
             public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
-                JZVideoPlayer.onScrollReleaseAllVideos(view, firstVisibleItem, visibleItemCount, totalItemCount);
+                JZVideoPlayer.onScrollAutoTiny(view, firstVisibleItem, visibleItemCount, totalItemCount);
             }
         });
     }
