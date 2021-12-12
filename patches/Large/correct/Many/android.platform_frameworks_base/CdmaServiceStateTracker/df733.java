diff --git a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
index 2cf4b88..0aed77e 100755
--- a/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
+++ b/telephony/java/com/android/internal/telephony/cdma/CdmaServiceStateTracker.java
@@ -545,7 +545,7 @@
             int defaultRoamingIndicator = 0;  //[12] Is default roaming indicator from PRL
             int reasonForDenial = 0;       //[13] Denial reason if registrationState = 3
 
-            if (states.length == 14) {
+            if (states.length >= 14) {
                 try {
                     if (states[0] != null) {
                         registrationState = Integer.parseInt(states[0]);
@@ -593,8 +593,8 @@
                 }
             } else {
                 throw new RuntimeException("Warning! Wrong number of parameters returned from "
-                                     + "RIL_REQUEST_REGISTRATION_STATE: expected 14 got "
-                                     + states.length);
+                                     + "RIL_REQUEST_REGISTRATION_STATE: expected 14 or more "
+                                     + "strings and got " + states.length + " strings");
             }
 
             mRegistrationState = registrationState;
