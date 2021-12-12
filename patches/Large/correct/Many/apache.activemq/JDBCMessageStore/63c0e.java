diff --git a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCMessageStore.java b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCMessageStore.java
index 753b13c..c4c3406 100755
--- a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCMessageStore.java
+++ b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCMessageStore.java
@@ -129,7 +129,7 @@
             c.close();
         }
         if (context != null && context.getXid() != null) {
-            message.getMessageId().setDataLocator(sequenceId);
+            message.getMessageId().setEntryLocator(sequenceId);
         } else {
             onAdd(messageId, sequenceId, message.getPriority());
         }
@@ -204,7 +204,7 @@
             c.close();
         }
         if (context != null && context.getXid() != null) {
-            ack.getLastMessageId().setDataLocator(seq);
+            ack.getLastMessageId().setEntryLocator(seq);
         }
     }
 
