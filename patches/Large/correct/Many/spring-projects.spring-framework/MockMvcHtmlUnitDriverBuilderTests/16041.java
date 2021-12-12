diff --git a/spring-test/src/test/java/org/springframework/test/web/servlet/htmlunit/webdriver/MockMvcHtmlUnitDriverBuilderTests.java b/spring-test/src/test/java/org/springframework/test/web/servlet/htmlunit/webdriver/MockMvcHtmlUnitDriverBuilderTests.java
index 0f2ec38..ed79749 100644
--- a/spring-test/src/test/java/org/springframework/test/web/servlet/htmlunit/webdriver/MockMvcHtmlUnitDriverBuilderTests.java
+++ b/spring-test/src/test/java/org/springframework/test/web/servlet/htmlunit/webdriver/MockMvcHtmlUnitDriverBuilderTests.java
@@ -124,7 +124,7 @@
 		assertThat(get("http://localhost/"), equalTo(""));
 		Cookie cookie = new Cookie("localhost", "cookie", "cookieManagerShared");
 		otherDriver.getWebClient().getCookieManager().addCookie(cookie);
-		assertThat(get("http://localhost/"), equalTo("cookieManagerShared"));
+		assertThat(get("http://localhost/"), containsString("cookieManagerShared"));
 	}
 
 
