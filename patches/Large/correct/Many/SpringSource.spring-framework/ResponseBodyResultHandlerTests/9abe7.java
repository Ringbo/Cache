diff --git a/spring-webflux/src/test/java/org/springframework/web/reactive/result/method/annotation/ResponseBodyResultHandlerTests.java b/spring-webflux/src/test/java/org/springframework/web/reactive/result/method/annotation/ResponseBodyResultHandlerTests.java
index 4833d68..453ae6b 100644
--- a/spring-webflux/src/test/java/org/springframework/web/reactive/result/method/annotation/ResponseBodyResultHandlerTests.java
+++ b/spring-webflux/src/test/java/org/springframework/web/reactive/result/method/annotation/ResponseBodyResultHandlerTests.java
@@ -83,7 +83,7 @@
 		method = on(TestController.class).annotPresent(ResponseBody.class).resolveMethod();
 		testSupports(controller, method);
 
-		method = on(TestController.class).annotNotPresent(ResponseBody.class).resolveMethod();
+		method = on(TestController.class).annotNotPresent(ResponseBody.class).resolveMethod("doWork");
 		HandlerResult handlerResult = getHandlerResult(controller, method);
 		assertFalse(this.resultHandler.supports(handlerResult));
 	}
