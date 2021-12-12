diff --git a/webservices/server-integration/src/main/java/org/jboss/as/webservices/config/ServerConfigImpl.java b/webservices/server-integration/src/main/java/org/jboss/as/webservices/config/ServerConfigImpl.java
index 50468ca..9060416 100644
--- a/webservices/server-integration/src/main/java/org/jboss/as/webservices/config/ServerConfigImpl.java
+++ b/webservices/server-integration/src/main/java/org/jboss/as/webservices/config/ServerConfigImpl.java
@@ -194,7 +194,7 @@
         Host undertowHost = getUndertowHost(hostInfo);
         if (undertowHost != null && !undertowHost.getServer().getListeners().isEmpty()) {
             if (!securePort) {
-                return undertowHost.getServer().getListeners().get(0).getBinding().getValue().getPort();
+                return undertowHost.getServer().getListeners().get(0).getBinding().getValue().getAbsolutePort();
             } else {
                 for(ListenerService<?> listener : undertowHost.getServer().getListeners()) {
                     if (listener.isSecure()) {
