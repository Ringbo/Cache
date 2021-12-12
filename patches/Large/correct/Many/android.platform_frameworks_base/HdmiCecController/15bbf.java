diff --git a/services/core/java/com/android/server/hdmi/HdmiCecController.java b/services/core/java/com/android/server/hdmi/HdmiCecController.java
index 68ce607..3c18a59 100644
--- a/services/core/java/com/android/server/hdmi/HdmiCecController.java
+++ b/services/core/java/com/android/server/hdmi/HdmiCecController.java
@@ -196,7 +196,7 @@
         for (int i = 0; i < NUM_LOGICAL_ADDRESS; ++i) {
             int curAddress = (startAddress + i) % NUM_LOGICAL_ADDRESS;
             if (curAddress != HdmiCec.ADDR_UNREGISTERED
-                    && deviceType == HdmiCec.getTypeFromAddress(i)) {
+                    && deviceType == HdmiCec.getTypeFromAddress(curAddress)) {
                 if (!sendPollMessage(curAddress, RETRY_COUNT_FOR_LOGICAL_ADDRESS_ALLOCATION)) {
                     logicalAddress = curAddress;
                     break;
