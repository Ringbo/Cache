diff --git a/arduino-core/src/processing/app/Serial.java b/arduino-core/src/processing/app/Serial.java
index 904e8b9..04803f3 100644
--- a/arduino-core/src/processing/app/Serial.java
+++ b/arduino-core/src/processing/app/Serial.java
@@ -114,7 +114,7 @@
       port.openPort();
       boolean res = port.setParams(irate, idatabits, stopbits, parity, true, true);
       if (!res) {
-        System.err.println(format(_("Error while setting serial port parameters: {0} {1} {2} {3}"),
+        System.err.println(format(tr("Error while setting serial port parameters: {0} {1} {2} {3}"),
                                   irate, iparity, idatabits, istopbits));
       }
       port.addEventListener(this);
