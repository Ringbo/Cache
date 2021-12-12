diff --git a/spring-web/src/main/java/org/springframework/http/converter/AbstractHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/AbstractHttpMessageConverter.java
index fd7d1f0..1457cfe 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/AbstractHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/AbstractHttpMessageConverter.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2016 the original author or authors.
+ * Copyright 2002-2017 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -96,7 +96,7 @@
 	 * Set the list of {@link MediaType} objects supported by this converter.
 	 */
 	public void setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {
-		Assert.notEmpty(supportedMediaTypes, "'supportedMediaTypes' must not be empty");
+		Assert.notEmpty(supportedMediaTypes, "MediaType List must not be empty");
 		this.supportedMediaTypes = new ArrayList<>(supportedMediaTypes);
 	}
 
@@ -231,8 +231,8 @@
 
 	/**
 	 * Add default headers to the output message.
-	 * <p>This implementation delegates to {@link #getDefaultContentType(Object)} if a content
-	 * type was not provided, set if necessary the default character set, calls
+	 * <p>This implementation delegates to {@link #getDefaultContentType(Object)} if a
+	 * content type was not provided, set if necessary the default character set, calls
 	 * {@link #getContentLength}, and sets the corresponding headers.
 	 * @since 4.2
 	 */
@@ -256,7 +256,7 @@
 				headers.setContentType(contentTypeToUse);
 			}
 		}
-		if (headers.getContentLength() < 0) {
+		if (headers.getContentLength() < 0 && !headers.containsKey(HttpHeaders.TRANSFER_ENCODING)) {
 			Long contentLength = getContentLength(t, headers.getContentType());
 			if (contentLength != null) {
 				headers.setContentLength(contentLength);
