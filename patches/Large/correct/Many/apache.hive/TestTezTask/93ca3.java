diff --git a/ql/src/test/org/apache/hadoop/hive/ql/exec/tez/TestTezTask.java b/ql/src/test/org/apache/hadoop/hive/ql/exec/tez/TestTezTask.java
index 1af92cf..3d55a7c 100644
--- a/ql/src/test/org/apache/hadoop/hive/ql/exec/tez/TestTezTask.java
+++ b/ql/src/test/org/apache/hadoop/hive/ql/exec/tez/TestTezTask.java
@@ -203,7 +203,7 @@
     task.submit(conf, dag, path, appLr, sessionState);
     // validate close/reopen
     verify(sessionState, times(1)).open(any(HiveConf.class));
-    verify(sessionState, times(1)).close(eq(true));
+    verify(sessionState, times(1)).close(eq(false));  // now uses pool after HIVE-7043
     verify(session, times(2)).submitDAG(any(DAG.class));
   }
 
