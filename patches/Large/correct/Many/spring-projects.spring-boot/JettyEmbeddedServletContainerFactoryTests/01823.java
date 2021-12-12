diff --git a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/jetty/JettyEmbeddedServletContainerFactoryTests.java b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/jetty/JettyEmbeddedServletContainerFactoryTests.java
index d75bd8b..8b4526e 100644
--- a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/jetty/JettyEmbeddedServletContainerFactoryTests.java
+++ b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/jetty/JettyEmbeddedServletContainerFactoryTests.java
@@ -47,7 +47,7 @@
 		}
 		factory.setConfigurations(Arrays.asList(configurations[0], configurations[1]));
 		factory.addConfigurations(configurations[2], configurations[3]);
-		this.container = factory.getEmbdeddedServletContainer();
+		this.container = factory.getEmbeddedServletContainer();
 		InOrder ordered = inOrder((Object[]) configurations);
 		for (Configuration configuration : configurations) {
 			ordered.verify(configuration).configure((WebAppContext) anyObject());
