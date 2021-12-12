diff --git a/app/src/processing/app/Serial.java b/app/src/processing/app/Serial.java
index a5d8268..b8acc46 100644
--- a/app/src/processing/app/Serial.java
+++ b/app/src/processing/app/Serial.java
@@ -175,7 +175,7 @@
   public synchronized void serialEvent(SerialPortEvent serialEvent) {
     if (serialEvent.isRXCHAR()) {
       try {
-        byte[] buf = port.readBytes();
+        byte[] buf = port.readBytes(serialEvent.getEventValue());
         if (buf.length > 0) {
           if (bufferLast == buffer.length) {
             byte temp[] = new byte[bufferLast << 1];
