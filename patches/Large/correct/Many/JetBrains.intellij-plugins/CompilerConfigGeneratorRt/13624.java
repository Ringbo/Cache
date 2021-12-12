diff --git a/flex/flex-shared/src/com/intellij/flex/build/CompilerConfigGeneratorRt.java b/flex/flex-shared/src/com/intellij/flex/build/CompilerConfigGeneratorRt.java
index deda677..4b86bbd 100644
--- a/flex/flex-shared/src/com/intellij/flex/build/CompilerConfigGeneratorRt.java
+++ b/flex/flex-shared/src/com/intellij/flex/build/CompilerConfigGeneratorRt.java
@@ -820,7 +820,7 @@
       }
     }
 
-    if (noClasses.get() && !Utils.IS_TEST_MODE) {
+    if (noClasses.get() && myBC.getCompilerOptions().getFilesToIncludeInSWC().isEmpty() && !Utils.IS_TEST_MODE) {
       throw new IOException(FlexCommonBundle.message("nothing.to.compile.in.library", myModule.getName(), myBC.getName()));
     }
   }
