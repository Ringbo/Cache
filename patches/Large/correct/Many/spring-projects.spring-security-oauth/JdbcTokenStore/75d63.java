diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/store/JdbcTokenStore.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/store/JdbcTokenStore.java
index f3af1b2..65bf03d 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/store/JdbcTokenStore.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/store/JdbcTokenStore.java
@@ -113,7 +113,7 @@
 					}, key);
 		}
 		catch (EmptyResultDataAccessException e) {
-			if (LOG.isInfoEnabled()) {
+			if (LOG.isDebugEnabled()) {
 				LOG.debug("Failed to find access token for authentication " + authentication);
 			}
 		}
