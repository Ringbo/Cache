diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpDiscoverySpi.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpDiscoverySpi.java
index bccbcd5..67a562a 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpDiscoverySpi.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/TcpDiscoverySpi.java
@@ -4591,7 +4591,7 @@
 
                         msg.messageBytes(marsh.marshal(msgObj));
                     }
-                    catch (IgniteCheckedException e) {
+                    catch (Throwable e) {
                         U.error(log, "Failed to unmarshal discovery custom message.", e);
                     }
                 }
