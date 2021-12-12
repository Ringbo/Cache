diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/MeteorServlet.java b/modules/cpr/src/main/java/org/atmosphere/cpr/MeteorServlet.java
index d9b826b..0c6a439 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/MeteorServlet.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/MeteorServlet.java
@@ -101,7 +101,7 @@
         }
 
         // The annotation was used.
-        if (servletClass != null && filterClass != null) {
+        if (servletClass != null || filterClass != null) {
             ReflectorServletProcessor r = new ReflectorServletProcessor();
             r.setServletClassName(servletClass);
             r.setFilterClassName(filterClass);
