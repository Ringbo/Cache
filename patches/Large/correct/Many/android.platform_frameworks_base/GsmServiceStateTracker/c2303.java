diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmServiceStateTracker.java b/telephony/java/com/android/internal/telephony/gsm/GsmServiceStateTracker.java
index 3c0b603..8ecf245 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmServiceStateTracker.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmServiceStateTracker.java
@@ -383,7 +383,7 @@
                     String states[] = (String[])ar.result;
                     int lac = -1;
                     int cid = -1;
-                    if (states.length == 3) {
+                    if (states.length >= 3) {
                         try {
                             if (states[1] != null && states[1].length() > 0) {
                                 lac = Integer.parseInt(states[1], 16);
@@ -629,7 +629,7 @@
                     if (states.length > 0) {
                         try {
                             regState = Integer.parseInt(states[0]);
-                            if (states.length == 3) {
+                            if (states.length >= 3) {
                                 if (states[1] != null && states[1].length() > 0) {
                                     lac = Integer.parseInt(states[1], 16);
                                 }
