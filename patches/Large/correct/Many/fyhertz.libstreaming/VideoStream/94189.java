diff --git a/src/net/majorkernelpanic/streaming/video/VideoStream.java b/src/net/majorkernelpanic/streaming/video/VideoStream.java
index 17f1333..cce729a 100644
--- a/src/net/majorkernelpanic/streaming/video/VideoStream.java
+++ b/src/net/majorkernelpanic/streaming/video/VideoStream.java
@@ -156,7 +156,7 @@
 		if (mSurfaceHolderCallback != null && mSurfaceView != null && mSurfaceView.getHolder() != null) {
 			mSurfaceView.getHolder().removeCallback(mSurfaceHolderCallback);
 		}
-		if (mSurfaceView.getHolder() != null) {
+		if (mSurfaceView != null && mSurfaceView.getHolder() != null) {
 			mSurfaceHolderCallback = new Callback() {
 				@Override
 				public void surfaceDestroyed(SurfaceHolder holder) {
