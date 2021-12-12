diff --git a/spring-batch-test/src/test/java/org/springframework/batch/test/common/LogAdvice.java b/spring-batch-test/src/test/java/org/springframework/batch/test/common/LogAdvice.java
index 146045b..ff54bd1 100755
--- a/spring-batch-test/src/test/java/org/springframework/batch/test/common/LogAdvice.java
+++ b/spring-batch-test/src/test/java/org/springframework/batch/test/common/LogAdvice.java
@@ -36,7 +36,7 @@
      */
     public void doBasicLogging(JoinPoint pjp) throws Throwable {
     	Object[] args = pjp.getArgs();
-    	StringBuffer output = new StringBuffer();
+    	StringBuilder output = new StringBuilder();
 
 		output.append(pjp.getTarget().getClass().getName()).append(": ");
 		output.append(pjp.toShortString()).append(": ");
