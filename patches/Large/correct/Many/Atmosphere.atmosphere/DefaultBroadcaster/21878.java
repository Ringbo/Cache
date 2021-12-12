diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
index 4ff7ed9..0027c31 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultBroadcaster.java
@@ -1089,7 +1089,7 @@
         // https://github.com/Atmosphere/atmosphere/issues/864
         // FIX ME IN 1.1 -- For legacy, we need to leave the logic here
         BroadcasterCache broadcasterCache = bc.getBroadcasterCache();
-        if (!force || EventCacheBroadcasterCache.class.isAssignableFrom(broadcasterCache.getClass())) {
+        if (!force && EventCacheBroadcasterCache.class.isAssignableFrom(broadcasterCache.getClass())) {
             return;
         }
 
