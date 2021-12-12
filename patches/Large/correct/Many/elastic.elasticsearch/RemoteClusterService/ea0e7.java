diff --git a/core/src/main/java/org/elasticsearch/action/search/RemoteClusterService.java b/core/src/main/java/org/elasticsearch/action/search/RemoteClusterService.java
index 2641290..107f910 100644
--- a/core/src/main/java/org/elasticsearch/action/search/RemoteClusterService.java
+++ b/core/src/main/java/org/elasticsearch/action/search/RemoteClusterService.java
@@ -335,7 +335,7 @@
         }));
     }
 
-    static final InetSocketAddress parseSeedAddress(String remoteHost) {
+    static InetSocketAddress parseSeedAddress(String remoteHost) {
         int portSeparator = remoteHost.lastIndexOf(':'); // in case we have a IPv6 address ie. [::1]:9300
         if (portSeparator == -1 || portSeparator == remoteHost.length()) {
             throw new IllegalArgumentException("remote hosts need to be configured as [host:port], found [" + remoteHost + "] instead");
