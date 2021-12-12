diff --git a/spring-context/src/test/java/org/springframework/aop/framework/autoproxy/AutoProxyCreatorTests.java b/spring-context/src/test/java/org/springframework/aop/framework/autoproxy/AutoProxyCreatorTests.java
index 141c493..d3d7958 100644
--- a/spring-context/src/test/java/org/springframework/aop/framework/autoproxy/AutoProxyCreatorTests.java
+++ b/spring-context/src/test/java/org/springframework/aop/framework/autoproxy/AutoProxyCreatorTests.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2009 the original author or authors.
+ * Copyright 2002-2012 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -38,9 +38,9 @@
 import org.springframework.context.support.StaticMessageSource;
 
 /**
- * @since 09.12.2003
  * @author Juergen Hoeller
  * @author Chris Beams
+ * @since 09.12.2003
  */
 public final class AutoProxyCreatorTests {
 
@@ -113,20 +113,20 @@
 		ITestBean singletonToBeProxied = (ITestBean) sac.getBean("singletonToBeProxied");
 		assertTrue(Proxy.isProxyClass(singletonToBeProxied.getClass()));
 
-		// 2 invocations coming from FactoryBean inspection during lifecycle startup
+		// 4 invocations coming from FactoryBean inspection during lifecycle startup
 
 		TestInterceptor ti = (TestInterceptor) sac.getBean("testInterceptor");
-		assertEquals(2, ti.nrOfInvocations);
+		assertEquals(4, ti.nrOfInvocations);
 		singletonToBeProxied.getName();
-		assertEquals(3, ti.nrOfInvocations);
+		assertEquals(5, ti.nrOfInvocations);
 
 		FactoryBean<?> factory = (FactoryBean<?>) sac.getBean("&singletonFactoryToBeProxied");
 		assertTrue(Proxy.isProxyClass(factory.getClass()));
 		TestBean tb = (TestBean) sac.getBean("singletonFactoryToBeProxied");
 		assertFalse(AopUtils.isAopProxy(tb));
-		assertEquals(5, ti.nrOfInvocations);
+		assertEquals(7, ti.nrOfInvocations);
 		tb.getAge();
-		assertEquals(5, ti.nrOfInvocations);
+		assertEquals(7, ti.nrOfInvocations);
 	}
 
 	@Test
