diff --git a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
index 773231e..b11ccb0 100644
--- a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
+++ b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
@@ -881,12 +881,12 @@
 				mHeaderTransformer.onReset();
 				if (mHeaderViewListener != null) {
 					mHeaderViewListener.onStateChanged(mHeaderView,
-							HeaderViewListener.STATE_VISIBLE);
+							HeaderViewListener.STATE_HIDDEN);
 				}
-			} else if (animation == mHeaderOutAnimation) {
+			} else if (animation == mHeaderInAnimation) {
 				if (mHeaderViewListener != null) {
 					mHeaderViewListener.onStateChanged(mHeaderView,
-							HeaderViewListener.STATE_HIDDEN);
+							HeaderViewListener.STATE_VISIBLE);
 				}
 			}
 		}
