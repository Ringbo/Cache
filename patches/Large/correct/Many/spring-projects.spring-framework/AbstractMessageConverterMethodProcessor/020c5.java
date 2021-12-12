diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
index 219b149..a0d9b7c 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
@@ -284,7 +284,7 @@
 					if (body != null) {
 						Object theBody = body;
 						LogFormatUtils.traceDebug(logger, traceOn ->
-								"Writing [" + LogFormatUtils.formatValue(theBody, traceOn) + "]");
+								"Writing [" + LogFormatUtils.formatValue(theBody, !traceOn) + "]");
 						addContentDispositionHeader(inputMessage, outputMessage);
 						if (genericConverter != null) {
 							genericConverter.write(body, targetType, selectedMediaType, outputMessage);
