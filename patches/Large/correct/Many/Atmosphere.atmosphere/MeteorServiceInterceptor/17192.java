diff --git a/modules/cpr/src/main/java/org/atmosphere/config/managed/MeteorServiceInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/config/managed/MeteorServiceInterceptor.java
index eb11b0b..4a6f8f2 100644
--- a/modules/cpr/src/main/java/org/atmosphere/config/managed/MeteorServiceInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/config/managed/MeteorServiceInterceptor.java
@@ -119,10 +119,10 @@
                                     r.setServlet(config.framework().newClassInstance(s.getClass()));
                                     r.init(config);
                                     config.framework().addAtmosphereHandler(path, r,
-                                            config.getBroadcasterFactory().lookup(m.broadcaster(), true), w.interceptors);
+                                            config.getBroadcasterFactory().lookup(m.broadcaster(), path, true), w.interceptors);
                                 } else {
                                     config.framework().addAtmosphereHandler(path, w.atmosphereHandler,
-                                            config.getBroadcasterFactory().lookup(m.broadcaster(), true), w.interceptors);
+                                            config.getBroadcasterFactory().lookup(m.broadcaster(), path, true), w.interceptors);
                                 }
                                 request.setAttribute(FrameworkConfig.NEW_MAPPING, "true");
                             } catch (Throwable e) {
