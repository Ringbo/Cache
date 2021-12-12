diff --git a/java/compiler/impl/src/com/intellij/compiler/impl/FileProcessingCompilerAdapterTask.java b/java/compiler/impl/src/com/intellij/compiler/impl/FileProcessingCompilerAdapterTask.java
index 514eb3c..fd7d37a 100644
--- a/java/compiler/impl/src/com/intellij/compiler/impl/FileProcessingCompilerAdapterTask.java
+++ b/java/compiler/impl/src/com/intellij/compiler/impl/FileProcessingCompilerAdapterTask.java
@@ -121,7 +121,7 @@
         }
       });
     }
-    catch (IOException e) {
+    catch (Throwable e) {
       context.addMessage(CompilerMessageCategory.ERROR, e.getMessage(), null, -1, -1);
       LOG.info(e);
     }
