diff --git a/modules/runtime/src/main/java/org/atmosphere/runtime/AtmosphereResourceImpl.java b/modules/runtime/src/main/java/org/atmosphere/runtime/AtmosphereResourceImpl.java
index 58810e4..a71850b 100644
--- a/modules/runtime/src/main/java/org/atmosphere/runtime/AtmosphereResourceImpl.java
+++ b/modules/runtime/src/main/java/org/atmosphere/runtime/AtmosphereResourceImpl.java
@@ -336,7 +336,7 @@
         if (config.isSupportSession()
                 && req.getSession(false) != null
                 && req.getSession().getMaxInactiveInterval() >= 0
-                && req.getSession().getMaxInactiveInterval() * 1000 < timeout) {
+                && req.getSession().getMaxInactiveInterval() * 1000L < timeout) {
             throw new IllegalStateException("Cannot suspend a " +
                     "response longer than the session timeout. Increase the value of session-timeout in web.xml");
         }
