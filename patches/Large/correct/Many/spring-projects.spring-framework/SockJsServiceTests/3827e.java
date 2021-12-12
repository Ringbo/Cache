diff --git a/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/support/SockJsServiceTests.java b/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/support/SockJsServiceTests.java
index d2bae76..b037532 100644
--- a/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/support/SockJsServiceTests.java
+++ b/spring-websocket/src/test/java/org/springframework/web/socket/sockjs/support/SockJsServiceTests.java
@@ -148,15 +148,15 @@
 
 		assertEquals("text/html;charset=UTF-8", this.servletResponse.getContentType());
 		assertTrue(this.servletResponse.getContentAsString().startsWith("<!DOCTYPE html>\n"));
-		assertEquals(496, this.servletResponse.getContentLength());
+		assertEquals(490, this.servletResponse.getContentLength());
 		assertEquals("public, max-age=31536000", this.response.getHeaders().getCacheControl());
-		assertEquals("\"0da1ed070012f304e47b83c81c48ad620\"", this.response.getHeaders().getETag());
+		assertEquals("\"06b486b3208b085d9e3220f456a6caca4\"", this.response.getHeaders().getETag());
 	}
 
 	@Test
 	public void handleIframeRequestNotModified() throws Exception {
 
-		this.servletRequest.addHeader("If-None-Match", "\"0da1ed070012f304e47b83c81c48ad620\"");
+		this.servletRequest.addHeader("If-None-Match", "\"06b486b3208b085d9e3220f456a6caca4\"");
 
 		resetResponseAndHandleRequest("GET", "/echo/iframe.html", HttpStatus.NOT_MODIFIED);
 	}
