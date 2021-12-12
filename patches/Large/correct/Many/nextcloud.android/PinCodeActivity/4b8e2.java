diff --git a/src/eu/alefzero/owncloud/ui/activity/PinCodeActivity.java b/src/eu/alefzero/owncloud/ui/activity/PinCodeActivity.java
index b49d679..2253d16 100644
--- a/src/eu/alefzero/owncloud/ui/activity/PinCodeActivity.java
+++ b/src/eu/alefzero/owncloud/ui/activity/PinCodeActivity.java
@@ -96,7 +96,7 @@
         // Not PIN Code defined yet.
         // In a previous version settings is allow from start
         if ( (appPrefs.getString("PrefPinCode1", null) == null ) ){
-            setInitView();
+            setChangePincodeView(true);
             pinCodeChecked = true; 
             newPasswordEntered = true;
             
