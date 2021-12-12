diff --git a/modules/cpr/src/main/java/org/atmosphere/annotation/ManagedServiceProcessor.java b/modules/cpr/src/main/java/org/atmosphere/annotation/ManagedServiceProcessor.java
index 58602ac..a7021d3 100644
--- a/modules/cpr/src/main/java/org/atmosphere/annotation/ManagedServiceProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/annotation/ManagedServiceProcessor.java
@@ -65,7 +65,7 @@
                     logger.warn("", e);
                 }
             }
-            framework.addAtmosphereHandler(a.path(), handler, framework.getBroadcasterFactory().lookup(a.broadcaster(), true), l);
+            framework.addAtmosphereHandler(a.path(), handler, framework.getBroadcasterFactory().lookup(a.broadcaster(), a.path(), true), l);
         } catch (Throwable e) {
             logger.warn("", e);
         }
