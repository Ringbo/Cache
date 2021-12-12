diff --git a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
index deaa15b..5de9fc5 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
@@ -1352,7 +1352,7 @@
     };
 
     if (getValidationThreadToUse() == Alarm.ThreadToUse.SWING_THREAD) {
-      myValidationAlarm.addRequest(validateRequest, myValidationDelay, ModalityState.current());
+      myValidationAlarm.addRequest(validateRequest, myValidationDelay, ModalityState.stateForComponent(getRootPane()));
     }
     else {
       myValidationAlarm.addRequest(validateRequest, myValidationDelay);
