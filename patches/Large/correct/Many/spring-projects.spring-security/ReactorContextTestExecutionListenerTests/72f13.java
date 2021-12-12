diff --git a/test/src/test/java/org/springframework/security/test/context/support/ReactorContextTestExecutionListenerTests.java b/test/src/test/java/org/springframework/security/test/context/support/ReactorContextTestExecutionListenerTests.java
index 870cba0..ac9cece 100644
--- a/test/src/test/java/org/springframework/security/test/context/support/ReactorContextTestExecutionListenerTests.java
+++ b/test/src/test/java/org/springframework/security/test/context/support/ReactorContextTestExecutionListenerTests.java
@@ -60,7 +60,7 @@
 	public void beforeTestMethodWhenSecurityContextEmptyThenReactorContextNull() throws Exception {
 		this.listener.beforeTestMethod(this.testContext);
 
-		assertThat(Mono.currentContext().block().isEmpty()).isTrue();
+		assertThat(Mono.subscriberContext().block().isEmpty()).isTrue();
 	}
 
 	@Test
@@ -69,7 +69,7 @@
 
 		this.listener.beforeTestMethod(this.testContext);
 
-		assertThat(Mono.currentContext().block().isEmpty()).isTrue();
+		assertThat(Mono.subscriberContext().block().isEmpty()).isTrue();
 	}
 
 
@@ -98,7 +98,7 @@
 
 		this.listener.afterTestMethod(this.testContext);
 
-		assertThat(Mono.currentContext().block().isEmpty()).isTrue();
+		assertThat(Mono.subscriberContext().block().isEmpty()).isTrue();
 	}
 
 	@Test
@@ -110,7 +110,7 @@
 	}
 
 	public void assertAuthentication(Authentication expected) {
-		Mono<Authentication> authentication = Mono.currentContext()
+		Mono<Authentication> authentication = Mono.subscriberContext()
 			.flatMap( context -> context.<Mono<Authentication>>get(Authentication.class));
 
 		StepVerifier.create(authentication)
