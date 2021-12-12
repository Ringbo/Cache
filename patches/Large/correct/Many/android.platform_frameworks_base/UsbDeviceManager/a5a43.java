diff --git a/services/usb/java/com/android/server/usb/UsbDeviceManager.java b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
index d3022b4..55ffea6 100644
--- a/services/usb/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
@@ -501,8 +501,8 @@
              * Use the normal bootmode persistent prop to maintain state of adb across
              * all boot modes.
              */
-            mAdbEnabled = (UsbManager.usbFunctionsFromString(getSystemProperty(
-                    USB_PERSISTENT_CONFIG_PROPERTY, "")) & UsbManager.FUNCTION_ADB) != 0;
+            mAdbEnabled = UsbHandlerLegacy.containsFunction(getSystemProperty(
+                    USB_PERSISTENT_CONFIG_PROPERTY, ""), UsbManager.USB_FUNCTION_ADB);
 
             // We do not show the USB notification if the primary volume supports mass storage.
             // The legacy mass storage UI will be used instead.
@@ -1607,7 +1607,7 @@
             return persistProp;
         }
 
-        private String addFunction(String functions, String function) {
+        private static String addFunction(String functions, String function) {
             if (UsbManager.USB_FUNCTION_NONE.equals(functions)) {
                 return function;
             }
@@ -1620,7 +1620,7 @@
             return functions;
         }
 
-        private String removeFunction(String functions, String function) {
+        private static String removeFunction(String functions, String function) {
             String[] split = functions.split(",");
             for (int i = 0; i < split.length; i++) {
                 if (function.equals(split[i])) {
@@ -1643,7 +1643,7 @@
             return builder.toString();
         }
 
-        private boolean containsFunction(String functions, String function) {
+        static boolean containsFunction(String functions, String function) {
             int index = functions.indexOf(function);
             if (index < 0) return false;
             if (index > 0 && functions.charAt(index - 1) != ',') return false;
