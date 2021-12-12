diff --git a/spring-webmvc/src/test/java/org/springframework/web/servlet/config/MvcNamespaceTests.java b/spring-webmvc/src/test/java/org/springframework/web/servlet/config/MvcNamespaceTests.java
index 8e7219e..8e3c347 100644
--- a/spring-webmvc/src/test/java/org/springframework/web/servlet/config/MvcNamespaceTests.java
+++ b/spring-webmvc/src/test/java/org/springframework/web/servlet/config/MvcNamespaceTests.java
@@ -691,7 +691,7 @@
 
 	@Test
 	public void testContentNegotiationManager() throws Exception {
-		loadBeanDefinitions("mvc-config-content-negotiation-manager.xml", 14);
+		loadBeanDefinitions("mvc-config-content-negotiation-manager.xml", 15);
 
 		RequestMappingHandlerMapping mapping = appContext.getBean(RequestMappingHandlerMapping.class);
 		ContentNegotiationManager manager = mapping.getContentNegotiationManager();
