diff --git a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/DefaultAccessTokenConverter.java b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/DefaultAccessTokenConverter.java
index 69aae57..9a14390 100644
--- a/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/DefaultAccessTokenConverter.java
+++ b/spring-security-oauth2/src/main/java/org/springframework/security/oauth2/provider/token/DefaultAccessTokenConverter.java
@@ -155,7 +155,7 @@
 				scope = Collections.singleton(String.class.cast(scopeObj));
 			} else if (Collection.class.<String>isAssignableFrom(scopeObj.getClass())) {
 				Collection scopeColl = Collection.class.<String>cast(scopeObj);
-				scope = new HashSet<String>(scopeColl);
+				scope = new LinkedHashSet<String>(scopeColl);	// Preserve ordering
 			}
 		}
 		return scope;
