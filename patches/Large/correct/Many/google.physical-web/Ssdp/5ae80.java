diff --git a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/ssdp/Ssdp.java b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/ssdp/Ssdp.java
index 7314630..1a2f8a2 100644
--- a/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/ssdp/Ssdp.java
+++ b/android/PhysicalWeb/app/src/main/java/org/physical_web/physicalweb/ssdp/Ssdp.java
@@ -59,7 +59,7 @@
 
     public synchronized boolean start(Integer timeout) throws IOException{
         if (mThread == null){
-            mMulticastSocket = new MulticastSocket(SSDP_PORT);
+            mMulticastSocket = new DatagramSocket(SSDP_PORT);
             if (timeout != null && timeout>0){
                 mMulticastSocket.setSoTimeout(timeout);
             }
