diff --git a/core/common/src/main/java/alluxio/util/network/NetworkAddressUtils.java b/core/common/src/main/java/alluxio/util/network/NetworkAddressUtils.java
index 30de836..d4febbe 100644
--- a/core/common/src/main/java/alluxio/util/network/NetworkAddressUtils.java
+++ b/core/common/src/main/java/alluxio/util/network/NetworkAddressUtils.java
@@ -100,19 +100,19 @@
     private final String mServiceName;
 
     // the key of connect hostname
-    private final String mHostNameKey;
+    private final PropertyKey mHostNameKey;
 
     // the key of bind hostname
-    private final String mBindHostKey;
+    private final PropertyKey mBindHostKey;
 
     // the key of service port
-    private final String mPortKey;
+    private final PropertyKey mPortKey;
 
     // default port number
     private final int mDefaultPort;
 
-    ServiceType(String serviceName, String hostNameKey, String bindHostKey, String portKey,
-        int defaultPort) {
+    ServiceType(String serviceName, PropertyKey hostNameKey, PropertyKey bindHostKey,
+        PropertyKey portKey, int defaultPort) {
       mServiceName = serviceName;
       mHostNameKey = hostNameKey;
       mBindHostKey = bindHostKey;
@@ -134,7 +134,7 @@
      *
      * @return key of connect hostname
      */
-    public String getHostNameKey() {
+    public PropertyKey getHostNameKey() {
       return mHostNameKey;
     }
 
@@ -143,7 +143,7 @@
      *
      * @return key of bind hostname
      */
-    public String getBindHostKey() {
+    public PropertyKey getBindHostKey() {
       return mBindHostKey;
     }
 
@@ -152,7 +152,7 @@
      *
      * @return key of service port
      */
-    public String getPortKey() {
+    public PropertyKey getPortKey() {
       return mPortKey;
     }
 
