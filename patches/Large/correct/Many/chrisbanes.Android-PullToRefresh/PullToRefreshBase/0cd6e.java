diff --git a/library/src/com/handmark/pulltorefresh/library/PullToRefreshBase.java b/library/src/com/handmark/pulltorefresh/library/PullToRefreshBase.java
index dae84c7..569a4c1 100644
--- a/library/src/com/handmark/pulltorefresh/library/PullToRefreshBase.java
+++ b/library/src/com/handmark/pulltorefresh/library/PullToRefreshBase.java
@@ -508,7 +508,7 @@
 		}
 
 		if (doScroll) {
-			smoothScrollTo(mode == MODE_PULL_DOWN_TO_REFRESH ? -headerHeight : headerHeight);
+			smoothScrollTo(currentMode == MODE_PULL_DOWN_TO_REFRESH ? -headerHeight : headerHeight);
 		}
 	}
 
