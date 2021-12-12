diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java b/platform/lang-impl/src/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
index 0431d5b..a81c867 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
@@ -642,7 +642,7 @@
               }
             }
             else {
-              toolWrapper.addProblemElement(refEntity, commonProblemDescriptors);
+              toolWrapper.addProblemElement(refEntity, problemDescriptor);
             }
           }
         }
