diff --git a/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java b/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
index 99659e5..95d4180 100644
--- a/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
+++ b/java/compiler/impl/src/com/intellij/compiler/server/BuildManager.java
@@ -431,7 +431,7 @@
           }
         }
         else {
-          scheduleTask(alarm, taskLatch, this);
+          scheduleTask(alarm, taskLatch, task);
         }
       }
     }, delay);
