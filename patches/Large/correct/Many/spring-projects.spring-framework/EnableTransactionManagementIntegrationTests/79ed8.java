diff --git a/org.springframework.integration-tests/src/test/java/org/springframework/transaction/annotation/EnableTransactionManagementIntegrationTests.java b/org.springframework.integration-tests/src/test/java/org/springframework/transaction/annotation/EnableTransactionManagementIntegrationTests.java
index 51bcaee..403f124 100644
--- a/org.springframework.integration-tests/src/test/java/org/springframework/transaction/annotation/EnableTransactionManagementIntegrationTests.java
+++ b/org.springframework.integration-tests/src/test/java/org/springframework/transaction/annotation/EnableTransactionManagementIntegrationTests.java
@@ -184,7 +184,7 @@
 		public CacheManager cacheManager() {
 			SimpleCacheManager mgr = new SimpleCacheManager();
 			ArrayList<Cache> caches = new ArrayList<Cache>();
-			caches.add(new ConcurrentMapCache());
+			caches.add(new ConcurrentMapCache(""));
 			mgr.setCaches(caches);
 			return mgr;
 		}
