diff --git a/modules/cpr/src/main/java/org/atmosphere/config/managed/AtmosphereHandlerServiceInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/config/managed/AtmosphereHandlerServiceInterceptor.java
index 3386405..aeddd34 100644
--- a/modules/cpr/src/main/java/org/atmosphere/config/managed/AtmosphereHandlerServiceInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/config/managed/AtmosphereHandlerServiceInterceptor.java
@@ -97,10 +97,10 @@
                         boolean singleton = w.atmosphereHandler.getClass().getAnnotation(Singleton.class) != null;
                         if (!singleton) {
                             config.framework().addAtmosphereHandler(path, config.framework().newClassInstance(w.atmosphereHandler.getClass()),
-                                    config.getBroadcasterFactory().lookup(m.broadcaster(), true), w.interceptors);
+                                    config.getBroadcasterFactory().lookup(m.broadcaster(), path, true), w.interceptors);
                         } else {
                             config.framework().addAtmosphereHandler(path, w.atmosphereHandler,
-                                    config.getBroadcasterFactory().lookup(m.broadcaster(), true), w.interceptors);
+                                    config.getBroadcasterFactory().lookup(m.broadcaster(), path, true), w.interceptors);
                         }
                         request.setAttribute(FrameworkConfig.NEW_MAPPING, "true");
                     } catch (Throwable e) {
