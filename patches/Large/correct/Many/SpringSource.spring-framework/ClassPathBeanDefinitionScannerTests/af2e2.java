diff --git a/spring-context/src/test/java/org/springframework/context/annotation/ClassPathBeanDefinitionScannerTests.java b/spring-context/src/test/java/org/springframework/context/annotation/ClassPathBeanDefinitionScannerTests.java
index d11e255..4c51a74 100644
--- a/spring-context/src/test/java/org/springframework/context/annotation/ClassPathBeanDefinitionScannerTests.java
+++ b/spring-context/src/test/java/org/springframework/context/annotation/ClassPathBeanDefinitionScannerTests.java
@@ -56,7 +56,7 @@
 		GenericApplicationContext context = new GenericApplicationContext();
 		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
 		int beanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(12, beanCount);
+		assertEquals(13, beanCount);
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
 		assertTrue(context.containsBean("stubFooDao"));
@@ -105,7 +105,7 @@
 		GenericApplicationContext context = new GenericApplicationContext();
 		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
 		int beanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(12, beanCount);
+		assertEquals(13, beanCount);
 		scanner.scan(BASE_PACKAGE);
 
 		assertTrue(context.containsBean("serviceInvocationCounter"));
@@ -122,7 +122,7 @@
 		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
 		scanner.setIncludeAnnotationConfig(false);
 		int beanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(6, beanCount);
+		assertEquals(7, beanCount);
 
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
@@ -167,7 +167,7 @@
 		scanner.setIncludeAnnotationConfig(false);
 		int scannedBeanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(5, scannedBeanCount);
+		assertEquals(6, scannedBeanCount);
 		assertEquals(initialBeanCount + scannedBeanCount, context.getBeanDefinitionCount());
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
@@ -187,7 +187,7 @@
 		scanner.setIncludeAnnotationConfig(false);
 		int scannedBeanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(5, scannedBeanCount);
+		assertEquals(6, scannedBeanCount);
 		assertEquals(initialBeanCount + scannedBeanCount, context.getBeanDefinitionCount());
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
@@ -267,7 +267,7 @@
 		scanner.addIncludeFilter(new AnnotationTypeFilter(CustomComponent.class));
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(13, beanCount);
+		assertEquals(14, beanCount);
 		assertTrue(context.containsBean("messageBean"));
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
@@ -288,7 +288,7 @@
 		scanner.addExcludeFilter(new AnnotationTypeFilter(Aspect.class));
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(11, beanCount);
+		assertEquals(12, beanCount);
 		assertFalse(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("fooServiceImpl"));
 		assertTrue(context.containsBean("stubFooDao"));
@@ -307,7 +307,7 @@
 		scanner.addExcludeFilter(new AssignableTypeFilter(FooService.class));
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(11, beanCount);
+		assertEquals(12, beanCount);
 		assertFalse(context.containsBean("fooServiceImpl"));
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("stubFooDao"));
@@ -328,7 +328,7 @@
 		scanner.addExcludeFilter(new AssignableTypeFilter(FooService.class));
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(5, beanCount);
+		assertEquals(6, beanCount);
 		assertFalse(context.containsBean("fooServiceImpl"));
 		assertTrue(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("stubFooDao"));
@@ -347,7 +347,7 @@
 		scanner.addExcludeFilter(new AnnotationTypeFilter(Aspect.class));
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(10, beanCount);
+		assertEquals(11, beanCount);
 		assertFalse(context.containsBean("fooServiceImpl"));
 		assertFalse(context.containsBean("serviceInvocationCounter"));
 		assertTrue(context.containsBean("stubFooDao"));
@@ -367,7 +367,7 @@
 		scanner.setBeanNameGenerator(new TestBeanNameGenerator());
 		int beanCount = scanner.scan(BASE_PACKAGE);
 
-		assertEquals(12, beanCount);
+		assertEquals(13, beanCount);
 		assertFalse(context.containsBean("fooServiceImpl"));
 		assertTrue(context.containsBean("fooService"));
 		assertTrue(context.containsBean("serviceInvocationCounter"));
@@ -388,7 +388,7 @@
 		GenericApplicationContext multiPackageContext = new GenericApplicationContext();
 		ClassPathBeanDefinitionScanner multiPackageScanner = new ClassPathBeanDefinitionScanner(multiPackageContext);
 		int singlePackageBeanCount = singlePackageScanner.scan(BASE_PACKAGE);
-		assertEquals(12, singlePackageBeanCount);
+		assertEquals(13, singlePackageBeanCount);
 		multiPackageScanner.scan(BASE_PACKAGE, "org.springframework.dao.annotation");
 		// assertTrue(multiPackageBeanCount > singlePackageBeanCount);
 	}
@@ -399,7 +399,7 @@
 		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
 		int initialBeanCount = context.getBeanDefinitionCount();
 		int scannedBeanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(12, scannedBeanCount);
+		assertEquals(13, scannedBeanCount);
 		assertEquals(scannedBeanCount, context.getBeanDefinitionCount() - initialBeanCount);
 		int addedBeanCount = scanner.scan("org.springframework.aop.aspectj.annotation");
 		assertEquals(initialBeanCount + scannedBeanCount + addedBeanCount, context.getBeanDefinitionCount());
@@ -412,7 +412,7 @@
 		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
 		scanner.setBeanNameGenerator(new TestBeanNameGenerator());
 		int beanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(12, beanCount);
+		assertEquals(13, beanCount);
 		context.refresh();
 
 		FooServiceImpl fooService = context.getBean("fooService", FooServiceImpl.class);
@@ -442,7 +442,7 @@
 		scanner.setIncludeAnnotationConfig(false);
 		scanner.setBeanNameGenerator(new TestBeanNameGenerator());
 		int beanCount = scanner.scan(BASE_PACKAGE);
-		assertEquals(6, beanCount);
+		assertEquals(7, beanCount);
 		context.refresh();
 
 		try {
