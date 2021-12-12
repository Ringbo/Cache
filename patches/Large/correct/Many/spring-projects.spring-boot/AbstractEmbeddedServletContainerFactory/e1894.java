diff --git a/spring-boot/src/main/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactory.java b/spring-boot/src/main/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactory.java
index a5bc91a..2eeb70c 100644
--- a/spring-boot/src/main/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactory.java
+++ b/spring-boot/src/main/java/org/springframework/boot/context/embedded/AbstractEmbeddedServletContainerFactory.java
@@ -66,7 +66,7 @@
 		file = file != null ? file : getExplodedWarFileDocumentRoot();
 		// Or maybe there is a document root in a well-known location
 		file = file != null ? file : getCommonDocumentRoot();
-		if (file == null && this.logger.isWarnEnabled()) {
+		if (file == null && this.logger.isDebugEnabled()) {
 			this.logger.debug("None of the document roots "
 					+ Arrays.asList(COMMON_DOC_ROOTS)
 					+ " point to a directory and will be ignored.");
