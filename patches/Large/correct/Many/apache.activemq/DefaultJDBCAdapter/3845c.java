diff --git a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
index 58e047d..af230a8 100755
--- a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
+++ b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
@@ -1035,7 +1035,7 @@
             } else {
                 s = c.getConnection().prepareStatement(this.statements.getFindNextMessagesStatement());
             }
-            s.setMaxRows(Math.max(maxReturned * 2, maxRows));
+            s.setMaxRows(Math.min(maxReturned * 2, maxRows));
             s.setString(1, destination.getQualifiedName());
             s.setLong(2, nextSeq);
             if (isPrioritizedMessages) {
