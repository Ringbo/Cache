diff --git a/app/Global.java b/app/Global.java
index e6ae4c1..1a0eeb3 100644
--- a/app/Global.java
+++ b/app/Global.java
@@ -92,7 +92,7 @@
         for (String uri : uris) {
             initialNodes[i++] = URI.create(uri);
         }
-        final String timezone = app.configuration().getString("timezone");
+        final String timezone = app.configuration().getString("timezone", "");
         if (!timezone.isEmpty()) {
             try {
                 Tools.setApplicationTimeZone(DateTimeZone.forID(timezone));
