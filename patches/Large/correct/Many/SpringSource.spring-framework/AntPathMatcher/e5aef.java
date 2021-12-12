diff --git a/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java b/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java
index 3e2abc6..a4d5779 100644
--- a/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java
+++ b/spring-core/src/main/java/org/springframework/util/AntPathMatcher.java
@@ -279,7 +279,7 @@
 		}
 		if (matcher == null) {
 			matcher = new AntPathStringMatcher(pattern);
-			if (cachePatterns == null && this.stringMatcherCache.size() == CACHE_TURNOFF_THRESHOLD) {
+			if (cachePatterns == null && this.stringMatcherCache.size() >= CACHE_TURNOFF_THRESHOLD) {
 				// Try to adapt to the runtime situation that we're encountering:
 				// There are obviously too many different paths coming in here...
 				// So let's turn off the cache since the patterns are unlikely to be reoccurring.
