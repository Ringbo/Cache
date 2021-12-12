diff --git a/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/AuthenticationTests.java b/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/AuthenticationTests.java
index 9be5216..688eae6 100644
--- a/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/AuthenticationTests.java
+++ b/test/src/test/java/org/springframework/security/test/web/servlet/showcase/login/AuthenticationTests.java
@@ -54,7 +54,7 @@
 
 	@Test
 	public void requiresAuthentication() throws Exception {
-		mvc.perform(get("/")).andExpect(status().isMovedTemporarily());
+		mvc.perform(get("/")).andExpect(status().isFound());
 	}
 
 	@Test
@@ -66,7 +66,7 @@
 
 	@Test
 	public void authenticationSuccess() throws Exception {
-		mvc.perform(formLogin()).andExpect(status().isMovedTemporarily())
+		mvc.perform(formLogin()).andExpect(status().isFound())
 				.andExpect(redirectedUrl("/"))
 				.andExpect(authenticated().withUsername("user"));
 	}
@@ -74,7 +74,7 @@
 	@Test
 	public void authenticationFailed() throws Exception {
 		mvc.perform(formLogin().user("user").password("invalid"))
-				.andExpect(status().isMovedTemporarily())
+				.andExpect(status().isFound())
 				.andExpect(redirectedUrl("/login?error")).andExpect(unauthenticated());
 	}
 
