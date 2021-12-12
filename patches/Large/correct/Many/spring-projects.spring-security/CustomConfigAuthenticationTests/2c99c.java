diff --git a/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/CustomConfigAuthenticationTests.java b/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/CustomConfigAuthenticationTests.java
index f9fbb59..f73067d 100644
--- a/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/CustomConfigAuthenticationTests.java
+++ b/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/CustomConfigAuthenticationTests.java
@@ -63,7 +63,7 @@
 	public void authenticationSuccess() throws Exception {
 		mvc.perform(
 				formLogin("/authenticate").user("user", "user").password("pass",
-						"password")).andExpect(status().isMovedTemporarily())
+						"password")).andExpect(status().isFound())
 				.andExpect(redirectedUrl("/"))
 				.andExpect(authenticated().withUsername("user"));
 	}
@@ -78,7 +78,7 @@
 	public void authenticationFailed() throws Exception {
 		mvc.perform(
 				formLogin("/authenticate").user("user", "notfound").password("pass",
-						"invalid")).andExpect(status().isMovedTemporarily())
+						"invalid")).andExpect(status().isFound())
 				.andExpect(redirectedUrl("/authenticate?error"))
 				.andExpect(unauthenticated());
 	}
