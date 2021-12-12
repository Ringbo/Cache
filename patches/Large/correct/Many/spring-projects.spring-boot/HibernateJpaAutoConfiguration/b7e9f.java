diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.java
index a53a66c..ca6b64f 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.java
@@ -147,8 +147,9 @@
 			vendorProperties.put(JTA_PLATFORM, new SpringJtaPlatform(
 					jtaTransactionManager));
 		}
-		catch (NoClassDefFoundError ex) {
-			// Can happen if Hibernate 4.2 is used
+		catch (LinkageError ex) {
+			// NoClassDefFoundError can happen if Hibernate 4.2 is used and some
+			// containers (e.g. JBoss EAP 6) wraps it in the superclass LinkageError
 			if (!isUsingJndi()) {
 				throw new IllegalStateException("Unable to set Hibernate JTA "
 						+ "platform, are you using the correct "
