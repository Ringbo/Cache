diff --git a/spring-web/src/test/java/org/springframework/http/server/reactive/DefaultPathSegmentContainerTests.java b/spring-web/src/test/java/org/springframework/http/server/reactive/DefaultPathSegmentContainerTests.java
index d1a62d5..9c56be1 100644
--- a/spring-web/src/test/java/org/springframework/http/server/reactive/DefaultPathSegmentContainerTests.java
+++ b/spring-web/src/test/java/org/springframework/http/server/reactive/DefaultPathSegmentContainerTests.java
@@ -92,7 +92,7 @@
 		testPath("/a/b/c", "/a/b/c", false, true, Arrays.asList("a", "b", "c"), false);
 
 		// root path
-		testPath("/", "/", false, true, Collections.singletonList(""), false);
+		testPath("/", "/", false, true, Collections.emptyList(), false);
 
 		// empty path
 		testPath("",   "", true, false, Collections.emptyList(), false);
