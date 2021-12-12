diff --git a/sonic-android/sdk/src/main/java/com/tencent/sonic/sdk/SonicFileUtils.java b/sonic-android/sdk/src/main/java/com/tencent/sonic/sdk/SonicFileUtils.java
index 965588a..619b655 100644
--- a/sonic-android/sdk/src/main/java/com/tencent/sonic/sdk/SonicFileUtils.java
+++ b/sonic-android/sdk/src/main/java/com/tencent/sonic/sdk/SonicFileUtils.java
@@ -443,7 +443,7 @@
     static void checkAndTrimResourceCache() {
         HashMap<String, List<String>> currentCacheFileMap = new HashMap<String, List<String>>();
         long startTime = System.currentTimeMillis();
-        long cacheFileSize = calcCacheSize(getSonicCacheDirPath(), currentCacheFileMap);
+        long cacheFileSize = calcCacheSize(getSonicResourceCachePath(), currentCacheFileMap);
 
         final long MAX_CACHE_SIZE = SonicEngine.getInstance().getConfig().SONIC_RESOURCE_CACHE_MAX_SIZE;
 
