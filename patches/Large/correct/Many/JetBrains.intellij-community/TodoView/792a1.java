diff --git a/source/com/intellij/ide/todo/TodoView.java b/source/com/intellij/ide/todo/TodoView.java
index 9b9d99e..42f9659 100644
--- a/source/com/intellij/ide/todo/TodoView.java
+++ b/source/com/intellij/ide/todo/TodoView.java
@@ -269,7 +269,7 @@
               );
               thread.start();
             }
-          });
+          }, ModalityState.NON_MMODAL);
     }
   }
 }
\ No newline at end of file
