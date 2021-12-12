diff --git a/spring-session/src/main/java/org/springframework/session/data/redis/RedisOperationsSessionRepository.java b/spring-session/src/main/java/org/springframework/session/data/redis/RedisOperationsSessionRepository.java
index aafaab9..e3720fd 100644
--- a/spring-session/src/main/java/org/springframework/session/data/redis/RedisOperationsSessionRepository.java
+++ b/spring-session/src/main/java/org/springframework/session/data/redis/RedisOperationsSessionRepository.java
@@ -694,7 +694,7 @@
 		 * was retrieved. Cannot be null.
 		 */
 		RedisSession(MapSession cached) {
-			Assert.notNull("MapSession cannot be null");
+			Assert.notNull(cached, "MapSession cannot be null");
 			this.cached = cached;
 			this.originalPrincipalName = PRINCIPAL_NAME_RESOLVER.resolvePrincipal(this);
 		}
