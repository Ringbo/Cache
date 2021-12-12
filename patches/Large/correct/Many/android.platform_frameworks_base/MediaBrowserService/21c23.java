diff --git a/media/java/android/service/media/MediaBrowserService.java b/media/java/android/service/media/MediaBrowserService.java
index 6d1bd45..ca7ab7e 100644
--- a/media/java/android/service/media/MediaBrowserService.java
+++ b/media/java/android/service/media/MediaBrowserService.java
@@ -541,7 +541,8 @@
             throw new IllegalStateException("This should be called inside of onGetRoot or"
                     + " onLoadChildren or onLoadItem methods");
         }
-        return new RemoteUserInfo(mCurConnection.pkg, mCurConnection.pid, mCurConnection.uid);
+        return new RemoteUserInfo(mCurConnection.pkg, mCurConnection.pid, mCurConnection.uid,
+                mCurConnection.callbacks.asBinder());
     }
 
     /**
