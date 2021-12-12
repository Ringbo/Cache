diff --git a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
index ecac85c..b70dbd8 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/exec/tez/TezSessionPoolManager.java
@@ -314,7 +314,7 @@
         LOG.warn("User has specified " + queueName + " queue; ignoring the setting");
         queueName = null;
         hasQueue = false;
-        conf.set("tez.queue.name", null);
+        conf.unset("tez.queue.name");
       }
       default: // All good.
       }
