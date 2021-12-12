diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
index 5be97e7..bed4888 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpClientDiscoverySpi.java
@@ -1481,7 +1481,7 @@
 
                             notifyDiscovery(EVT_DISCOVERY_CUSTOM_EVT, topVer, node, allVisibleNodes(), msgObj);
                         }
-                        catch (IgniteCheckedException e) {
+                        catch (Throwable e) {
                             U.error(log, "Failed to unmarshal discovery custom message.", e);
                         }
                     }
