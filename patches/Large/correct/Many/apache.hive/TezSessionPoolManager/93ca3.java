diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
index 041639d..0d0ac41 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
@@ -271,7 +271,7 @@
   public void closeAndOpen(TezSessionState sessionState, HiveConf conf)
       throws Exception {
     HiveConf sessionConf = sessionState.getConf();
-    if (sessionConf.get("tez.queue.name") != null) {
+    if (sessionConf != null && sessionConf.get("tez.queue.name") != null) {
       conf.set("tez.queue.name", sessionConf.get("tez.queue.name"));
     }
     close(sessionState);
