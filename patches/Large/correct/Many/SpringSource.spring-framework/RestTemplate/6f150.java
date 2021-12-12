diff --git a/org.springframework.web/src/main/java/org/springframework/web/client/RestTemplate.java b/org.springframework.web/src/main/java/org/springframework/web/client/RestTemplate.java
index f6c3c95..94f957c 100644
--- a/org.springframework.web/src/main/java/org/springframework/web/client/RestTemplate.java
+++ b/org.springframework.web/src/main/java/org/springframework/web/client/RestTemplate.java
@@ -607,7 +607,7 @@
 		private final HttpMessageConverterExtractor<T> delegate;
 
 		public ResponseEntityResponseExtractor(Class<T> responseType) {
-			if (responseType != null) {
+			if (responseType != null && !Void.class.equals(responseType)) {
 				this.delegate = new HttpMessageConverterExtractor<T>(responseType, getMessageConverters(), logger);
 			} else {
 				this.delegate = null;
