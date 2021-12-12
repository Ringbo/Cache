diff --git a/spring-boot/src/main/java/org/springframework/boot/web/servlet/view/velocity/EmbeddedVelocityToolboxView.java b/spring-boot/src/main/java/org/springframework/boot/web/servlet/view/velocity/EmbeddedVelocityToolboxView.java
index ca8ae5a..94955d5 100644
--- a/spring-boot/src/main/java/org/springframework/boot/web/servlet/view/velocity/EmbeddedVelocityToolboxView.java
+++ b/spring-boot/src/main/java/org/springframework/boot/web/servlet/view/velocity/EmbeddedVelocityToolboxView.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2012-2015 the original author or authors.
+ * Copyright 2012-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -34,10 +34,11 @@
 
 /**
  * Extended version of {@link VelocityToolboxView} that can load toolbox locations from
- * the classpath as well as the servlet context. This is useful when run an embedded web
- * server.
+ * the classpath as well as the servlet context. This is useful when running in an
+ * embedded web server.
  *
  * @author Phillip Webb
+ * @author Andy Wilkinson
  * @since 1.2.5
  */
 @SuppressWarnings("deprecation")
@@ -69,7 +70,7 @@
 		ProxyFactory factory = new ProxyFactory();
 		factory.setTarget(getServletContext());
 		factory.addAdvice(new GetResourceMethodInterceptor(getToolboxConfigLocation()));
-		return (ServletContext) factory.getProxy();
+		return (ServletContext) factory.getProxy(getClass().getClassLoader());
 	}
 
 	/**
