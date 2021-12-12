diff --git a/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java b/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
index c50c442..2fb979d 100644
--- a/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
+++ b/modules/cpr/src/main/java/org/atmosphere/util/DefaultEndpointMapper.java
@@ -44,10 +44,10 @@
             final Map<String, String> m = new HashMap<String, String>();
             for (Map.Entry<String, U> e : handlers.entrySet()) {
                 UriTemplate t = new UriTemplate(e.getKey());
-                logger.debug("Trying to map {} to {}", t, path);
+                logger.trace("Trying to map {} to {}", t, path);
                 if (t.match(path, m)) {
                     handler = e.getValue();
-                    logger.debug("Mapped {} to {}", t, e.getValue());
+                    logger.trace("Mapped {} to {}", t, e.getValue());
                     break;
                 }
             }
