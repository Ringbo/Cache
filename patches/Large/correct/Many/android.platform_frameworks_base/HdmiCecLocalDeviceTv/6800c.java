diff --git a/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java b/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
index 73f5cfd..a231945 100644
--- a/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
+++ b/services/core/java/com/android/server/hdmi/HdmiCecLocalDeviceTv.java
@@ -314,7 +314,7 @@
                 HdmiCecMessageBuilder.buildRoutingChange(mAddress, oldPath, newPath);
         mService.sendCecCommand(routingChange);
         removeAction(RoutingControlAction.class);
-        addAndStartAction(new RoutingControlAction(this, newPath, false, callback));
+        addAndStartAction(new RoutingControlAction(this, newPath, true, callback));
     }
 
     int getPowerStatus() {
