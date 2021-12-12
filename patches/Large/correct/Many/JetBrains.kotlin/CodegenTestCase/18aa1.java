diff --git a/compiler/tests/org/jetbrains/jet/codegen/CodegenTestCase.java b/compiler/tests/org/jetbrains/jet/codegen/CodegenTestCase.java
index 9f42113..3fe994e 100644
--- a/compiler/tests/org/jetbrains/jet/codegen/CodegenTestCase.java
+++ b/compiler/tests/org/jetbrains/jet/codegen/CodegenTestCase.java
@@ -315,9 +315,9 @@
                 DxChecker.check(generationState.getFactory());
             }
 
-        } catch (RuntimeException e) {
+        } catch (Throwable e) {
             System.out.println(generateToText());
-            throw e;
+            throw ExceptionUtils.rethrow(e);
         }
         return generationState;
     }
