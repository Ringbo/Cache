diff --git a/core-common/src/main/java/org/apache/kylin/common/util/CliCommandExecutor.java b/core-common/src/main/java/org/apache/kylin/common/util/CliCommandExecutor.java
index 5fef77b..6b8cf76 100644
--- a/core-common/src/main/java/org/apache/kylin/common/util/CliCommandExecutor.java
+++ b/core-common/src/main/java/org/apache/kylin/common/util/CliCommandExecutor.java
@@ -151,7 +151,7 @@
             } catch (InterruptedException e) {
                 // do nothing
             }
-            return Pair.newPair(0, "Killed");
+            return Pair.newPair(1, "Killed");
         }
 
         try {
