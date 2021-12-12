diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 9716c84..a6c247f 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -5556,7 +5556,7 @@
 
     private void finishKeyguardDrawn() {
         synchronized (mLock) {
-            if (!mAwake || mKeyguardDrawComplete) {
+            if (!mScreenOnEarly || mKeyguardDrawComplete) {
                 return; // We are not awake yet or we have already informed of this event.
             }
 
