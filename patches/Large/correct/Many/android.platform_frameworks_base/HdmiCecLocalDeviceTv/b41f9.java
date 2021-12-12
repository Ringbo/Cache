diff --git a/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java b/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
index 1210e10..420304e 100644
--- a/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
+++ b/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
@@ -351,7 +351,7 @@
             return false;
         }
         SystemAudioActionFromAvr action = new SystemAudioActionFromAvr(this,
-                message.getSource(), HdmiUtils.parseCommandParamSystemAudioStatus(message));
+                message.getSource(), HdmiUtils.parseCommandParamSystemAudioStatus(message), null);
         addAndStartAction(action);
         return true;
     }
