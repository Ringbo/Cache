diff --git a/services/usb/java/com/android/server/usb/UsbDeviceManager.java b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
index 26a406f..ca74688 100644
--- a/services/usb/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
@@ -407,13 +407,15 @@
                         UsbManager.USB_FUNCTION_ADB);
 
                 /**
-                 * Remove MTP from persistent config, to bring usb to a good state
-                 * after fixes to b/31814300. This block can be removed after the update
+                 * Previous versions can set persist config to mtp/ptp but it does not
+                 * get reset on OTA. Reset the property here instead.
                  */
                 String persisted = SystemProperties.get(USB_PERSISTENT_CONFIG_PROPERTY);
-                if (UsbManager.containsFunction(persisted, UsbManager.USB_FUNCTION_MTP)) {
+                if (UsbManager.containsFunction(persisted, UsbManager.USB_FUNCTION_MTP)
+                        || UsbManager.containsFunction(persisted, UsbManager.USB_FUNCTION_PTP)) {
                     SystemProperties.set(USB_PERSISTENT_CONFIG_PROPERTY,
-                            UsbManager.removeFunction(persisted, UsbManager.USB_FUNCTION_MTP));
+                            UsbManager.removeFunction(UsbManager.removeFunction(persisted,
+                                    UsbManager.USB_FUNCTION_MTP), UsbManager.USB_FUNCTION_PTP));
                 }
 
                 String state = FileUtils.readTextFile(new File(STATE_PATH), 0, null).trim();
