diff --git a/idea/src/org/jetbrains/jet/plugin/internal/KotlinBytecodeToolWindow.java b/idea/src/org/jetbrains/jet/plugin/internal/KotlinBytecodeToolWindow.java
index 88ab69a..2b43c91 100644
--- a/idea/src/org/jetbrains/jet/plugin/internal/KotlinBytecodeToolWindow.java
+++ b/idea/src/org/jetbrains/jet/plugin/internal/KotlinBytecodeToolWindow.java
@@ -115,7 +115,7 @@
                                             exhaust.getModuleDescriptor(), exhaust.getBindingContext(),
                                             Collections.singletonList(jetFile), true, true,
                                             GenerationState.GenerateClassFilter.GENERATE_ALL,
-                                            enableInline.isSelected(), enableOptimization.isEnabled(), null, null,
+                                            enableInline.isSelected(), enableOptimization.isSelected(), null, null,
                                             DiagnosticHolder.DO_NOTHING, null);
                 KotlinCodegenFacade.compileCorrectFiles(state, CompilationErrorHandler.THROW_EXCEPTION);
             }
