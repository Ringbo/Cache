diff --git a/telephony/java/android/telephony/euicc/EuiccManager.java b/telephony/java/android/telephony/euicc/EuiccManager.java
index b732d4d..53cd689 100644
--- a/telephony/java/android/telephony/euicc/EuiccManager.java
+++ b/telephony/java/android/telephony/euicc/EuiccManager.java
@@ -546,14 +546,13 @@
     /**
      * Update the nickname for the given subscription.
      *
-     * <p>Requires that the calling app has the
-     * {@link android.Manifest.permission#WRITE_EMBEDDED_SUBSCRIPTIONS} permission. This is for
-     * internal system use only.
+     * <p>Requires that the calling app has carrier privileges according to the metadata of the
+     * profile to be updated, or the
+     * {@code android.Manifest.permission#WRITE_EMBEDDED_SUBSCRIPTIONS} permission.
      *
      * @param subscriptionId the ID of the subscription to update.
      * @param nickname the new nickname to apply.
      * @param callbackIntent a PendingIntent to launch when the operation completes.
-     * @hide
      */
     @RequiresPermission(Manifest.permission.WRITE_EMBEDDED_SUBSCRIPTIONS)
     public void updateSubscriptionNickname(
@@ -564,7 +563,7 @@
         }
         try {
             getIEuiccController().updateSubscriptionNickname(
-                    subscriptionId, nickname, callbackIntent);
+                    subscriptionId, nickname, mContext.getOpPackageName(), callbackIntent);
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
