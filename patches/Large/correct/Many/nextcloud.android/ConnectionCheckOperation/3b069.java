diff --git a/src/com/owncloud/android/authenticator/ConnectionCheckOperation.java b/src/com/owncloud/android/authenticator/ConnectionCheckOperation.java
index 7ed61ea..17b0dc2 100644
--- a/src/com/owncloud/android/authenticator/ConnectionCheckOperation.java
+++ b/src/com/owncloud/android/authenticator/ConnectionCheckOperation.java
@@ -121,7 +121,7 @@
             if (tryConnection(client, "https://" + mUrl + AccountUtils.STATUS_PATH)) {
                 return new RemoteOperationResult(RemoteOperationResult.ResultCode.OK_SSL);
         			
-            } else if (mLatestResult.isSslRecoverableException()) {
+            } else if (!mLatestResult.isSslRecoverableException()) {
                 
                 Log.d(TAG, "establishing secure connection failed, trying non secure connection");
                 client.setBaseUri(Uri.parse("http://" + mUrl + AccountUtils.STATUS_PATH));
