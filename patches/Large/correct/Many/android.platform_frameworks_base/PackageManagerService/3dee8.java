diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index bafcb64..55be545 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -4234,7 +4234,8 @@
                 // TODO: remove these terrible hacks
                 if (actionName.startsWith("android.net.netmon.lingerExpired")
                         || actionName.startsWith("com.android.server.sip.SipWakeupTimer")
-                        || actionName.startsWith("com.android.internal.telephony.data-reconnect")) {
+                        || actionName.startsWith("com.android.internal.telephony.data-reconnect")
+                        || actionName.startsWith("android.net.netmon.launchCaptivePortalApp")) {
                     return true;
                 }
             }
