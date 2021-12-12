diff --git a/packages/Keyguard/src/com/android/keyguard/KeyguardSecurityContainer.java b/packages/Keyguard/src/com/android/keyguard/KeyguardSecurityContainer.java
index f529ac0..23bd238 100644
--- a/packages/Keyguard/src/com/android/keyguard/KeyguardSecurityContainer.java
+++ b/packages/Keyguard/src/com/android/keyguard/KeyguardSecurityContainer.java
@@ -329,7 +329,9 @@
                 case SimPuk:
                     // Shortcut for SIM PIN/PUK to go to directly to user's security screen or home
                     SecurityMode securityMode = mSecurityModel.getSecurityMode();
-                    if (securityMode != SecurityMode.None) {
+                    if (securityMode != SecurityMode.None
+                            || !mLockPatternUtils.isLockScreenDisabled(
+                            KeyguardUpdateMonitor.getCurrentUser())) {
                         showSecurityScreen(securityMode);
                     } else {
                         finish = true;
