diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index dc3e2d6..d12481c 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5527,7 +5527,7 @@
 
     private void finishKeyguardDrawn() {
         synchronized (mLock) {
-            if (!mAwake || mKeyguardDrawComplete) {
+            if (!mScreenOnEarly || mKeyguardDrawComplete) {
                 return; // We are not awake yet or we have already informed of this event.
             }
 
