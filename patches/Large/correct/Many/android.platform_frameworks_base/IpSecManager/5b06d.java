diff --git a/core/java/android/net/IpSecManager.java b/core/java/android/net/IpSecManager.java
index f8702e2..1a55b37 100644
--- a/core/java/android/net/IpSecManager.java
+++ b/core/java/android/net/IpSecManager.java
@@ -317,7 +317,8 @@
      * @param socket a socket that previously had a transform applied to it.
      * @param transform the IPsec Transform that was previously applied to the given socket
      */
-    public void removeTransportModeTransform(Socket socket, IpSecTransform transform) {
+    public void removeTransportModeTransform(Socket socket, IpSecTransform transform)
+            throws IOException {
         removeTransportModeTransform(ParcelFileDescriptor.fromSocket(socket), transform);
     }
 
@@ -331,7 +332,8 @@
      * @param socket a socket that previously had a transform applied to it.
      * @param transform the IPsec Transform that was previously applied to the given socket
      */
-    public void removeTransportModeTransform(DatagramSocket socket, IpSecTransform transform) {
+    public void removeTransportModeTransform(DatagramSocket socket, IpSecTransform transform)
+            throws IOException {
         removeTransportModeTransform(ParcelFileDescriptor.fromDatagramSocket(socket), transform);
     }
 
@@ -345,7 +347,8 @@
      * @param socket a socket file descriptor that previously had a transform applied to it.
      * @param transform the IPsec Transform that was previously applied to the given socket
      */
-    public void removeTransportModeTransform(FileDescriptor socket, IpSecTransform transform) {
+    public void removeTransportModeTransform(FileDescriptor socket, IpSecTransform transform)
+            throws IOException {
         removeTransportModeTransform(new ParcelFileDescriptor(socket), transform);
     }
 
@@ -419,7 +422,7 @@
          *
          * @param fd a file descriptor previously returned as a UDP Encapsulation socket.
          */
-        public void close() {
+        public void close() throws IOException {
             // TODO: Go close the socket
             mCloseGuard.close();
         }
