diff --git a/docs/src/test/java/docs/security/SecurityConfiguration.java b/docs/src/test/java/docs/security/SecurityConfiguration.java
index bb9e364..06f78aa 100644
--- a/docs/src/test/java/docs/security/SecurityConfiguration.java
+++ b/docs/src/test/java/docs/security/SecurityConfiguration.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2014-2017 the original author or authors.
+ * Copyright 2014-2019 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -30,10 +30,11 @@
  */
 // tag::class[]
 @Configuration
-public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
+public class SecurityConfiguration<S extends Session>
+		extends WebSecurityConfigurerAdapter {
 
 	@Autowired
-	private FindByIndexNameSessionRepository<Session> sessionRepository;
+	private FindByIndexNameSessionRepository<S> sessionRepository;
 
 	@Override
 	protected void configure(HttpSecurity http) throws Exception {
@@ -47,7 +48,7 @@
 	}
 
 	@Bean
-	SpringSessionBackedSessionRegistry sessionRegistry() {
+	public SpringSessionBackedSessionRegistry<S> sessionRegistry() {
 		return new SpringSessionBackedSessionRegistry<>(this.sessionRepository);
 	}
 }
