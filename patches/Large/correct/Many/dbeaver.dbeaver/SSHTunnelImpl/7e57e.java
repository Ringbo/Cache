diff --git a/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHTunnelImpl.java b/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHTunnelImpl.java
index c476836..298a7ef 100644
--- a/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHTunnelImpl.java
+++ b/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHTunnelImpl.java
@@ -112,7 +112,7 @@
                 try {
                     implementation.invalidateTunnel(monitor1);
                 } catch (Exception e) {
-                    log.error("Error invalidating SSH tunnel", e);
+                    log.debug("Error invalidating SSH tunnel", e);
                 }
             },
             "Ping SSH tunnel " + dataSource.getContainer().getName(),
