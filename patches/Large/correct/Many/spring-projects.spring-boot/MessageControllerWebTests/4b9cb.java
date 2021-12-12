diff --git a/spring-boot-samples/spring-boot-sample-web-groovy-templates/src/test/java/sample/ui/MessageControllerWebTests.java b/spring-boot-samples/spring-boot-sample-web-groovy-templates/src/test/java/sample/ui/MessageControllerWebTests.java
index e734013..7e0d7a4 100755
--- a/spring-boot-samples/spring-boot-sample-web-groovy-templates/src/test/java/sample/ui/MessageControllerWebTests.java
+++ b/spring-boot-samples/spring-boot-sample-web-groovy-templates/src/test/java/sample/ui/MessageControllerWebTests.java
@@ -70,7 +70,7 @@
 	@Test
 	public void testCreate() throws Exception {
 		this.mockMvc.perform(post("/").param("text", "FOO text").param("summary", "FOO"))
-				.andExpect(status().isMovedTemporarily())
+				.andExpect(status().isFound())
 				.andExpect(header().string("location", RegexMatcher.matches("/[0-9]+")));
 	}
 
