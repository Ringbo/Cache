diff --git a/flex/src/com/intellij/lang/javascript/flex/build/CompilerConfigGenerator.java b/flex/src/com/intellij/lang/javascript/flex/build/CompilerConfigGenerator.java
index a269cda..82c9f2a 100644
--- a/flex/src/com/intellij/lang/javascript/flex/build/CompilerConfigGenerator.java
+++ b/flex/src/com/intellij/lang/javascript/flex/build/CompilerConfigGenerator.java
@@ -692,7 +692,9 @@
       });
     }
 
-    if (noClasses.get() && !ApplicationManager.getApplication().isUnitTestMode()) {
+    if (noClasses.get() &&
+        myBC.getCompilerOptions().getFilesToIncludeInSWC().isEmpty() &&
+        !ApplicationManager.getApplication().isUnitTestMode()) {
       throw new IOException(FlexCommonBundle.message("nothing.to.compile.in.library", myModule.getName(), myBC.getName()));
     }
   }
