diff --git a/src/rajawali/util/RajLog.java b/src/rajawali/util/RajLog.java
index 821bf47..c1764fd 100644
--- a/src/rajawali/util/RajLog.java
+++ b/src/rajawali/util/RajLog.java
@@ -67,7 +67,7 @@
 	}
 
 	public static final void v(String msg) {
-		Log.e(TAG, msg);
+		Log.v(TAG, msg);
 	}
 
 	public static final void w(String msg) {
