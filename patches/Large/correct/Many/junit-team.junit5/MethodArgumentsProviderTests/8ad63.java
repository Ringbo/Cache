diff --git a/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/MethodArgumentsProviderTests.java b/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/MethodArgumentsProviderTests.java
index 68c5fc1..22c999f 100644
--- a/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/MethodArgumentsProviderTests.java
+++ b/junit-jupiter-params/src/test/java/org/junit/jupiter/params/provider/MethodArgumentsProviderTests.java
@@ -133,7 +133,7 @@
 
 	private Stream<Object[]> provideArguments(Class<?> testClass, String... methodNames) {
 		MethodSource annotation = mock(MethodSource.class);
-		when(annotation.names()).thenReturn(methodNames);
+		when(annotation.value()).thenReturn(methodNames);
 
 		ContainerExtensionContext context = mock(ContainerExtensionContext.class);
 		when(context.getTestClass()).thenReturn(Optional.ofNullable(testClass));
