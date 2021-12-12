diff --git a/app/src/main/java/org/schabi/newpipe/VideoItemListFragment.java b/app/src/main/java/org/schabi/newpipe/VideoItemListFragment.java
index c51ce1c..7e279a0 100644
--- a/app/src/main/java/org/schabi/newpipe/VideoItemListFragment.java
+++ b/app/src/main/java/org/schabi/newpipe/VideoItemListFragment.java
@@ -289,7 +289,7 @@
                                  int visibleItemCount, int totalItemCount) {
                 if (mode != PRESENT_VIDEOS_MODE
                         && list.getChildAt(0) != null
-                        && list.getLastVisiblePosition() == list.getAdapter().getCount() - 2
+                        && list.getLastVisiblePosition() == list.getAdapter().getCount() - 1
                         && list.getChildAt(list.getChildCount() - 1).getBottom() >= list.getHeight()) {
                     long time = System.currentTimeMillis();
                     if ((time - lastScrollDate) > 200
