diff --git a/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java b/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
index f326ae6..0c31c16 100644
--- a/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactoryTests.java
@@ -377,7 +377,8 @@
 			throws Exception {
 		AbstractEmbeddedServletContainerFactory factory = getFactory();
 		addTestTxtFile(factory);
-		factory.setSsl(getSsl(ClientAuth.NEED, "password", "src/test/resources/test.jks"));
+		factory.setSsl(getSsl(ClientAuth.NEED, "password", "src/test/resources/test.jks",
+				"src/test/resources/test.jks"));
 		this.container = factory.getEmbeddedServletContainer();
 		this.container.start();
 		KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
