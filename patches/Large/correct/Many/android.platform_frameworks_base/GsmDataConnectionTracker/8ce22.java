diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java b/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
index ff2d237..de09dfb 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
@@ -1851,8 +1851,8 @@
                 // TODO We may use apnContext.getApnSetting() directly
                 // instead of getWaitingApns().get(0)
                 String apnStr = "<unknown>";
-                if (apnContext.getWaitngApns() != null
-                        && !apnContext.getWatingApns().isEmpty()){
+                if (apnContext.getWaitingApns() != null
+                        && !apnContext.getWaitingApns().isEmpty()){
                     apnStr = apnContext.getWaitingApns().get(0).apn;
                 }
                 log("onDataSetupComplete: success apn=" + apnStr);
