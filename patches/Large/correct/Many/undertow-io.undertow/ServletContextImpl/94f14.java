diff --git a/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java b/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
index 7edf559..b794f00 100644
--- a/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
+++ b/servlet/src/main/java/io/undertow/servlet/spec/ServletContextImpl.java
@@ -144,7 +144,7 @@
             if (sessionTrackingModes.contains(SessionTrackingMode.SSL)) {
                 sessionConfig = new SslSessionConfig(sessionCookieConfig);
             } else {
-                if (sessionTrackingModes.contains(SessionTrackingMode.COOKIE) || sessionTrackingModes.contains(SessionTrackingMode.URL)) {
+                if (sessionTrackingModes.contains(SessionTrackingMode.COOKIE) && sessionTrackingModes.contains(SessionTrackingMode.URL)) {
                     sessionConfig = sessionCookieConfig;
                     sessionCookieConfig.setFallback(new PathParameterSessionConfig(sessionCookieConfig.getName().toLowerCase(Locale.ENGLISH)));
                 } else if (sessionTrackingModes.contains(SessionTrackingMode.COOKIE)) {
