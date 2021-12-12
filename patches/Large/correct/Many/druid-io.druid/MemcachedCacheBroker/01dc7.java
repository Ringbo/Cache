diff --git a/client/src/main/java/com/metamx/druid/client/cache/MemcachedCacheBroker.java b/client/src/main/java/com/metamx/druid/client/cache/MemcachedCacheBroker.java
index 3ad6de4..5486a9e 100644
--- a/client/src/main/java/com/metamx/druid/client/cache/MemcachedCacheBroker.java
+++ b/client/src/main/java/com/metamx/druid/client/cache/MemcachedCacheBroker.java
@@ -131,6 +131,6 @@
   }
 
   private String computeKey(String identifier, byte[] key) {
-    return identifier + Base64.encodeBytes(key);
+    return identifier + Base64.encodeBytes(key, Base64.DONT_BREAK_LINES);
   }
 }
