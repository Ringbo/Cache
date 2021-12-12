diff --git a/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java b/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
index 9a58706..3df9993 100644
--- a/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
@@ -223,7 +223,7 @@
 	@Test
 	public void specificPort() throws Exception {
 		AbstractEmbeddedServletContainerFactory factory = getFactory();
-		int specificPort = SocketUtils.findAvailableTcpPort(40000);
+		int specificPort = SocketUtils.findAvailableTcpPort(41000);
 		factory.setPort(specificPort);
 		this.container = factory
 				.getEmbeddedServletContainer(exampleServletRegistration());
