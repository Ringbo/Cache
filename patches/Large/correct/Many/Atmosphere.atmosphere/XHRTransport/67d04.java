diff --git a/extras/socketio/src/main/java/org/atmosphere/socketio/transport/XHRTransport.java b/extras/socketio/src/main/java/org/atmosphere/socketio/transport/XHRTransport.java
index b810fe7..dd8351a 100755
--- a/extras/socketio/src/main/java/org/atmosphere/socketio/transport/XHRTransport.java
+++ b/extras/socketio/src/main/java/org/atmosphere/socketio/transport/XHRTransport.java
@@ -104,7 +104,7 @@
                                 AtmosphereResourceImpl resource = session.getAtmosphereResourceImpl();
                                 // if BroadcastCache is available, add the message to the cache
                                 if (resource != null && DefaultBroadcaster.class.isAssignableFrom(resource.getBroadcaster().getClass())) {
-                                    DefaultBroadcaster.class.cast(resource.getBroadcaster()).broadcasterCache.addToCache(resource, msg);
+                                    DefaultBroadcaster.class.cast(resource.getBroadcaster()).broadcasterCache.addToCache(resource.getBroadcaster().getID(), resource, msg);
                                 }
                             }
                             break;
@@ -198,7 +198,7 @@
                                 if (DefaultBroadcaster.class.isAssignableFrom(resource.getBroadcaster().getClass())) {
 
                                     List<Object> cachedMessages = DefaultBroadcaster.class.cast(resource.getBroadcaster())
-                                            .broadcasterCache.retrieveFromCache(resource);
+                                            .broadcasterCache.retrieveFromCache(resource.getBroadcaster().getID(), resource);
 
                                     if (cachedMessages != null) {
                                         if (cachedMessages.size() > 1) {
