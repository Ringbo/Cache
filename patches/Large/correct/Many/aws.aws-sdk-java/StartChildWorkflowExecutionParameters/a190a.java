diff --git a/aws-java-sdk-swf-libraries/src/main/java/com/amazonaws/services/simpleworkflow/flow/generic/StartChildWorkflowExecutionParameters.java b/aws-java-sdk-swf-libraries/src/main/java/com/amazonaws/services/simpleworkflow/flow/generic/StartChildWorkflowExecutionParameters.java
index abdde8a..96cad46 100644
--- a/aws-java-sdk-swf-libraries/src/main/java/com/amazonaws/services/simpleworkflow/flow/generic/StartChildWorkflowExecutionParameters.java
+++ b/aws-java-sdk-swf-libraries/src/main/java/com/amazonaws/services/simpleworkflow/flow/generic/StartChildWorkflowExecutionParameters.java
@@ -264,7 +264,7 @@
                 startChildWorkflowExecutionParameters.setTaskPriority(taskPriority);
             }
 
-            String lambdaRole = options.getLambdaRole();
+            String lambdaRole = optionsOverride.getLambdaRole();
             if (lambdaRole != null) {
                 startChildWorkflowExecutionParameters.setLambdaRole(lambdaRole);
             }
