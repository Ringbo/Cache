diff --git a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
index 8d025aa..c18ddae 100755
--- a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/adapter/DefaultJDBCAdapter.java
@@ -296,7 +296,7 @@
 
     public void doRemoveMessage(TransactionContext c, long seq) throws SQLException, IOException {
 
-        PreparedStatement s = c.getAddMessageStatement();
+        PreparedStatement s = c.getRemovedMessageStatement();
         try {
             if( s == null ) {
                 s = c.getConnection().prepareStatement(statements.getRemoveMessageStatment());
