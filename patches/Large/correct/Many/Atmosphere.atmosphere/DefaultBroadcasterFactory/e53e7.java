diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
index 097aa4c..2ad9710 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcasterFactory.java
@@ -159,7 +159,6 @@
 
     private <T extends Broadcaster> T createBroadcaster(Class<T> c, Object id) throws BroadcasterCreationException {
         try {
-            //T b = c.getConstructor(String.class, AtmosphereConfig.class).newInstance(id.toString(), config);
             T b = config.framework().newClassInstance(c, c);
             b.initialize(id.toString(), legacyBroadcasterURI, config);
             b.setSuspendPolicy(defaultPolicyInteger, defaultPolicy);
@@ -220,7 +219,7 @@
     }
 
     public <T extends Broadcaster> T lookup(Class<T> c, Object id, boolean createIfNull, boolean unique) {
-        synchronized (id) {
+        synchronized (c) {
             logger.trace("About to create {}", id);
             if (unique && store.get(id) != null) {
                 throw new IllegalStateException("Broadcaster already exists " + id + ". Use BroadcasterFactory.lookup instead");
