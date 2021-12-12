diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
index ccdf7d3..48cff20 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/mvc/method/annotation/AbstractMessageConverterMethodProcessor.java
@@ -123,7 +123,7 @@
 			}
 		}
 		if (compatibleMediaTypes.isEmpty()) {
-			throw new HttpMediaTypeNotAcceptableException(allSupportedMediaTypes);
+			throw new HttpMediaTypeNotAcceptableException(producibleMediaTypes);
 		}
 
 		List<MediaType> mediaTypes = new ArrayList<MediaType>(compatibleMediaTypes);
