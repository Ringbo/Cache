diff --git a/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java b/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
index 403307a..4d8bb0d 100644
--- a/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/browser/CommentsByIdTimeLineFragment.java
@@ -670,7 +670,7 @@
 
                     case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
 
-                        enableRefreshTime = false;
+                        enableRefreshTime = true;
                         break;
 
 
