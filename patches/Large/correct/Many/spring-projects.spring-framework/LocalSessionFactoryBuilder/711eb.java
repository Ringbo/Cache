diff --git a/spring-orm-hibernate5/src/main/java/org/springframework/orm/hibernate5/LocalSessionFactoryBuilder.java b/spring-orm-hibernate5/src/main/java/org/springframework/orm/hibernate5/LocalSessionFactoryBuilder.java
index 066fc45..d345263 100644
--- a/spring-orm-hibernate5/src/main/java/org/springframework/orm/hibernate5/LocalSessionFactoryBuilder.java
+++ b/spring-orm-hibernate5/src/main/java/org/springframework/orm/hibernate5/LocalSessionFactoryBuilder.java
@@ -70,6 +70,8 @@
  * <p>This is designed for programmatic use, e.g. in {@code @Bean} factory methods.
  * Consider using {@link LocalSessionFactoryBean} for XML bean definition files.
  *
+ * <p>Compatible with Hibernate 5.0/5.1 as well as 5.2, as of Spring 4.3.
+ *
  * @author Juergen Hoeller
  * @since 4.2
  * @see LocalSessionFactoryBean
@@ -189,7 +191,7 @@
 		}
 
 		// Hibernate 5.2: manually enforce connection release mode AFTER_STATEMENT (the JTA default)
-		getProperties().remove("hibernate.connection.handling_mode", "DELAYED_ACQUISITION_AND_RELEASE_AFTER_STATEMENT");
+		getProperties().put("hibernate.connection.handling_mode", "DELAYED_ACQUISITION_AND_RELEASE_AFTER_STATEMENT");
 
 		return this;
 	}
