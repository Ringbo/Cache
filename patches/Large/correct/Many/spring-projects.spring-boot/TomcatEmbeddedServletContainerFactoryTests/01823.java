diff --git a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/tomcat/TomcatEmbeddedServletContainerFactoryTests.java b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/tomcat/TomcatEmbeddedServletContainerFactoryTests.java
index bd54e09..19e83e1 100644
--- a/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/tomcat/TomcatEmbeddedServletContainerFactoryTests.java
+++ b/spring-bootstrap/src/test/java/org/springframework/bootstrap/context/embedded/tomcat/TomcatEmbeddedServletContainerFactoryTests.java
@@ -48,7 +48,7 @@
 		}
 		factory.setContextLifecycleListeners(Arrays.asList(listeners[0], listeners[1]));
 		factory.addContextLifecycleListeners(listeners[2], listeners[3]);
-		this.container = factory.getEmbdeddedServletContainer();
+		this.container = factory.getEmbeddedServletContainer();
 		InOrder ordered = inOrder((Object[]) listeners);
 		for (LifecycleListener listener : listeners) {
 			ordered.verify(listener).lifecycleEvent((LifecycleEvent) anyObject());
