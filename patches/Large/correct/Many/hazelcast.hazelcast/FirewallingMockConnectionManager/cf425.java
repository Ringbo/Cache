diff --git a/hazelcast/src/test/java/com/hazelcast/nio/tcp/FirewallingMockConnectionManager.java b/hazelcast/src/test/java/com/hazelcast/nio/tcp/FirewallingMockConnectionManager.java
index 6ac10d8..d1590a7 100644
--- a/hazelcast/src/test/java/com/hazelcast/nio/tcp/FirewallingMockConnectionManager.java
+++ b/hazelcast/src/test/java/com/hazelcast/nio/tcp/FirewallingMockConnectionManager.java
@@ -39,7 +39,7 @@
     }
 
     @Override
-    public Connection getOrConnect(Address address) {
+    public synchronized Connection getOrConnect(Address address) {
         Connection connection = getConnection(address);
         if (connection != null && connection.isAlive()) {
             return connection;
@@ -54,11 +54,11 @@
     }
 
     @Override
-    public Connection getOrConnect(Address address, boolean silent) {
+    public synchronized Connection getOrConnect(Address address, boolean silent) {
         return getOrConnect(address);
     }
 
-    public void block(Address address) {
+    public synchronized void block(Address address) {
         blockedAddresses.add(address);
         Connection connection = getConnection(address);
         if (connection != null) {
@@ -66,7 +66,7 @@
         }
     }
 
-    public void unblock(Address address) {
+    public synchronized void unblock(Address address) {
         blockedAddresses.remove(address);
         Connection connection = getConnection(address);
         if (connection instanceof DroppingConnection) {
