diff --git a/org.springframework.context/src/main/java/org/springframework/validation/beanvalidation/SpringValidatorAdapter.java b/org.springframework.context/src/main/java/org/springframework/validation/beanvalidation/SpringValidatorAdapter.java
index d6a28c3..3b286bd 100644
--- a/org.springframework.context/src/main/java/org/springframework/validation/beanvalidation/SpringValidatorAdapter.java
+++ b/org.springframework.context/src/main/java/org/springframework/validation/beanvalidation/SpringValidatorAdapter.java
@@ -121,7 +121,7 @@
 	public <T> Set<ConstraintViolation<T>> validateValue(
 			Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
 
-		return this.targetValidator.validateValue(beanType, propertyName, groups);
+		return this.targetValidator.validateValue(beanType, propertyName, value, groups);
 	}
 
 	public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
