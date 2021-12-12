diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jms/JmsTemplateAutoConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jms/JmsTemplateAutoConfigurationTests.java
index ea7ade8..b745c96 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jms/JmsTemplateAutoConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/jms/JmsTemplateAutoConfigurationTests.java
@@ -94,23 +94,23 @@
 	}
 
 	@Test
-	public void testPubSubEnabledByDefault() {
+	public void testPubSubDisabledByDefault() {
 		this.context = new AnnotationConfigApplicationContext();
 		this.context
 				.register(TestConfiguration.class, JmsTemplateAutoConfiguration.class);
 		this.context.refresh();
 		JmsTemplate jmsTemplate = this.context.getBean(JmsTemplate.class);
-		assertTrue(jmsTemplate.isPubSubDomain());
+		assertFalse(jmsTemplate.isPubSubDomain());
 	}
 
 	@Test
-	public void testJmsTemplatePostProcessedSoThatPubSubIsFalse() {
+	public void testJmsTemplatePostProcessedSoThatPubSubIsTrue() {
 		this.context = new AnnotationConfigApplicationContext();
 		this.context.register(TestConfiguration4.class,
 				JmsTemplateAutoConfiguration.class);
 		this.context.refresh();
 		JmsTemplate jmsTemplate = this.context.getBean(JmsTemplate.class);
-		assertFalse(jmsTemplate.isPubSubDomain());
+		assertTrue(jmsTemplate.isPubSubDomain());
 	}
 
 	@Test
@@ -262,7 +262,7 @@
 				throws BeansException {
 			if (bean.getClass().isAssignableFrom(JmsTemplate.class)) {
 				JmsTemplate jmsTemplate = (JmsTemplate) bean;
-				jmsTemplate.setPubSubDomain(false);
+				jmsTemplate.setPubSubDomain(true);
 			}
 			return bean;
 		}
