diff --git a/refactoring/impl/com/intellij/refactoring/wrapreturnvalue/WrapReturnValueProcessor.java b/refactoring/impl/com/intellij/refactoring/wrapreturnvalue/WrapReturnValueProcessor.java
index bd3aa15..1de9f5e 100644
--- a/refactoring/impl/com/intellij/refactoring/wrapreturnvalue/WrapReturnValueProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/wrapreturnvalue/WrapReturnValueProcessor.java
@@ -272,7 +272,7 @@
       }
     }
     catch (IncorrectOperationException e) {
-      LOG.error(e);
+      LOG.info(e);
       return false;
     }
     return true;
