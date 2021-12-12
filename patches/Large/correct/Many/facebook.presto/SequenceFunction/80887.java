diff --git a/presto-main/src/main/java/com/facebook/presto/operator/scalar/SequenceFunction.java b/presto-main/src/main/java/com/facebook/presto/operator/scalar/SequenceFunction.java
index 1009fdd..125d09d 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/scalar/SequenceFunction.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/scalar/SequenceFunction.java
@@ -157,9 +157,9 @@
                 INVALID_FUNCTION_ARGUMENT,
                 "step must not be zero");
         checkCondition(
-                step > 0 ? stop >= start : stop < start,
+                step > 0 ? stop >= start : stop <= start,
                 INVALID_FUNCTION_ARGUMENT,
-                "sequence stop value should be greater than or equal to start value if step is greater than zero otherwise stop should be less than start");
+                "sequence stop value should be greater than or equal to start value if step is greater than zero otherwise stop should be less than or equal to start");
     }
 
     private static void checkMaxEntry(int length)
