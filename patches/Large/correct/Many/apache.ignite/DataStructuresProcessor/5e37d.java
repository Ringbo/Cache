diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
index 57d3d6e..2149ff1 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastructures/DataStructuresProcessor.java
@@ -677,7 +677,7 @@
                                 break;
                             }
                             catch (IgniteCheckedException e) {
-                                if (X.hasCause(e, InterruptedException.class))
+                                if (X.hasCause(e, IgniteInterruptedCheckedException.class, InterruptedException.class))
                                     isInterrupted = Thread.interrupted();
                                 else
                                     throw e;
