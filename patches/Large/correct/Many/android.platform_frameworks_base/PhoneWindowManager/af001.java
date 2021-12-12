diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index e51a2e1..83a5ef5 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -3360,7 +3360,7 @@
             throws RemoteException {
         synchronized (mLock) {
             IShortcutService service = mShortcutKeyServices.get(shortcutCode);
-            if (service != null && service.asBinder().isBinderAlive()) {
+            if (service != null && service.asBinder().pingBinder()) {
                     throw new RemoteException("Key already exists.");
             }
 
