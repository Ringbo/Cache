diff --git a/src/com/facebook/buck/apple/XctoolRunTestsStep.java b/src/com/facebook/buck/apple/XctoolRunTestsStep.java
index 9bc196d..7059da9 100644
--- a/src/com/facebook/buck/apple/XctoolRunTestsStep.java
+++ b/src/com/facebook/buck/apple/XctoolRunTestsStep.java
@@ -222,7 +222,7 @@
               String.format(
                   "No tests found matching specified filter (%s)",
                   testSelectorList.getExplanation()));
-          return 1;
+          return 0;
         }
         processExecutorParamsBuilder.addAllCommand(xctoolFilterParams);
       } catch (IOException e) {
