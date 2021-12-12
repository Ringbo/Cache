diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
index f71fbb6..0070991 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAtmosphereResourceFactory.java
@@ -277,7 +277,7 @@
     @Override
     public void locate(String uuid, Async async) {
         AtmosphereResource r = find(uuid);
-        if (uuid != null) {
+        if (r != null) {
             async.available(r);
         }
     }
