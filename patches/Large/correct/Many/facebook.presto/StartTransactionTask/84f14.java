diff --git a/presto-main/src/main/java/com/facebook/presto/execution/StartTransactionTask.java b/presto-main/src/main/java/com/facebook/presto/execution/StartTransactionTask.java
index 08aa38e..f78f430 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/StartTransactionTask.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/StartTransactionTask.java
@@ -110,7 +110,7 @@
                 return IsolationLevel.REPEATABLE_READ;
             case READ_COMMITTED:
                 return IsolationLevel.READ_COMMITTED;
-            case READ_UNCOMMITED:
+            case READ_UNCOMMITTED:
                 return IsolationLevel.READ_UNCOMMITTED;
             default:
                 throw new AssertionError("Unhandled isolation level: " + level);
