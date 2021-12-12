diff --git a/test/src/test/java/org/springframework/security/test/context/annotation/SecurityTestExecutionListenerTests.java b/test/src/test/java/org/springframework/security/test/context/annotation/SecurityTestExecutionListenerTests.java
index 2164ce3..aec9996 100644
--- a/test/src/test/java/org/springframework/security/test/context/annotation/SecurityTestExecutionListenerTests.java
+++ b/test/src/test/java/org/springframework/security/test/context/annotation/SecurityTestExecutionListenerTests.java
@@ -42,7 +42,7 @@
 	@WithMockUser
 	@Test
 	public void reactorContextTestSecurityContextHolderExecutionListenerTestIsRegistered() {
-		Mono<String> name = Mono.currentContext()
+		Mono<String> name = Mono.subscriberContext()
 			.flatMap( context -> context.<Mono<Authentication>>get(Authentication.class))
 			.map(Principal::getName);
 
