diff --git a/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java b/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
index 92b277b..d8a9ba8 100644
--- a/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/browser/RepostsByIdTimeLineFragment.java
@@ -682,7 +682,7 @@
 
                     case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
 
-                        enableRefreshTime = false;
+                        enableRefreshTime = true;
                         break;
 
 
