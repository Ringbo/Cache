diff --git a/spring-web/src/main/java/org/springframework/http/converter/FormHttpMessageConverter.java b/spring-web/src/main/java/org/springframework/http/converter/FormHttpMessageConverter.java
index eb49090..6cf56b2 100644
--- a/spring-web/src/main/java/org/springframework/http/converter/FormHttpMessageConverter.java
+++ b/spring-web/src/main/java/org/springframework/http/converter/FormHttpMessageConverter.java
@@ -270,7 +270,7 @@
 			throws IOException, HttpMessageNotWritableException {
 
 		if (!isMultipart(map, contentType)) {
-			writeForm((MultiValueMap<String, String>) map, contentType, outputMessage);
+			writeForm((MultiValueMap<String, Object>) map, contentType, outputMessage);
 		}
 		else {
 			writeMultipart((MultiValueMap<String, Object>) map, outputMessage);
@@ -292,7 +292,7 @@
 		return false;
 	}
 
-	private void writeForm(MultiValueMap<String, String> formData, @Nullable MediaType contentType,
+	private void writeForm(MultiValueMap<String, Object> formData, @Nullable MediaType contentType,
 			HttpOutputMessage outputMessage) throws IOException {
 
 		contentType = getMediaType(contentType);
@@ -325,7 +325,7 @@
 		}
 	}
 
-	protected String serializeForm(MultiValueMap<String, String> formData, Charset charset) {
+	protected String serializeForm(MultiValueMap<String, Object> formData, Charset charset) {
 		StringBuilder builder = new StringBuilder();
 		formData.forEach((name, values) ->
 				values.forEach(value -> {
@@ -336,7 +336,7 @@
 						builder.append(URLEncoder.encode(name, charset.name()));
 						if (value != null) {
 							builder.append('=');
-							builder.append(URLEncoder.encode(value, charset.name()));
+							builder.append(URLEncoder.encode(String.valueOf(value), charset.name()));
 						}
 					}
 					catch (UnsupportedEncodingException ex) {
