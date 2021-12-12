diff --git a/services/autofill/java/com/android/server/autofill/Session.java b/services/autofill/java/com/android/server/autofill/Session.java
index ef5cdd1..b34ced0 100644
--- a/services/autofill/java/com/android/server/autofill/Session.java
+++ b/services/autofill/java/com/android/server/autofill/Session.java
@@ -1120,7 +1120,7 @@
 
     private void notifyUnavailableToClient() {
         synchronized (mLock) {
-            if (!mHasCallback) return;
+            if (!mHasCallback || mCurrentViewId == null) return;
             try {
                 mClient.notifyNoFillUi(id, mCurrentViewId);
             } catch (RemoteException e) {
