diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 68f71f2..e74344c 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -1371,7 +1371,7 @@
        try {
            ITelephony telephony = getITelephony();
            if (telephony != null) {
-               return telephony.getNetworkTypeForSubscriber(subId);
+               return telephony.getNetworkTypeForSubscriber(subId, getOpPackageName());
            } else {
                // This can happen when the ITelephony interface is not up yet.
                return NETWORK_TYPE_UNKNOWN;
@@ -1425,7 +1425,7 @@
         try{
             ITelephony telephony = getITelephony();
             if (telephony != null) {
-                return telephony.getDataNetworkTypeForSubscriber(subId);
+                return telephony.getDataNetworkTypeForSubscriber(subId, getOpPackageName());
             } else {
                 // This can happen when the ITelephony interface is not up yet.
                 return NETWORK_TYPE_UNKNOWN;
@@ -1919,7 +1919,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return PhoneConstants.LTE_ON_CDMA_UNKNOWN;
-            return telephony.getLteOnCdmaModeForSubscriber(subId);
+            return telephony.getLteOnCdmaModeForSubscriber(subId, getOpPackageName());
         } catch (RemoteException ex) {
             // Assume no ICC card if remote exception which shouldn't happen
             return PhoneConstants.LTE_ON_CDMA_UNKNOWN;
@@ -2657,7 +2657,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return -1;
-            return telephony.getCdmaEriIconIndexForSubscriber(subId);
+            return telephony.getCdmaEriIconIndexForSubscriber(subId, getOpPackageName());
         } catch (RemoteException ex) {
             // the phone process is restarting.
             return -1;
@@ -2688,7 +2688,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return -1;
-            return telephony.getCdmaEriIconModeForSubscriber(subId);
+            return telephony.getCdmaEriIconModeForSubscriber(subId, getOpPackageName());
         } catch (RemoteException ex) {
             // the phone process is restarting.
             return -1;
@@ -2716,7 +2716,7 @@
             ITelephony telephony = getITelephony();
             if (telephony == null)
                 return null;
-            return telephony.getCdmaEriTextForSubscriber(subId);
+            return telephony.getCdmaEriTextForSubscriber(subId, getOpPackageName());
         } catch (RemoteException ex) {
             // the phone process is restarting.
             return null;
@@ -3833,7 +3833,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.isOffhook();
+                return telephony.isOffhook(getOpPackageName());
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelephony#isOffhook", e);
         }
@@ -3846,7 +3846,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.isRinging();
+                return telephony.isRinging(getOpPackageName());
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelephony#isRinging", e);
         }
@@ -3859,7 +3859,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.isIdle();
+                return telephony.isIdle(getOpPackageName());
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelephony#isIdle", e);
         }
@@ -3872,7 +3872,7 @@
         try {
             ITelephony telephony = getITelephony();
             if (telephony != null)
-                return telephony.isRadioOn();
+                return telephony.isRadioOn(getOpPackageName());
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelephony#isRadioOn", e);
         }
