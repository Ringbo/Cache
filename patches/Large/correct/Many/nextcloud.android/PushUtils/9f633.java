diff --git a/src/modified/java/com/owncloud/android/utils/PushUtils.java b/src/modified/java/com/owncloud/android/utils/PushUtils.java
index 6d9090b..8f34d08 100644
--- a/src/modified/java/com/owncloud/android/utils/PushUtils.java
+++ b/src/modified/java/com/owncloud/android/utils/PushUtils.java
@@ -156,7 +156,7 @@
                 if (!TextUtils.isEmpty(arbitraryValue = arbitraryDataProvider.getValue(account, KEY_PUSH))) {
                     Gson gson = new Gson();
                     PushConfigurationState pushArbitraryData = gson.fromJson(arbitraryValue,
-                            PushArbitraryData.class);
+                            PushConfigurationState.class);
                     RemoteOperation unregisterAccountDeviceForProxyOperation =
                             new UnregisterAccountDeviceForProxyOperation(context.getResources().
                                     getString(R.string.push_server_url),
