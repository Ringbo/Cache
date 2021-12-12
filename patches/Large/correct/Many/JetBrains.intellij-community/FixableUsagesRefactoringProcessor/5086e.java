diff --git a/refactoring/impl/com/intellij/refactoring/util/FixableUsagesRefactoringProcessor.java b/refactoring/impl/com/intellij/refactoring/util/FixableUsagesRefactoringProcessor.java
index ddab3c9e..3bd0afb 100644
--- a/refactoring/impl/com/intellij/refactoring/util/FixableUsagesRefactoringProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/util/FixableUsagesRefactoringProcessor.java
@@ -27,7 +27,7 @@
         ((FixableUsageInfo)usageInfo).fixUsage();
       }
       catch (IncorrectOperationException e) {
-        LOG.error(e);
+        LOG.info(e);
       }
     }
   }
