diff --git a/src/main/src/main/java/org/geoserver/ows/ProxifyingURLMangler.java b/src/main/src/main/java/org/geoserver/ows/ProxifyingURLMangler.java
index d8264a5..4a1a12c 100644
--- a/src/main/src/main/java/org/geoserver/ows/ProxifyingURLMangler.java
+++ b/src/main/src/main/java/org/geoserver/ows/ProxifyingURLMangler.java
@@ -17,7 +17,7 @@
 public class ProxifyingURLMangler implements URLMangler {
 
     public enum Headers {
-        FORWARDED("X-Forwarded"),
+        FORWARDED("Forwarded"),
         FORWARDED_PROTO("X-Forwarded-Proto"),
         FORWARDED_HOST("X-Forwarded-Host"),
         FORWARDED_PATH("X-Forwarded-Path"),
@@ -169,7 +169,7 @@
                                                             String.format(
                                                                     "%s%s%s",
                                                                     TEMPLATE_PREFIX,
-                                                                    Headers.FORWARDED.toString()
+                                                                    Headers.FORWARDED.asString()
                                                                             + "."
                                                                             + comp,
                                                                     TEMPLATE_POSTFIX),
