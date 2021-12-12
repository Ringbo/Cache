diff --git a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/metrics/RestTemplateUrlTemplateCapturingAspect.java b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/metrics/RestTemplateUrlTemplateCapturingAspect.java
index ef353ef..18abe55 100644
--- a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/metrics/RestTemplateUrlTemplateCapturingAspect.java
+++ b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/metrics/RestTemplateUrlTemplateCapturingAspect.java
@@ -26,7 +26,7 @@
 @Aspect
 public class RestTemplateUrlTemplateCapturingAspect {
 	@Around("execution(* org.springframework.web.client.RestOperations+.*(String, ..))")
-	Object captureUrlTemplate(ProceedingJoinPoint joinPoint) throws Throwable {
+	public Object captureUrlTemplate(ProceedingJoinPoint joinPoint) throws Throwable {
 		try {
 			String urlTemplate = (String) joinPoint.getArgs()[0];
 			RestTemplateUrlTemplateHolder.setRestTemplateUrlTemplate(urlTemplate);
