diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
index 388d6e8..5f2de5f 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
@@ -332,7 +332,7 @@
 
     /** {@inheritDoc} */
     @Override public Collection<Object> injectables() {
-        return Arrays.<Object>asList(ipFinder);
+        return F.<Object>asList(ipFinder);
     }
 
     /** {@inheritDoc} */
