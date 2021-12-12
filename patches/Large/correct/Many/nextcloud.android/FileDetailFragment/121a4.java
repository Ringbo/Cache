diff --git a/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java b/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
index 4509372..2badae1 100644
--- a/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
+++ b/src/eu/alefzero/owncloud/ui/fragment/FileDetailFragment.java
@@ -349,7 +349,7 @@
      * the time that the file was created. There is a chance that this will
      * be fixed in future versions. Use this method to check if this version of
      * ownCloud has this fix.
-     * @return True, if ownCloud the ownCloud version is > 3.0.4 and 4.0.1
+     * @return True, if ownCloud the ownCloud version is > 3.0.4 and 4.0.4
      */
     private boolean ocVersionSupportsTimeCreated(){
         if(mIntent != null){
@@ -358,7 +358,7 @@
                 AccountManager accManager = (AccountManager) getActivity().getSystemService(Context.ACCOUNT_SERVICE);
                 OwnCloudVersion ocVersion = new OwnCloudVersion(accManager
                         .getUserData(ocAccount, AccountAuthenticator.KEY_OC_VERSION));
-                if(ocVersion.compareTo(new OwnCloudVersion(0x030004)) >= 0 || ocVersion.compareTo(new OwnCloudVersion(0x040001)) >= 0){
+                if(ocVersion.compareTo(new OwnCloudVersion(0x030004)) >= 0 || ocVersion.compareTo(new OwnCloudVersion(0x040004)) >= 0){
                     return true;
                 }
             }
