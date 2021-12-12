diff --git a/server/src/main/java/io/druid/curator/discovery/CuratorServiceUtils.java b/server/src/main/java/io/druid/curator/discovery/CuratorServiceUtils.java
index ad77816..936581d 100644
--- a/server/src/main/java/io/druid/curator/discovery/CuratorServiceUtils.java
+++ b/server/src/main/java/io/druid/curator/discovery/CuratorServiceUtils.java
@@ -21,7 +21,22 @@
 
 public class CuratorServiceUtils
 {
-  public static String makeCanonicalServiceName(String serviceName) {
+  /**
+   * Replacing '/' with ':' in service names makes it easier to provide an HTTP interface using
+   * <a href="http://curator.apache.org/curator-x-discovery-server/">curator-x-discovery-server</a>
+   *
+   * This method is marked protected because it should never be used outside of the io.druid.curator.discovery
+   * package. If you are tempted to use this method anywhere else you are most likely doing something wrong.
+   * Mapping the actual service name to the name used within curator should be left to {@link CuratorServiceAnnouncer}
+   * and {@link ServerDiscoveryFactory}
+   *
+   * @see io.druid.curator.discovery.CuratorServiceAnnouncer
+   * @see io.druid.curator.discovery.ServerDiscoveryFactory
+   *
+   * @param serviceName
+   * @return
+   */
+  protected static String makeCanonicalServiceName(String serviceName) {
     return serviceName.replaceAll("/", ":");
   }
 }
