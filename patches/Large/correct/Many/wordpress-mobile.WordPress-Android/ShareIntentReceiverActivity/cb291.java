diff --git a/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverActivity.java
index 16b14d9..879f95e 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverActivity.java
@@ -149,7 +149,7 @@
 
     private void finishIfNoVisibleBlogs() {
         // If not logged in, then ask to log in, else inform the user to set at least one blog visible
-        if (FluxCUtils.isSignedInWPComOrHasWPOrgSite(mAccountStore, mSiteStore)) {
+        if (!FluxCUtils.isSignedInWPComOrHasWPOrgSite(mAccountStore, mSiteStore)) {
             ToastUtils.showToast(getBaseContext(), R.string.no_account, ToastUtils.Duration.LONG);
             startActivity(new Intent(this, SignInActivity.class));
             finish();
