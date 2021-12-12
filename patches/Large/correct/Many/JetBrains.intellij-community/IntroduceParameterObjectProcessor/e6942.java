diff --git a/refactoring/impl/com/intellij/refactoring/introduceparameterobject/IntroduceParameterObjectProcessor.java b/refactoring/impl/com/intellij/refactoring/introduceparameterobject/IntroduceParameterObjectProcessor.java
index 45d717d..7c8d36a 100644
--- a/refactoring/impl/com/intellij/refactoring/introduceparameterobject/IntroduceParameterObjectProcessor.java
+++ b/refactoring/impl/com/intellij/refactoring/introduceparameterobject/IntroduceParameterObjectProcessor.java
@@ -303,7 +303,7 @@
       }
     }
     catch (IncorrectOperationException e) {
-      logger.error(e);
+      logger.info(e);
       return false;
     }
     return true;
