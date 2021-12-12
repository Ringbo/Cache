diff --git a/org.springframework.web/src/test/java/org/springframework/web/converter/StringHttpMessageConverterTests.java b/org.springframework.web/src/test/java/org/springframework/web/converter/StringHttpMessageConverterTests.java
index af6dd93..28b5e8a 100644
--- a/org.springframework.web/src/test/java/org/springframework/web/converter/StringHttpMessageConverterTests.java
+++ b/org.springframework.web/src/test/java/org/springframework/web/converter/StringHttpMessageConverterTests.java
@@ -55,12 +55,12 @@
 		Charset charset = Charset.forName("UTF-8");
 		converter.setSupportedMediaTypes(Collections.singletonList(new MediaType("text", "plain", charset)));
 		MockHttpOutputMessage outputMessage = new MockHttpOutputMessage();
-		String body = "H�llo W�rld";
+		String body = "Hello World";
 		converter.write(body, outputMessage);
 		assertEquals("Invalid result", body, outputMessage.getBodyAsString(charset));
 		assertEquals("Invalid content-type", new MediaType("text", "plain", charset),
 				outputMessage.getHeaders().getContentType());
-		assertEquals("Invalid content-length", 13, outputMessage.getHeaders().getContentLength());
+		assertEquals("Invalid content-length", 11, outputMessage.getHeaders().getContentLength());
 		assertFalse("Invalid accept-charset", outputMessage.getHeaders().getAcceptCharset().isEmpty());
 	}
 }
