diff --git a/hibernate-core/src/test/java/org/hibernate/test/annotations/uniqueconstraint/UniqueConstraintValidationTest.java b/hibernate-core/src/test/java/org/hibernate/test/annotations/uniqueconstraint/UniqueConstraintValidationTest.java
index ffab1ef..d6c8229 100644
--- a/hibernate-core/src/test/java/org/hibernate/test/annotations/uniqueconstraint/UniqueConstraintValidationTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/annotations/uniqueconstraint/UniqueConstraintValidationTest.java
@@ -42,7 +42,7 @@
 		cfg.addAnnotatedClass(entity);
 		cfg.buildMappings();
 		ServiceRegistryImplementor serviceRegistry = (ServiceRegistryImplementor) new StandardServiceRegistryBuilder()
-				.applySettings(cfg.getProperties()).buildServiceRegistry();
+				.applySettings(cfg.getProperties()).build();
 		cfg.buildSessionFactory(serviceRegistry);
 	}
 
