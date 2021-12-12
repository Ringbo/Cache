diff --git a/spring-webmvc/src/test/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerAdapterIntegrationTests.java b/spring-webmvc/src/test/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerAdapterIntegrationTests.java
index 3a278e2..84fd0b1 100644
--- a/spring-webmvc/src/test/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerAdapterIntegrationTests.java
+++ b/spring-webmvc/src/test/java/org/springframework/web/servlet/mvc/method/annotation/RequestMappingHandlerAdapterIntegrationTests.java
@@ -411,9 +411,9 @@
 	private interface HandlerIfc {
 
 		String handleInInterface(
-				@CookieValue("cookie") int cookie,
-				@PathVariable("pathvar") String pathvar,
-				@RequestHeader("header") String header,
+				@CookieValue("cookie") int cookieV,
+				@PathVariable("pathvar") String pathvarV,
+				@RequestHeader("header") String headerV,
 				@RequestHeader(defaultValue = "#{systemProperties.systemHeader}") String systemHeader,
 				@RequestHeader Map<String, Object> headerMap,
 				@RequestParam("dateParam") Date dateParam,
@@ -459,9 +459,9 @@
 		}
 
 		public String handle(
-				@CookieValue("cookie") int cookie,
-				@PathVariable("pathvar") String pathvar,
-				@RequestHeader("header") String header,
+				@CookieValue("cookie") int cookieV,
+				@PathVariable("pathvar") String pathvarV,
+				@RequestHeader("header") String headerV,
 				@RequestHeader(defaultValue = "#{systemProperties.systemHeader}") String systemHeader,
 				@RequestHeader Map<String, Object> headerMap,
 				@RequestParam("dateParam") Date dateParam,
@@ -481,7 +481,7 @@
 				Model model,
 				UriComponentsBuilder builder) {
 
-			model.addAttribute("cookie", cookie).addAttribute("pathvar", pathvar).addAttribute("header", header)
+			model.addAttribute("cookie", cookieV).addAttribute("pathvar", pathvarV).addAttribute("header", headerV)
 					.addAttribute("systemHeader", systemHeader).addAttribute("headerMap", headerMap)
 					.addAttribute("dateParam", dateParam).addAttribute("paramMap", paramMap)
 					.addAttribute("paramByConvention", paramByConvention).addAttribute("value", value)
@@ -498,9 +498,9 @@
 
 		@Override
 		public String handleInInterface(
-				int cookie,
-				String pathvar,
-				String header,
+				int cookieV,
+				String pathvarV,
+				String headerV,
 				String systemHeader,
 				Map<String, Object> headerMap,
 				Date dateParam,
@@ -520,7 +520,7 @@
 				Model model,
 				UriComponentsBuilder builder) {
 
-			model.addAttribute("cookie", cookie).addAttribute("pathvar", pathvar).addAttribute("header", header)
+			model.addAttribute("cookie", cookieV).addAttribute("pathvar", pathvarV).addAttribute("header", headerV)
 					.addAttribute("systemHeader", systemHeader).addAttribute("headerMap", headerMap)
 					.addAttribute("dateParam", dateParam).addAttribute("paramMap", paramMap)
 					.addAttribute("paramByConvention", paramByConvention).addAttribute("value", value)
