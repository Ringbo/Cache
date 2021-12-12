diff --git a/spring-boot-test/src/test/java/org/springframework/boot/test/mock/mockito/ResetMocksTestExecutionListenerTests.java b/spring-boot-test/src/test/java/org/springframework/boot/test/mock/mockito/ResetMocksTestExecutionListenerTests.java
index 90a75cc..025058a 100644
--- a/spring-boot-test/src/test/java/org/springframework/boot/test/mock/mockito/ResetMocksTestExecutionListenerTests.java
+++ b/spring-boot-test/src/test/java/org/springframework/boot/test/mock/mockito/ResetMocksTestExecutionListenerTests.java
@@ -75,16 +75,16 @@
 
 		@Bean
 		public ExampleService after(MockitoBeans mockedBeans) {
-			ExampleService mock = mock(ExampleService.class, MockReset.before());
+			ExampleService mock = mock(ExampleService.class, MockReset.after());
 			mockedBeans.add(mock);
 			return mock;
 		}
 
 		@Bean
 		public ExampleService none(MockitoBeans mockedBeans) {
-			ExampleService mock = mock(ExampleService.class, MockReset.before());
+			ExampleService mock = mock(ExampleService.class);
 			mockedBeans.add(mock);
-			return mock(ExampleService.class);
+			return mock;
 		}
 
 		@Bean
