diff --git a/container-accesslogging/src/main/java/com/yahoo/container/logging/JSONFormatter.java b/container-accesslogging/src/main/java/com/yahoo/container/logging/JSONFormatter.java
index a8be7c5..8502629 100644
--- a/container-accesslogging/src/main/java/com/yahoo/container/logging/JSONFormatter.java
+++ b/container-accesslogging/src/main/java/com/yahoo/container/logging/JSONFormatter.java
@@ -70,7 +70,7 @@
 
             Principal sslPrincipal = accessLogEntry.getSslPrincipal();
             if (sslPrincipal != null) {
-                generator.writeStringField("ssl-principal", principal.getName());
+                generator.writeStringField("ssl-principal", sslPrincipal.getName());
             }
 
             // Only add remote address/port fields if relevant
