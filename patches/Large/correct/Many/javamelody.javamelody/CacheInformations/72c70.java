diff --git a/javamelody-core/src/main/java/net/bull/javamelody/CacheInformations.java b/javamelody-core/src/main/java/net/bull/javamelody/CacheInformations.java
index f66dc2d..47009bc 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/CacheInformations.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/CacheInformations.java
@@ -116,7 +116,7 @@
 		}
 	}
 
-	private static long invokeStatisticsMethod(Statistics statistics, String methodName) {
+	private static long invokeStatisticsMethod(Object statistics, String methodName) {
 		try {
 			// getInMemoryHits, getCacheHits et getCacheMisses existent en v1.2.1 et v1.2.3
 			// mais avec int comme résultat et existent depuis v1.2.4 avec long comme résultat
