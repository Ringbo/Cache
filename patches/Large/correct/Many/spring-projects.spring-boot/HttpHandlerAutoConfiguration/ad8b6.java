diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/reactive/HttpHandlerAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/reactive/HttpHandlerAutoConfiguration.java
index 726f4f8..3a2b274 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/reactive/HttpHandlerAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/web/reactive/HttpHandlerAutoConfiguration.java
@@ -115,10 +115,10 @@
 					.reduce(RouterFunction::and).get();
 			HandlerStrategies.Builder strategiesBuilder = HandlerStrategies.builder();
 			if (this.messageReaders != null) {
-				this.messageReaders.forEach(strategiesBuilder::messageReader);
+				this.messageReaders.forEach(strategiesBuilder::customMessageReader);
 			}
 			if (this.messageWriters != null) {
-				this.messageWriters.forEach(strategiesBuilder::messageWriter);
+				this.messageWriters.forEach(strategiesBuilder::customMessageWriter);
 			}
 			if (this.viewResolvers != null) {
 				this.viewResolvers.forEach(strategiesBuilder::viewResolver);
