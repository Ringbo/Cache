diff --git a/core/java/android/provider/VoicemailContract.java b/core/java/android/provider/VoicemailContract.java
index 89668c1..c6ea50a 100644
--- a/core/java/android/provider/VoicemailContract.java
+++ b/core/java/android/provider/VoicemailContract.java
@@ -461,7 +461,7 @@
             Uri statusUri = buildSourceUri(context.getPackageName());
             ContentValues values = new ContentValues();
             values.put(Status.PHONE_ACCOUNT_COMPONENT_NAME,
-                    accountHandle.getComponentName().toString());
+                    accountHandle.getComponentName().flattenToString());
             values.put(Status.PHONE_ACCOUNT_ID, accountHandle.getId());
             values.put(Status.CONFIGURATION_STATE, configurationState);
             values.put(Status.DATA_CHANNEL_STATE, dataChannelState);
