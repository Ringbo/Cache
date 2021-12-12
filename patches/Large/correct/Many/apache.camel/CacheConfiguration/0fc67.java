diff --git a/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheConfiguration.java b/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheConfiguration.java
index 7514e8e..f2d7fef 100755
--- a/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheConfiguration.java
+++ b/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheConfiguration.java
@@ -73,13 +73,13 @@
             setTimeToLiveSeconds(Long.valueOf((String) cacheSettings.get("timeToLiveSeconds")).longValue());
         }
         if (cacheSettings.containsKey("timeToIdleSeconds")) {
-            setTimeToLiveSeconds(Long.valueOf((String) cacheSettings.get("timeToIdleSeconds")).longValue());
+            setTimeToIdleSeconds(Long.valueOf((String) cacheSettings.get("timeToIdleSeconds")).longValue());
         }
         if (cacheSettings.containsKey("diskPersistent")) {
-            setEternal(Boolean.valueOf((String) cacheSettings.get("diskPersistent")));
+            setDiskPersistent(Boolean.valueOf((String) cacheSettings.get("diskPersistent")));
         }
         if (cacheSettings.containsKey("diskExpiryThreadIntervalSeconds")) {
-            setTimeToLiveSeconds(Long.valueOf((String) cacheSettings.get("diskExpiryThreadIntervalSeconds")).longValue());
+            setDiskExpiryThreadIntervalSeconds(Long.valueOf((String) cacheSettings.get("diskExpiryThreadIntervalSeconds")).longValue());
         }
         
     }
