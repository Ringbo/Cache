diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/ListenableFutureReturnValueHandler.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/ListenableFutureReturnValueHandler.java
index db7923b..24df54f 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/ListenableFutureReturnValueHandler.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/ListenableFutureReturnValueHandler.java
@@ -50,7 +50,7 @@
 			return;
 		}
 
-		DeferredResult<Object> deferredResult = new DeferredResult<Object>();
+		final DeferredResult<Object> deferredResult = new DeferredResult<Object>();
 		WebAsyncUtils.getAsyncManager(webRequest).startDeferredResultProcessing(deferredResult, mavContainer);
 
 		ListenableFuture<?> future = (ListenableFuture<?>) returnValue;
