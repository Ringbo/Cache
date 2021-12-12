diff --git a/telephony/java/android/telephony/TelephonyManager.java b/telephony/java/android/telephony/TelephonyManager.java
index 1cc275d..8291a30 100644
--- a/telephony/java/android/telephony/TelephonyManager.java
+++ b/telephony/java/android/telephony/TelephonyManager.java
@@ -667,7 +667,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getDeviceSvnUsingSubId(subId[0]);
+            return info.getDeviceSvnUsingSubId(subId[0], mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -744,7 +744,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getImeiForSubscriber(subId[0]);
+            return info.getImeiForSubscriber(subId[0], mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -773,7 +773,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            String nai = info.getNaiForSubscriber(subId[0]);
+            String nai = info.getNaiForSubscriber(subId[0], mContext.getOpPackageName());
             if (Log.isLoggable(TAG, Log.VERBOSE)) {
                 Rlog.v(TAG, "Nai = " + nai);
             }
@@ -1856,7 +1856,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getIccSerialNumberForSubscriber(subId);
+            return info.getIccSerialNumberForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -1938,7 +1938,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getSubscriberIdForSubscriber(subId);
+            return info.getSubscriberIdForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -1959,7 +1959,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getGroupIdLevel1();
+            return info.getGroupIdLevel1(mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -1983,7 +1983,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getGroupIdLevel1ForSubscriber(subId);
+            return info.getGroupIdLevel1ForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -2029,7 +2029,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getLine1NumberForSubscriber(subId);
+            return info.getLine1NumberForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -2122,7 +2122,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getLine1AlphaTagForSubscriber(subId);
+            return info.getLine1AlphaTagForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -2178,7 +2178,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getMsisdnForSubscriber(subId);
+            return info.getMsisdnForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -2211,7 +2211,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getVoiceMailNumberForSubscriber(subId);
+            return info.getVoiceMailNumberForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
@@ -2350,7 +2350,7 @@
             IPhoneSubInfo info = getSubscriberInfo();
             if (info == null)
                 return null;
-            return info.getVoiceMailAlphaTagForSubscriber(subId);
+            return info.getVoiceMailAlphaTagForSubscriber(subId, mContext.getOpPackageName());
         } catch (RemoteException ex) {
             return null;
         } catch (NullPointerException ex) {
