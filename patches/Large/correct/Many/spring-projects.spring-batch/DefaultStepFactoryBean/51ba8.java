diff --git a/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java b/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
index c6e6cf9..88b1a35 100644
--- a/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
+++ b/spring-batch-core/src/main/java/org/springframework/batch/core/step/DefaultStepFactoryBean.java
@@ -54,7 +54,7 @@
 
 	private RepeatTemplate stepOperations;
 
-	private SimpleLimitExceptionHandler exceptionHandler;
+	private ExceptionHandler exceptionHandler;
 
 	/**
 	 * Set the commit interval.
@@ -113,7 +113,7 @@
 	 * Public setter for the SimpleLimitExceptionHandler.
 	 * @param exceptionHandler the exceptionHandler to set
 	 */
-	public void setExceptionHandler(SimpleLimitExceptionHandler exceptionHandler) {
+	public void setExceptionHandler(ExceptionHandler exceptionHandler) {
 		this.exceptionHandler = exceptionHandler;
 	}
 
