diff --git a/core/java/android/app/KeyguardManager.java b/core/java/android/app/KeyguardManager.java
index 1e8743c..a601fbf 100644
--- a/core/java/android/app/KeyguardManager.java
+++ b/core/java/android/app/KeyguardManager.java
@@ -127,7 +127,7 @@
      */
     public boolean isKeyguardLocked() {
         try {
-            return mWM.isKeyguardSecure();
+            return mWM.isKeyguardLocked();
         } catch (RemoteException ex) {
             return false;
         }
