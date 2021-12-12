diff --git a/src/java/org/jivesoftware/util/CacheManager.java b/src/java/org/jivesoftware/util/CacheManager.java
index 83028c1..b71e9a2 100644
--- a/src/java/org/jivesoftware/util/CacheManager.java
+++ b/src/java/org/jivesoftware/util/CacheManager.java
@@ -70,7 +70,7 @@
             long expirationTime) {
         Cache cache = caches.get(name);
         if (cache == null) {
-            size = JiveGlobals.getIntProperty("cache." + name + ".size", size);
+            size = JiveGlobals.getIntProperty("cache." + propertiesName + ".size", size);
             expirationTime = (long) JiveGlobals.getIntProperty(
                     "cache." + propertiesName + ".expirationTime", (int) expirationTime);
             cache = new Cache(name, size, expirationTime);
