diff --git a/spring-web/src/main/java/org/springframework/web/server/adapter/DefaultServerWebExchange.java b/spring-web/src/main/java/org/springframework/web/server/adapter/DefaultServerWebExchange.java
index 3cf1842..9d51754 100644
--- a/spring-web/src/main/java/org/springframework/web/server/adapter/DefaultServerWebExchange.java
+++ b/spring-web/src/main/java/org/springframework/web/server/adapter/DefaultServerWebExchange.java
@@ -106,7 +106,7 @@
 			if (MediaType.APPLICATION_FORM_URLENCODED.isCompatibleWith(contentType)) {
 				return FORM_READER
 						.readMono(FORM_DATA_VALUE_TYPE, request, Collections.emptyMap())
-						.otherwiseIfEmpty(EMPTY_FORM_DATA)
+						.switchIfEmpty(EMPTY_FORM_DATA)
 						.cache();
 			}
 		}
