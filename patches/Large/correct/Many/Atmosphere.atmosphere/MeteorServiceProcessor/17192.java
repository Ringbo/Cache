diff --git a/modules/cpr/src/main/java/org/atmosphere/annotation/MeteorServiceProcessor.java b/modules/cpr/src/main/java/org/atmosphere/annotation/MeteorServiceProcessor.java
index 6a788d9..d672b3e 100644
--- a/modules/cpr/src/main/java/org/atmosphere/annotation/MeteorServiceProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/annotation/MeteorServiceProcessor.java
@@ -70,7 +70,7 @@
             if (m.path().contains("{")) {
                 framework.interceptors().add(new MeteorServiceInterceptor());
             }
-            framework.addAtmosphereHandler(mapping, r, framework.getBroadcasterFactory().lookup(m.broadcaster(), true), l);
+            framework.addAtmosphereHandler(mapping, r, framework.getBroadcasterFactory().lookup(m.broadcaster(), m.path(), true), l);
             framework.setBroadcasterCacheClassName(m.broadcasterCache().getName());
         } catch (Throwable e) {
             logger.warn("", e);
