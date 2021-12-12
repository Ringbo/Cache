diff --git a/java/java-impl/src/com/intellij/codeInspection/emptyMethod/EmptyMethodInspection.java b/java/java-impl/src/com/intellij/codeInspection/emptyMethod/EmptyMethodInspection.java
index 7fe23b3..2b12206 100644
--- a/java/java-impl/src/com/intellij/codeInspection/emptyMethod/EmptyMethodInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/emptyMethod/EmptyMethodInspection.java
@@ -319,7 +319,7 @@
           public void run() {
             SafeDeleteHandler.invoke(project, PsiUtilCore.toPsiElementArray(psiElements), false);
           }
-        });
+        }, project.getDisposed());
       }
     }
   }
@@ -384,7 +384,7 @@
         public void run() {
           SafeDeleteHandler.invoke(project, PsiUtilCore.toPsiElementArray(psiElementsToIgnore), false, refreshViews);
         }
-      });
+      }, project.getDisposed());
     }
   }
 }
