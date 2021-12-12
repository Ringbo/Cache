diff --git a/source/com/intellij/openapi/progress/util/ProgressWindow.java b/source/com/intellij/openapi/progress/util/ProgressWindow.java
index dadf046..f0a9648 100644
--- a/source/com/intellij/openapi/progress/util/ProgressWindow.java
+++ b/source/com/intellij/openapi/progress/util/ProgressWindow.java
@@ -104,7 +104,7 @@
               }
             }
           }
-        }, 0, getModalityState());
+        }, 300, getModalityState());
       }
     });
   }
