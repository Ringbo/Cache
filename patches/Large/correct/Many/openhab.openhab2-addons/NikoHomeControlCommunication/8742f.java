diff --git a/addons/binding/org.openhab.binding.nikohomecontrol/src/main/java/org/openhab/binding/nikohomecontrol/internal/protocol/NikoHomeControlCommunication.java b/addons/binding/org.openhab.binding.nikohomecontrol/src/main/java/org/openhab/binding/nikohomecontrol/internal/protocol/NikoHomeControlCommunication.java
index 3b6f645..2d44d4a 100644
--- a/addons/binding/org.openhab.binding.nikohomecontrol/src/main/java/org/openhab/binding/nikohomecontrol/internal/protocol/NikoHomeControlCommunication.java
+++ b/addons/binding/org.openhab.binding.nikohomecontrol/src/main/java/org/openhab/binding/nikohomecontrol/internal/protocol/NikoHomeControlCommunication.java
@@ -397,8 +397,7 @@
         logger.debug("Niko Home Control: send json {} from thread {}", json, Thread.currentThread().getId());
         this.nhcOut.println(json);
         if (this.nhcOut.checkError()) {
-            logger.warn("Niko Home Control: error sending message, trying to restart communication",
-                    Thread.currentThread().getId());
+            logger.warn("Niko Home Control: error sending message, trying to restart communication");
             restartCommunication();
             // retry sending after restart
             logger.debug("Niko Home Control: resend json {} from thread {}", json, Thread.currentThread().getId());
