diff --git a/modules/cpr/src/main/java/org/atmosphere/config/managed/ManagedServiceInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/config/managed/ManagedServiceInterceptor.java
index d4f45af..d56bb5d 100644
--- a/modules/cpr/src/main/java/org/atmosphere/config/managed/ManagedServiceInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/config/managed/ManagedServiceInterceptor.java
@@ -119,10 +119,10 @@
                                     ManagedAtmosphereHandler h = new ManagedAtmosphereHandler();
                                     h.configure(config, config.framework().newClassInstance(ap.target().getClass()));
                                     config.framework().addAtmosphereHandler(path, h,
-                                            config.getBroadcasterFactory().lookup(a.broadcaster(), true), w.interceptors);
+                                            config.getBroadcasterFactory().lookup(a.broadcaster(), path, true), w.interceptors);
                                 } else {
                                     config.framework().addAtmosphereHandler(path, w.atmosphereHandler,
-                                            config.getBroadcasterFactory().lookup(a.broadcaster(), true), w.interceptors);
+                                            config.getBroadcasterFactory().lookup(a.broadcaster(), path, true), w.interceptors);
                                 }
                                 request.setAttribute(FrameworkConfig.NEW_MAPPING, "true");
                             } catch (Throwable e) {
