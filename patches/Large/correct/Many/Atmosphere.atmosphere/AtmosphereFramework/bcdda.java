diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 910defa..d21f9d0 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -1318,7 +1318,7 @@
                  key = e.nextElement();
                  name = key.toLowerCase().trim();
                  if (!name.startsWith("x-atmosphere") && !name.equalsIgnoreCase("x-cache-date") ) {
-                     queryStrings.append(name).append("=").append(req.getParameter(key));
+                     queryStrings.append(key).append("=").append(req.getParameter(key));
                  }
              }
 
