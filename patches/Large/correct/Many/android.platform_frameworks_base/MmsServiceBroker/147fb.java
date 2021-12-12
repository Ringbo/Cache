diff --git a/services/core/java/com/android/server/MmsServiceBroker.java b/services/core/java/com/android/server/MmsServiceBroker.java
index 2830b5e..65ad1ce 100644
--- a/services/core/java/com/android/server/MmsServiceBroker.java
+++ b/services/core/java/com/android/server/MmsServiceBroker.java
@@ -192,29 +192,30 @@
     // Service API calls implementation, proxied to the real MmsService in "com.android.mms.service"
     private final class BinderService extends IMms.Stub {
         @Override
-        public void sendMessage(long subId, String callingPkg, byte[] pdu, String locationUrl,
-                ContentValues configOverrides, PendingIntent sentIntent) throws RemoteException {
+        public void sendMessage(long subId, String callingPkg, Uri contentUri,
+                String locationUrl, ContentValues configOverrides, PendingIntent sentIntent)
+                        throws RemoteException {
             mContext.enforceCallingPermission(Manifest.permission.SEND_SMS, "Send MMS message");
             if (getAppOpsManager().noteOp(AppOpsManager.OP_SEND_SMS, Binder.getCallingUid(),
                     callingPkg) != AppOpsManager.MODE_ALLOWED) {
                 return;
             }
-            getServiceGuarded().sendMessage(subId, callingPkg, pdu, locationUrl, configOverrides,
-                    sentIntent);
+            getServiceGuarded().sendMessage(subId, callingPkg, contentUri, locationUrl,
+                    configOverrides, sentIntent);
         }
 
         @Override
         public void downloadMessage(long subId, String callingPkg, String locationUrl,
-                ContentValues configOverrides, PendingIntent downloadedIntent)
-                throws RemoteException {
+                Uri contentUri, ContentValues configOverrides,
+                PendingIntent downloadedIntent) throws RemoteException {
             mContext.enforceCallingPermission(Manifest.permission.RECEIVE_MMS,
                     "Download MMS message");
             if (getAppOpsManager().noteOp(AppOpsManager.OP_RECEIVE_MMS, Binder.getCallingUid(),
                     callingPkg) != AppOpsManager.MODE_ALLOWED) {
                 return;
             }
-            getServiceGuarded().downloadMessage(subId, callingPkg, locationUrl, configOverrides,
-                    downloadedIntent);
+            getServiceGuarded().downloadMessage(subId, callingPkg, locationUrl, contentUri,
+                    configOverrides, downloadedIntent);
         }
 
         @Override
@@ -249,8 +250,9 @@
         }
 
         @Override
-        public Uri importMultimediaMessage(String callingPkg, byte[] pdu, String messageId,
-                long timestampSecs, boolean seen, boolean read) throws RemoteException {
+        public Uri importMultimediaMessage(String callingPkg, Uri contentUri,
+                String messageId, long timestampSecs, boolean seen, boolean read)
+                        throws RemoteException {
             mContext.enforceCallingPermission(Manifest.permission.WRITE_SMS, "Import MMS message");
             if (getAppOpsManager().noteOp(AppOpsManager.OP_WRITE_SMS, Binder.getCallingUid(),
                     callingPkg) != AppOpsManager.MODE_ALLOWED) {
@@ -259,7 +261,7 @@
                 return FAKE_MMS_SENT_URI;
             }
             return getServiceGuarded().importMultimediaMessage(
-                    callingPkg, pdu, messageId, timestampSecs, seen, read);
+                    callingPkg, contentUri, messageId, timestampSecs, seen, read);
         }
 
         @Override
@@ -317,7 +319,8 @@
         }
 
         @Override
-        public Uri addMultimediaMessageDraft(String callingPkg, byte[] pdu) throws RemoteException {
+        public Uri addMultimediaMessageDraft(String callingPkg, Uri contentUri)
+                throws RemoteException {
             mContext.enforceCallingPermission(Manifest.permission.WRITE_SMS, "Add MMS draft");
             if (getAppOpsManager().noteOp(AppOpsManager.OP_WRITE_SMS, Binder.getCallingUid(),
                     callingPkg) != AppOpsManager.MODE_ALLOWED) {
@@ -325,7 +328,7 @@
                 // while writing the TelephonyProvider
                 return FAKE_MMS_DRAFT_URI;
             }
-            return getServiceGuarded().addMultimediaMessageDraft(callingPkg, pdu);
+            return getServiceGuarded().addMultimediaMessageDraft(callingPkg, contentUri);
         }
 
         @Override
