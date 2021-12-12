diff --git a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractNamedValueArgumentResolver.java b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractNamedValueArgumentResolver.java
index 8f9374f..28eb13e 100644
--- a/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractNamedValueArgumentResolver.java
+++ b/spring-webflux/src/main/java/org/springframework/web/reactive/result/method/annotation/AbstractNamedValueArgumentResolver.java
@@ -103,7 +103,7 @@
 					handleResolvedValue(arg, namedValueInfo.name, parameter, model, exchange);
 					return arg;
 				})
-				.otherwiseIfEmpty(getDefaultValue(
+				.switchIfEmpty(getDefaultValue(
 						namedValueInfo, parameter, bindingContext, model, exchange));
 	}
 
