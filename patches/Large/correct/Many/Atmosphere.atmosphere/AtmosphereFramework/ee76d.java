diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 861f6ba..7e0be64 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -1792,7 +1792,7 @@
         for (AtmosphereResource r : config.resourcesFactory().findAll()) {
             try {
                 r.resume().close();
-            } catch (IOException e) {
+            } catch (Exception e) {
                 logger.trace("", e);
             }
         }
