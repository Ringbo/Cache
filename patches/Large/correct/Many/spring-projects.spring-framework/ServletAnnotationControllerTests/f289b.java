diff --git a/org.springframework.web.servlet/src/test/java/org/springframework/web/servlet/mvc/annotation/ServletAnnotationControllerTests.java b/org.springframework.web.servlet/src/test/java/org/springframework/web/servlet/mvc/annotation/ServletAnnotationControllerTests.java
index 7f8c614..140392e 100644
--- a/org.springframework.web.servlet/src/test/java/org/springframework/web/servlet/mvc/annotation/ServletAnnotationControllerTests.java
+++ b/org.springframework.web.servlet/src/test/java/org/springframework/web/servlet/mvc/annotation/ServletAnnotationControllerTests.java
@@ -982,7 +982,7 @@
 		request.setCookies(new Cookie("date", "2008-11-18"));
 		MockHttpServletResponse response  = new MockHttpServletResponse();
 		servlet.service(request, response);
-		assertEquals("test-1226962800000", response.getContentAsString());
+		assertEquals("test-108", response.getContentAsString());
 	}
 
 	@Test
@@ -1706,7 +1706,7 @@
 		public void handle(@CookieValue("date") Date date, Writer writer)
 				throws IOException {
 			assertEquals("Invalid path variable value", new Date(108, 10, 18), date);
-			writer.write("test-" + date.getTime());
+			writer.write("test-" + date.getYear());
 		}
 
 	}
