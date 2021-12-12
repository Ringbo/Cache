diff --git a/platform/lang-impl/src/com/intellij/platform/templates/TemplateModuleBuilder.java b/platform/lang-impl/src/com/intellij/platform/templates/TemplateModuleBuilder.java
index 6705599..c9bcb06 100644
--- a/platform/lang-impl/src/com/intellij/platform/templates/TemplateModuleBuilder.java
+++ b/platform/lang-impl/src/com/intellij/platform/templates/TemplateModuleBuilder.java
@@ -429,7 +429,7 @@
           }
         }
       }));
-    }, ModalityState.any());
+    }, ModalityState.defaultModalityState());
     return projectRef.get();
   }
 
