diff --git a/services/java/com/android/server/NetworkManagementService.java b/services/java/com/android/server/NetworkManagementService.java
index 92f99c2..72fce62 100644
--- a/services/java/com/android/server/NetworkManagementService.java
+++ b/services/java/com/android/server/NetworkManagementService.java
@@ -1567,10 +1567,10 @@
     }
 
     @Override
-    public void clearDnsInterfaceForUidRange(int uid_start, int uid_end) {
+    public void clearDnsInterfaceForUidRange(String iface, int uid_start, int uid_end) {
         mContext.enforceCallingOrSelfPermission(CONNECTIVITY_INTERNAL, TAG);
         try {
-            mConnector.execute("resolver", "clearifaceforuidrange", uid_start, uid_end);
+            mConnector.execute("resolver", "clearifaceforuidrange", iface, uid_start, uid_end);
         } catch (NativeDaemonConnectorException e) {
             throw e.rethrowAsParcelableException();
         }
