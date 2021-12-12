diff --git a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/providers/JsCallsProvider.java b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/providers/JsCallsProvider.java
index 4f06e38..f201224 100644
--- a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/providers/JsCallsProvider.java
+++ b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/providers/JsCallsProvider.java
@@ -16,7 +16,7 @@
 
         Audio callBeep = Audio.createIfSupported();
         if (callBeep != null) {
-            if ("".equals(callBeep.canPlayType("audio/ogg;"))) {
+            if (!"".equals(callBeep.canPlayType("audio/ogg;"))) {
                 callBeep.setSrc("assets/sound/tone.ogg");
             } else if (!"".equals(callBeep.canPlayType("audio/mpeg;"))) {
                 callBeep.setSrc("assets/sound/tone.mp3");
@@ -30,9 +30,9 @@
 
         Audio callRingtone = Audio.createIfSupported();
         if (callRingtone != null) {
-            if ("".equals(callRingtone.canPlayType("audio/ogg;"))) {
+            if (!"".equals(callRingtone.canPlayType("audio/ogg;"))) {
                 callRingtone.setSrc("assets/sound/ringtone.ogg");
-            } else if ("".equals(callRingtone.canPlayType("audio/mpeg;"))) {
+            } else if (!"".equals(callRingtone.canPlayType("audio/mpeg;"))) {
                 callRingtone.setSrc("assets/sound/ringtone.mp3");
             } else {
                 // Not Supported
