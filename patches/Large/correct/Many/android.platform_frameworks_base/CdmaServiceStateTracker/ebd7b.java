diff --git a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
index e785709..d5da666 100644
--- a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
+++ b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
@@ -401,11 +401,11 @@
                     // TODO: Only grabbing the first SID/NID for now.
                     if (cdmaSubscription[1] != null) {
                         String[] sid = cdmaSubscription[1].split(",");
-                        mHomeSystemId = sid.length > 0 ? Integer.parseInt(sid[0]) : 0;
+                        mHomeSystemId = sid.length > 0 ? Integer.parseInt(sid[0], 16) : 0;
                     }
                     if (cdmaSubscription[2] != null) {
                         String[] nid = cdmaSubscription[2].split(",");
-                        mHomeNetworkId = nid.length > 0 ? Integer.parseInt(nid[0]) : 0;
+                        mHomeNetworkId = nid.length > 0 ? Integer.parseInt(nid[0], 16) : 0;
                     }
                     mMin = cdmaSubscription[3];
                     mPrlVersion = cdmaSubscription[4];
