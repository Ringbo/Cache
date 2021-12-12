diff --git a/src/ows/src/main/java/org/geoserver/ows/Response.java b/src/ows/src/main/java/org/geoserver/ows/Response.java
index c207653..1f68570 100644
--- a/src/ows/src/main/java/org/geoserver/ows/Response.java
+++ b/src/ows/src/main/java/org/geoserver/ows/Response.java
@@ -217,7 +217,7 @@
             } else {
                 final String message =
                     "Cannot guess file extension for invalid MIME type: '" +
-                    name + "'";
+                    mimeType + "'";
                 throw new IllegalStateException(message);
             }
         }
