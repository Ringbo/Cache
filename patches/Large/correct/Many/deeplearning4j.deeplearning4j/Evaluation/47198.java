diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/eval/Evaluation.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/eval/Evaluation.java
index 6c4f742..50c80fb 100755
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/eval/Evaluation.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/eval/Evaluation.java
@@ -524,8 +524,8 @@
                 int count = confusion().getCount(clazz, clazz2);
                 if (count != 0) {
                     expected = resolveLabelForClass(clazz2);
-                    builder.append(String.format("Examples labeled as %s classified by model as %s: %d times%n", actual,
-                                    expected, count));
+                    builder.append(String.format("Examples labeled as %s classified by model as %s: %d times%n",
+                            expected, actual, count));
                 }
             }
 
