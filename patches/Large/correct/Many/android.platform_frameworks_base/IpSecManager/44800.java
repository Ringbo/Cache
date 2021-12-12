diff --git a/core/java/android/net/IpSecManager.java b/core/java/android/net/IpSecManager.java
index 4e1f834..cb4299e 100644
--- a/core/java/android/net/IpSecManager.java
+++ b/core/java/android/net/IpSecManager.java
@@ -658,7 +658,8 @@
          * @param address the local address for traffic inside the tunnel
          * @hide
          */
-        public void addAddress(LinkAddress address) {
+        @SystemApi
+        public void addAddress(LinkAddress address) throws IOException {
             try {
                 mService.addAddressToTunnelInterface(mResourceId, address);
             } catch (RemoteException e) {
@@ -674,7 +675,8 @@
          * @param address to be removed
          * @hide
          */
-        public void removeAddress(LinkAddress address) {
+        @SystemApi
+        public void removeAddress(LinkAddress address) throws IOException {
             try {
                 mService.removeAddressFromTunnelInterface(mResourceId, address);
             } catch (RemoteException e) {
