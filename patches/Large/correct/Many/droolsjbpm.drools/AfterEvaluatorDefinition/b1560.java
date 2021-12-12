diff --git a/drools-core/src/main/java/org/drools/base/evaluators/AfterEvaluatorDefinition.java b/drools-core/src/main/java/org/drools/base/evaluators/AfterEvaluatorDefinition.java
index da677eb..5cb2995 100644
--- a/drools-core/src/main/java/org/drools/base/evaluators/AfterEvaluatorDefinition.java
+++ b/drools-core/src/main/java/org/drools/base/evaluators/AfterEvaluatorDefinition.java
@@ -349,7 +349,7 @@
                     leftTS = ((LongVariableContextEntry) context).left;
                 }
             } else {
-                leftTS = ((EventFactHandle) ((ObjectVariableContextEntry) context).left).getStartTimestamp();
+                leftTS = ((EventFactHandle) ((ObjectVariableContextEntry) context).left).getEndTimestamp();
             }
             long dist = rightTS - leftTS;
 
