diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/calls/CallManagerActor.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/calls/CallManagerActor.java
index 50dbe96..33eda1d 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/calls/CallManagerActor.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/modules/calls/CallManagerActor.java
@@ -200,7 +200,7 @@
             //
             // Notify Provider to stop playing ringtone
             //
-            if (currentCall == callId) {
+            if (currentCall != null && currentCall == callId) {
                 provider.onCallAnswered(callId);
             }
         }
@@ -253,7 +253,7 @@
         //
         // Notify Provider if this call was current
         //
-        if (currentCall == callId) {
+        if (currentCall != null && currentCall == callId) {
             currentCall = null;
             provider.onCallEnd(callId);
 
