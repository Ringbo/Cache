diff --git a/spring-web/src/test/java/org/springframework/http/server/reactive/AbstractHttpHandlerIntegrationTests.java b/spring-web/src/test/java/org/springframework/http/server/reactive/AbstractHttpHandlerIntegrationTests.java
index 3a6a60d..8535ebd 100644
--- a/spring-web/src/test/java/org/springframework/http/server/reactive/AbstractHttpHandlerIntegrationTests.java
+++ b/spring-web/src/test/java/org/springframework/http/server/reactive/AbstractHttpHandlerIntegrationTests.java
@@ -46,8 +46,8 @@
 		File base = new File(System.getProperty("java.io.tmpdir"));
 		return new Object[][] {
 				{new JettyHttpServer()},
-				//{new RxNettyHttpServer()},
-				{new ReactorHttpServer()},
+				{new RxNettyHttpServer()},
+				//{new ReactorHttpServer()},
 				{new TomcatHttpServer(base.getAbsolutePath())},
 				{new UndertowHttpServer()}
 		};
