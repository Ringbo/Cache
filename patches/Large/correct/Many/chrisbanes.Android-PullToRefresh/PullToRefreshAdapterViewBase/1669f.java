diff --git a/library/src/com/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase.java b/library/src/com/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase.java
index 26ee407..0222515 100644
--- a/library/src/com/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase.java
+++ b/library/src/com/handmark/pulltorefresh/library/PullToRefreshAdapterViewBase.java
@@ -172,8 +172,7 @@
 				((ViewGroup) newEmptyViewParent).removeView(newEmptyView);
 			}
 
-			refreshableViewWrapper.addView(newEmptyView, ViewGroup.LayoutParams.MATCH_PARENT,
-					ViewGroup.LayoutParams.MATCH_PARENT);
+			refreshableViewWrapper.addView(newEmptyView);
 		}
 
 		if (mRefreshableView instanceof EmptyViewMethodAccessor) {
