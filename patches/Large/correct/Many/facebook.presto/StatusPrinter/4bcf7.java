diff --git a/presto-main/src/main/java/com/facebook/presto/cli/StatusPrinter.java b/presto-main/src/main/java/com/facebook/presto/cli/StatusPrinter.java
index bbc113e..a58e9fa 100644
--- a/presto-main/src/main/java/com/facebook/presto/cli/StatusPrinter.java
+++ b/presto-main/src/main/java/com/facebook/presto/cli/StatusPrinter.java
@@ -185,7 +185,7 @@
             String splitsSummary = String.format("Splits: %,4d total, %,4d pending, %,4d running, %,4d done",
                     globalExecutionStats.getSplits(),
                     max(0, globalExecutionStats.getSplits() - globalExecutionStats.getStartedSplits()),
-                    max(0, globalExecutionStats.getSplits() - globalExecutionStats.getCompletedSplits()),
+                    max(0, globalExecutionStats.getStartedSplits() - globalExecutionStats.getCompletedSplits()),
                     globalExecutionStats.getCompletedSplits());
             reprintLine(splitsSummary);
 
@@ -243,7 +243,7 @@
                     formatDataRate(globalExecutionStats.getOutputDataSize(), elapsedTime, false),
 
                     max(0, globalExecutionStats.getSplits() - globalExecutionStats.getStartedSplits()),
-                    max(0, globalExecutionStats.getSplits() - globalExecutionStats.getCompletedSplits()),
+                    max(0, globalExecutionStats.getStartedSplits() - globalExecutionStats.getCompletedSplits()),
                     globalExecutionStats.getCompletedSplits());
             reprintLine(querySummary);
         }
@@ -282,7 +282,7 @@
                 formatDataRate(executionStats.getCompletedDataSize(), elapsedTime, false),
 
                 max(0, executionStats.getSplits() - executionStats.getStartedSplits()),
-                max(0, executionStats.getSplits() - executionStats.getCompletedSplits()),
+                max(0, executionStats.getStartedSplits() - executionStats.getCompletedSplits()),
                 executionStats.getCompletedSplits());
         reprintLine(stageSummary);
 
