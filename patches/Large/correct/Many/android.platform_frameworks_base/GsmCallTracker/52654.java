diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmCallTracker.java b/telephony/java/com/android/internal/telephony/gsm/GsmCallTracker.java
index 425afe6..b4e0775 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmCallTracker.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmCallTracker.java
@@ -167,7 +167,7 @@
     /**
      * clirMode is one of the CLIR_ constants
      */
-    Connection
+    synchronized Connection
     dial (String dialString, int clirMode, UUSInfo uusInfo) throws CallStateException {
         // note that this triggers call state changed notif
         clearDisconnected();
@@ -406,7 +406,7 @@
         }
     }
 
-    protected void
+    protected synchronized void
     handlePollCalls(AsyncResult ar) {
         List polledCalls;
 
