diff --git a/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java b/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
index 0d84534..ad5b8b7 100644
--- a/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/maintimeline/AbstractTimeLineFragment.java
@@ -377,7 +377,7 @@
 
                     case AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
 
-                        enableRefreshTime = false;
+                        enableRefreshTime = true;
                         break;
 
 
