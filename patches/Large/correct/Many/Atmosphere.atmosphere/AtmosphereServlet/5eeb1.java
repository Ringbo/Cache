diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
index 1d612ca..010f09b 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereServlet.java
@@ -87,7 +87,8 @@
                 try {
                     framework = (AtmosphereFramework) sc.getServletContext()
                             .getAttribute(sc.getServletContext().getServletRegistration(sc.getServletName()).getName());
-                } catch (UnsupportedOperationException ex) {
+                } catch (Exception ex) {
+                    // Equinox throw an exception (NPE)
                     // WebLogic Crap => https://github.com/Atmosphere/atmosphere/issues/1569
                     logger.trace("", ex);
                 }
