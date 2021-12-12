diff --git a/telephony/java/android/telephony/euicc/EuiccManager.java b/telephony/java/android/telephony/euicc/EuiccManager.java
index 95dfffd..919a19d 100644
--- a/telephony/java/android/telephony/euicc/EuiccManager.java
+++ b/telephony/java/android/telephony/euicc/EuiccManager.java
@@ -309,7 +309,7 @@
             return null;
         }
         try {
-            return getIEuiccController().getEid(mCardId);
+            return getIEuiccController().getEid(mCardId, mContext.getOpPackageName());
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
@@ -346,6 +346,15 @@
      * current eUICC and the subscription to be downloaded according to the subscription metadata.
      * Without the former, an {@link #EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR} will be
      * returned in the callback intent to prompt the user to accept the download.
+     *
+     * <p>On a multi-active SIM device, requires the
+     * {@code android.Manifest.permission#WRITE_EMBEDDED_SUBSCRIPTIONS} permission, or a calling app
+     * only if the targeted eUICC does not currently have an active subscription or the calling app
+     * is authorized to manage the active subscription on the target eUICC, and the calling app is
+     * authorized to manage any active subscription on any SIM. Without it, an
+     * {@link #EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR} will be returned in the callback
+     * intent to prompt the user to accept the download. The caller should also be authorized to
+     * manage the subscription to be downloaded.
      *
      * @param subscription the subscription to download.
      * @param switchAfterDownload if true, the profile will be activated upon successful download.
@@ -549,9 +558,21 @@
      * an {@link #EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR} will be returned in the callback
      * intent to prompt the user to accept the download.
      *
+     * <p>On a multi-active SIM device, requires the
+     * {@code android.Manifest.permission#WRITE_EMBEDDED_SUBSCRIPTIONS} permission, or a calling app
+     *  only if the targeted eUICC does not currently have an active subscription or the calling app
+     * is authorized to manage the active subscription on the target eUICC, and the calling app is
+     * authorized to manage any active subscription on any SIM. Without it, an
+     * {@link #EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR} will be returned in the callback
+     * intent to prompt the user to accept the download. The caller should also be authorized to
+     * manage the subscription to be enabled.
+     *
      * @param subscriptionId the ID of the subscription to enable. May be
      *     {@link android.telephony.SubscriptionManager#INVALID_SUBSCRIPTION_ID} to deactivate the
-     *     current profile without activating another profile to replace it.
+     *     current profile without activating another profile to replace it. If it's a disable
+     *     operation, requires the {@code android.Manifest.permission#WRITE_EMBEDDED_SUBSCRIPTIONS}
+     *     permission, or the calling app must be authorized to manage the active subscription on
+     *     the target eUICC.
      * @param callbackIntent a PendingIntent to launch when the operation completes.
      */
     @RequiresPermission(Manifest.permission.WRITE_EMBEDDED_SUBSCRIPTIONS)
