diff --git a/auth/src/main/java/com/firebase/ui/auth/ui/phone/PhoneVerificationActivity.java b/auth/src/main/java/com/firebase/ui/auth/ui/phone/PhoneVerificationActivity.java
index d0a9f4a..dfc61a8 100644
--- a/auth/src/main/java/com/firebase/ui/auth/ui/phone/PhoneVerificationActivity.java
+++ b/auth/src/main/java/com/firebase/ui/auth/ui/phone/PhoneVerificationActivity.java
@@ -394,7 +394,7 @@
     }
 
     private void dismissLoadingDialog() {
-        if (mProgressDialog != null) {
+        if (mProgressDialog != null && !isFinishing()) {
             mProgressDialog.dismissAllowingStateLoss();
             mProgressDialog = null;
         }
