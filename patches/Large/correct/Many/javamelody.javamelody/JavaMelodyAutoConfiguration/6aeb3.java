diff --git a/javamelody-spring-boot-starter/src/main/java/net/bull/javamelody/JavaMelodyAutoConfiguration.java b/javamelody-spring-boot-starter/src/main/java/net/bull/javamelody/JavaMelodyAutoConfiguration.java
index 60ccb98..147c0a1 100644
--- a/javamelody-spring-boot-starter/src/main/java/net/bull/javamelody/JavaMelodyAutoConfiguration.java
+++ b/javamelody-spring-boot-starter/src/main/java/net/bull/javamelody/JavaMelodyAutoConfiguration.java
@@ -175,11 +175,12 @@
 	}
 
 	/**
+	 * Now disabled by default, since dependency spring-boot-starter-aop was added in 1.76.
 	 * @return DefaultAdvisorAutoProxyCreator
 	 */
 	@Bean
 	@ConditionalOnMissingBean(DefaultAdvisorAutoProxyCreator.class)
-	@ConditionalOnProperty(prefix = JavaMelodyConfigurationProperties.PREFIX, name = "advisor-auto-proxy-creator-enabled", matchIfMissing = true)
+	@ConditionalOnProperty(prefix = JavaMelodyConfigurationProperties.PREFIX, name = "advisor-auto-proxy-creator-enabled", matchIfMissing = false)
 	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
 		return new DefaultAdvisorAutoProxyCreator();
 	}
@@ -255,15 +256,16 @@
 	}
 
 	/**
-	 * Monitoring of beans methods having the {@link Scheduled} or {@link Schedules} annotations,
-	 * only if <code>scheduled-monitoring-enabled: true</code> is added in application.yml.
+	 * Monitoring of beans methods having the {@link Scheduled} or {@link Schedules} annotations.
 	 * @return MonitoringSpringAdvisor
 	 */
 	@Bean
-	@ConditionalOnProperty(prefix = JavaMelodyConfigurationProperties.PREFIX, name = "scheduled-monitoring-enabled", matchIfMissing = false)
+	@ConditionalOnProperty(prefix = JavaMelodyConfigurationProperties.PREFIX, name = "scheduled-monitoring-enabled", matchIfMissing = true)
+	@ConditionalOnMissingBean(DefaultAdvisorAutoProxyCreator.class)
 	public MonitoringSpringAdvisor monitoringSpringScheduledAdvisor() {
-		// only if scheduled-monitoring-enabled because of #643,
-		// but https://jira.spring.io/browse/SPR-15562 may change that
+		// scheduled-monitoring-enabled was false by default because of #643,
+		// pending https://jira.spring.io/browse/SPR-15562,
+		// but true by default since 1.76 after adding dependency spring-boot-starter-aop
 		return new MonitoringSpringAdvisor(
 				Pointcuts.union(new AnnotationMatchingPointcut(null, Scheduled.class),
 						new AnnotationMatchingPointcut(null, Schedules.class)));
