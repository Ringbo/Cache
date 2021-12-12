diff --git a/bundles/core/org.eclipse.smarthome.core.voice/src/main/java/org/eclipse/smarthome/core/voice/VoiceManager.java b/bundles/core/org.eclipse.smarthome.core.voice/src/main/java/org/eclipse/smarthome/core/voice/VoiceManager.java
index 180cd1b..755c527 100644
--- a/bundles/core/org.eclipse.smarthome.core.voice/src/main/java/org/eclipse/smarthome/core/voice/VoiceManager.java
+++ b/bundles/core/org.eclipse.smarthome.core.voice/src/main/java/org/eclipse/smarthome/core/voice/VoiceManager.java
@@ -440,11 +440,11 @@
     }
 
     protected void addAudioSink(AudioSink audioSink) {
-        this.audioSinks.put(audioSink.toString(), audioSink);
+        this.audioSinks.put(audioSink.getId(), audioSink);
     }
 
     protected void removeAudioSink(AudioSink audioSink) {
-        this.audioSinks.remove(audioSink.toString());
+        this.audioSinks.remove(audioSink.getId());
     }
 
     /**
