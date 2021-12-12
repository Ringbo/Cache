diff --git a/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java b/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
index ba611b6..931d8ad 100644
--- a/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
+++ b/config/src/test/java/org/springframework/security/config/annotation/method/configuration/EnableReactiveMethodSecurityTests.java
@@ -89,7 +89,7 @@
 		when(this.delegate.monoPreAuthorizeHasRoleFindById(1L)).thenReturn(Mono.just("result"));
 
 		Mono<String> findById = this.messageService.monoPreAuthorizeHasRoleFindById(1L)
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.expectNext("result")
@@ -114,7 +114,7 @@
 		when(this.delegate.monoPreAuthorizeHasRoleFindById(1L)).thenReturn(Mono.from(result));
 
 		Mono<String> findById = this.messageService.monoPreAuthorizeHasRoleFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -128,7 +128,7 @@
 		when(this.delegate.monoPreAuthorizeBeanFindById(2L)).thenReturn(Mono.just("result"));
 
 		Mono<String> findById = this.messageService.monoPreAuthorizeBeanFindById(2L)
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.expectNext("result")
@@ -164,7 +164,7 @@
 		when(this.delegate.monoPreAuthorizeBeanFindById(1L)).thenReturn(Mono.from(result));
 
 		Mono<String> findById = this.messageService.monoPreAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -178,7 +178,7 @@
 		when(this.delegate.monoPostAuthorizeFindById(1L)).thenReturn(Mono.just("user"));
 
 		Mono<String> findById = this.messageService.monoPostAuthorizeFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -190,7 +190,7 @@
 		when(this.delegate.monoPostAuthorizeBeanFindById(1L)).thenReturn(Mono.just("not-authorized"));
 
 		Mono<String> findById = this.messageService.monoPostAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -202,7 +202,7 @@
 		when(this.delegate.monoPostAuthorizeBeanFindById(2L)).thenReturn(Mono.just("user"));
 
 		Mono<String> findById = this.messageService.monoPostAuthorizeBeanFindById(2L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -225,7 +225,7 @@
 		when(this.delegate.monoPostAuthorizeBeanFindById(1L)).thenReturn(Mono.just("not-authorized"));
 
 		Mono<String> findById = this.messageService.monoPostAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -257,7 +257,7 @@
 		when(this.delegate.fluxPreAuthorizeHasRoleFindById(1L)).thenReturn(Flux.just("result"));
 
 		Flux<String> findById = this.messageService.fluxPreAuthorizeHasRoleFindById(1L)
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.consumeNextWith( s -> AssertionsForClassTypes.assertThat(s).isEqualTo("result"))
@@ -282,7 +282,7 @@
 		when(this.delegate.fluxPreAuthorizeHasRoleFindById(1L)).thenReturn(Flux.from(result));
 
 		Flux<String> findById = this.messageService.fluxPreAuthorizeHasRoleFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -296,7 +296,7 @@
 		when(this.delegate.fluxPreAuthorizeBeanFindById(2L)).thenReturn(Flux.just("result"));
 
 		Flux<String> findById = this.messageService.fluxPreAuthorizeBeanFindById(2L)
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.expectNext("result")
@@ -332,7 +332,7 @@
 		when(this.delegate.fluxPreAuthorizeBeanFindById(1L)).thenReturn(Flux.from(result));
 
 		Flux<String> findById = this.messageService.fluxPreAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -346,7 +346,7 @@
 		when(this.delegate.fluxPostAuthorizeFindById(1L)).thenReturn(Flux.just("user"));
 
 		Flux<String> findById = this.messageService.fluxPostAuthorizeFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -358,7 +358,7 @@
 		when(this.delegate.fluxPostAuthorizeBeanFindById(1L)).thenReturn(Flux.just("not-authorized"));
 
 		Flux<String> findById = this.messageService.fluxPostAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -370,7 +370,7 @@
 		when(this.delegate.fluxPostAuthorizeBeanFindById(2L)).thenReturn(Flux.just("user"));
 
 		Flux<String> findById = this.messageService.fluxPostAuthorizeBeanFindById(2L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -393,7 +393,7 @@
 		when(this.delegate.fluxPostAuthorizeBeanFindById(1L)).thenReturn(Flux.just("not-authorized"));
 
 		Flux<String> findById = this.messageService.fluxPostAuthorizeBeanFindById(1L)
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -425,7 +425,7 @@
 		when(this.delegate.publisherPreAuthorizeHasRoleFindById(1L)).thenReturn(publisherJust("result"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPreAuthorizeHasRoleFindById(1L))
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.consumeNextWith( s -> AssertionsForClassTypes.assertThat(s).isEqualTo("result"))
@@ -450,7 +450,7 @@
 		when(this.delegate.publisherPreAuthorizeHasRoleFindById(1L)).thenReturn(result);
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPreAuthorizeHasRoleFindById(1L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -464,7 +464,7 @@
 		when(this.delegate.publisherPreAuthorizeBeanFindById(2L)).thenReturn(publisherJust("result"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPreAuthorizeBeanFindById(2L))
-				.contextStart(withAdmin);
+				.subscriberContext(withAdmin);
 		StepVerifier
 				.create(findById)
 				.expectNext("result")
@@ -500,7 +500,7 @@
 		when(this.delegate.publisherPreAuthorizeBeanFindById(1L)).thenReturn(result);
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPreAuthorizeBeanFindById(1L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -514,7 +514,7 @@
 		when(this.delegate.publisherPostAuthorizeFindById(1L)).thenReturn(publisherJust("user"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPostAuthorizeFindById(1L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -526,7 +526,7 @@
 		when(this.delegate.publisherPostAuthorizeBeanFindById(1L)).thenReturn(publisherJust("not-authorized"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPostAuthorizeBeanFindById(1L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
@@ -538,7 +538,7 @@
 		when(this.delegate.publisherPostAuthorizeBeanFindById(2L)).thenReturn(publisherJust("user"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPostAuthorizeBeanFindById(2L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectNext("user")
@@ -561,7 +561,7 @@
 		when(this.delegate.publisherPostAuthorizeBeanFindById(1L)).thenReturn(publisherJust("not-authorized"));
 
 		Publisher<String> findById = Flux.from(this.messageService.publisherPostAuthorizeBeanFindById(1L))
-				.contextStart(withUser);
+				.subscriberContext(withUser);
 		StepVerifier
 				.create(findById)
 				.expectError(AccessDeniedException.class)
