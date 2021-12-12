diff --git a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
index 6337114..163ce22 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/types/expressions/BasicExpressionTypingVisitor.java
@@ -501,7 +501,7 @@
             checker.check(resolvedCall, resolutionContext);
         }
 
-        components.symbolUsageValidator.validateCall(descriptor, trace, expression);
+        components.symbolUsageValidator.validateCall(resolvedCall, descriptor, trace, expression);
     }
 
     private static boolean isDeclaredInClass(ReceiverParameterDescriptor receiver) {
@@ -943,7 +943,7 @@
                 result = false;
             } else {
                 if (setter != null) {
-                    components.symbolUsageValidator.validateCall(setter, trace, reportOn);
+                    components.symbolUsageValidator.validateCall(null, setter, trace, reportOn);
                 }
             }
         }
