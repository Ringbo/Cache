diff --git a/spring-boot/src/main/java/org/springframework/boot/context/embedded/jetty/JettyEmbeddedServletContainerFactory.java b/spring-boot/src/main/java/org/springframework/boot/context/embedded/jetty/JettyEmbeddedServletContainerFactory.java
index 1467107..5024b1b 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/embedded/jetty/JettyEmbeddedServletContainerFactory.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/embedded/jetty/JettyEmbeddedServletContainerFactory.java
@@ -259,7 +259,7 @@
 		if (getSslStoreProvider() != null) {
 			try {
 				factory.setKeyStore(getSslStoreProvider().getKeyStore());
-				factory.setTrustStore(getSslStoreProvider().getKeyStore());
+				factory.setTrustStore(getSslStoreProvider().getTrustStore());
 			}
 			catch (Exception ex) {
 				throw new IllegalStateException("Unable to set SSL store", ex);
