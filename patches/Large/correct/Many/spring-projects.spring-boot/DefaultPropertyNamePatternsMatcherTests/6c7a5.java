diff --git a/spring-boot/src/test/java/org/springframework/boot/bind/DefaultPropertyNamePatternsMatcherTests.java b/spring-boot/src/test/java/org/springframework/boot/bind/DefaultPropertyNamePatternsMatcherTests.java
index 6247e48..ed273d5 100644
--- a/spring-boot/src/test/java/org/springframework/boot/bind/DefaultPropertyNamePatternsMatcherTests.java
+++ b/spring-boot/src/test/java/org/springframework/boot/bind/DefaultPropertyNamePatternsMatcherTests.java
@@ -69,9 +69,9 @@
 
 	@Test
 	public void withSquareBrackets() throws Exception {
-		char[] delimeters = "._[".toCharArray();
+		char[] delimiters = "._[".toCharArray();
 		PropertyNamePatternsMatcher matcher = new DefaultPropertyNamePatternsMatcher(
-				delimeters, "aaa", "bbbb", "ccccc");
+				delimiters, "aaa", "bbbb", "ccccc");
 		assertTrue(matcher.matches("bbbb"));
 		assertTrue(matcher.matches("bbbb[4]"));
 		assertFalse(matcher.matches("bbb[4]"));
