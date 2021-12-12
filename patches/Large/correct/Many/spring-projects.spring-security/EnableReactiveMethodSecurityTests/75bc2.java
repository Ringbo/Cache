diff --git a/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java b/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
index 1199f08..38207db 100644
--- a/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
+++ b/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
@@ -66,7 +66,7 @@
 		assertThatThrownBy(() -> this.messageService.notPublisherPreAuthorizeFindById(1L))
 			.isInstanceOf(IllegalStateException.class)
 			.extracting(Throwable::getMessage)
-			.contains("The returnType class java.lang.String on public abstract java.lang.String org.springframework.security.config.annotation.method.configuration.ReactiveMessageService.notPublisherPreAuthorizeFindById(long) must return an instance of org.reactivestreams.Publisher (i.e. Mono / Flux) in order to support Reactor Context");
+			.isEqualTo("The returnType class java.lang.String on public abstract java.lang.String org.springframework.security.config.annotation.method.configuration.ReactiveMessageService.notPublisherPreAuthorizeFindById(long) must return an instance of org.reactivestreams.Publisher (i.e. Mono / Flux) in order to support Reactor Context");
 	}
 
 	@Test
