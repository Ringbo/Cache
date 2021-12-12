diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
index 223c082..2c9e513 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
@@ -867,7 +867,7 @@
 
                     return true;
                 }
-            }, EVT_NODE_LEFT);
+            }, EVT_NODE_LEFT, EVT_NODE_FAILED);
         }
 
         g.events().remoteListen(
