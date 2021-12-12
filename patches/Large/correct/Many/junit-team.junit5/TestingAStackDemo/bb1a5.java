diff --git a/documentation/src/test/java/example/TestingAStackDemo.java b/documentation/src/test/java/example/TestingAStackDemo.java
index 871ee36..4dc89da 100644
--- a/documentation/src/test/java/example/TestingAStackDemo.java
+++ b/documentation/src/test/java/example/TestingAStackDemo.java
@@ -50,13 +50,13 @@
 		@Test
 		@DisplayName("throws EmptyStackException when popped")
 		void throwsExceptionWhenPopped() {
-			Assertions.expectThrows(EmptyStackException.class, () -> stack.pop());
+			Assertions.assertThrows(EmptyStackException.class, () -> stack.pop());
 		}
 
 		@Test
 		@DisplayName("throws EmptyStackException when peeked")
 		void throwsExceptionWhenPeeked() {
-			Assertions.expectThrows(EmptyStackException.class, () -> stack.peek());
+			Assertions.assertThrows(EmptyStackException.class, () -> stack.peek());
 		}
 
 		@Nested
