diff --git a/AndroidAsync/src/com/koushikdutta/async/AsyncSSLSocketWrapper.java b/AndroidAsync/src/com/koushikdutta/async/AsyncSSLSocketWrapper.java
index f138a47..6b6af45 100644
--- a/AndroidAsync/src/com/koushikdutta/async/AsyncSSLSocketWrapper.java
+++ b/AndroidAsync/src/com/koushikdutta/async/AsyncSSLSocketWrapper.java
@@ -229,7 +229,7 @@
     public void onDataAvailable() {
         Util.emitAllData(this, pending);
 
-        if (mEnded && !pending.hasRemaining())
+        if (mEnded && !pending.hasRemaining() && mEndCallback != null)
             mEndCallback.onCompleted(mEndException);
     }
 
