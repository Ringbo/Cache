diff --git a/sharding-jdbc-core/src/test/java/com/dangdang/ddframe/rdb/sharding/jdbc/adapter/StatementAdapterTest.java b/sharding-jdbc-core/src/test/java/com/dangdang/ddframe/rdb/sharding/jdbc/adapter/StatementAdapterTest.java
index 06974c0..d0158d3 100644
--- a/sharding-jdbc-core/src/test/java/com/dangdang/ddframe/rdb/sharding/jdbc/adapter/StatementAdapterTest.java
+++ b/sharding-jdbc-core/src/test/java/com/dangdang/ddframe/rdb/sharding/jdbc/adapter/StatementAdapterTest.java
@@ -163,7 +163,7 @@
         for (Map.Entry<DatabaseType, Statement> each : statements.entrySet()) {
             each.getValue().execute(sql);
             if (DatabaseType.Oracle == each.getKey()) {
-                assertThat(each.getValue().getUpdateCount(), is(-10));
+                assertThat(each.getValue().getUpdateCount(), is(-4));
             } else {
                 assertThat(each.getValue().getUpdateCount(), is(4));
             }
@@ -176,7 +176,7 @@
         for (Map.Entry<DatabaseType, Statement> each : statements.entrySet()) {
             each.getValue().execute(sql);
             if (DatabaseType.Oracle == each.getKey()) {
-                assertThat(each.getValue().getUpdateCount(), is(-10));
+                assertThat(each.getValue().getUpdateCount(), is(-4));
             } else {
                 assertThat(each.getValue().getUpdateCount(), is(0));
             }
