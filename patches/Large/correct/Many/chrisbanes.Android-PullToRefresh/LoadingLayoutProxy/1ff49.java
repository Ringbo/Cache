diff --git a/library/src/com/handmark/pulltorefresh/library/LoadingLayoutProxy.java b/library/src/com/handmark/pulltorefresh/library/LoadingLayoutProxy.java
index 48eca91..72d8264 100644
--- a/library/src/com/handmark/pulltorefresh/library/LoadingLayoutProxy.java
+++ b/library/src/com/handmark/pulltorefresh/library/LoadingLayoutProxy.java
@@ -52,7 +52,7 @@
 	@Override
 	public void setReleaseLabel(CharSequence label) {
 		for (LoadingLayout layout : mLoadingLayouts) {
-			layout.setRefreshingLabel(label);
+			layout.setReleaseLabel(label);
 		}
 	}
 
