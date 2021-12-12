diff --git a/core/src/main/java/io/undertow/server/handlers/ProxyPeerAddressHandler.java b/core/src/main/java/io/undertow/server/handlers/ProxyPeerAddressHandler.java
index 6717b3e..b6ea6d5 100644
--- a/core/src/main/java/io/undertow/server/handlers/ProxyPeerAddressHandler.java
+++ b/core/src/main/java/io/undertow/server/handlers/ProxyPeerAddressHandler.java
@@ -113,7 +113,7 @@
     }
 
     private static boolean standardPort(int port, String scheme) {
-        return (port == 80 && "http".equals(scheme)) || (port == 443 & "https".equals(scheme));
+        return (port == 80 && "http".equals(scheme)) || (port == 443 && "https".equals(scheme));
     }
 
     public static class Builder implements HandlerBuilder {
