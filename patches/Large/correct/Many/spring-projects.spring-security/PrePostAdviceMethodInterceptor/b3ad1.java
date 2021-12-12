diff --git a/core/src/main/java/org/springframework/security/access/method/PrePostAdviceMethodInterceptor.java b/core/src/main/java/org/springframework/security/access/method/PrePostAdviceMethodInterceptor.java
index 32e6491..ed8f197 100644
--- a/core/src/main/java/org/springframework/security/access/method/PrePostAdviceMethodInterceptor.java
+++ b/core/src/main/java/org/springframework/security/access/method/PrePostAdviceMethodInterceptor.java
@@ -86,7 +86,7 @@
 			.getAttributes(method, targetClass);
 
 		PreInvocationAttribute preAttr = findPreInvocationAttribute(attributes);
-		Mono<Authentication> toInvoke = Mono.currentContext()
+		Mono<Authentication> toInvoke = Mono.subscriberContext()
 			.defaultIfEmpty(Context.empty())
 			.flatMap( cxt -> cxt.getOrDefault(Authentication.class, Mono.just(anonymous)))
 			.filter( auth -> this.preAdvice.before(auth, invocation, preAttr))
