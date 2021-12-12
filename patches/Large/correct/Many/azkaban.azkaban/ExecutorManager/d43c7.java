diff --git a/azkaban-common/src/main/java/azkaban/executor/ExecutorManager.java b/azkaban-common/src/main/java/azkaban/executor/ExecutorManager.java
index 8f2976f..f9f91a2 100644
--- a/azkaban-common/src/main/java/azkaban/executor/ExecutorManager.java
+++ b/azkaban-common/src/main/java/azkaban/executor/ExecutorManager.java
@@ -1674,7 +1674,7 @@
             }
           }
         } catch (final Exception e) {
-          logger.error(e);
+          logger.error("Unexpected exception in updating executions", e);
         }
       }
     }
