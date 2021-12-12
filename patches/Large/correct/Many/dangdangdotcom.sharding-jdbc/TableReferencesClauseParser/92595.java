diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/TableReferencesClauseParser.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/TableReferencesClauseParser.java
index 5c834b4..d3499fd 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/TableReferencesClauseParser.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/TableReferencesClauseParser.java
@@ -64,7 +64,8 @@
         }
         String tableName = SQLUtil.getExactlyValue(literals);
         Optional<String> alias = aliasClauseParser.parse();
-        if (isSingleTableOnly || shardingRule.tryFindTableRule(tableName).isPresent() || shardingRule.findBindingTableRule(tableName).isPresent()) {
+        if (isSingleTableOnly || shardingRule.tryFindTableRule(tableName).isPresent() || shardingRule.findBindingTableRule(tableName).isPresent()
+                || shardingRule.getDataSourceRule().getDefaultDataSource().isPresent()) {
             sqlStatement.getSqlTokens().add(new TableToken(beginPosition, literals));
             sqlStatement.getTables().add(new Table(tableName, alias));
         }
