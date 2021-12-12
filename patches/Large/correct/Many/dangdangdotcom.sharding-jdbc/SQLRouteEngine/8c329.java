diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/router/SQLRouteEngine.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/router/SQLRouteEngine.java
index 6aa9ec2..a108151 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/router/SQLRouteEngine.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/router/SQLRouteEngine.java
@@ -97,7 +97,7 @@
     
     private SQLParsedResult buildHintParsedResult(final String logicSql) {
         SQLParsedResult result = new SQLParsedResult(SQLUtil.getTypeByStart(logicSql), new ConditionContext());
-        log.trace("Get {} SQL Statement", result.getSqlType());
+        log.trace("Get {} SQL Statement", result.getType());
         SQLBuilder sqlBuilder = new SQLBuilder();
         sqlBuilder.append(logicSql);
         result.setSqlBuilder(sqlBuilder);
@@ -120,7 +120,7 @@
     
     private RoutingResult routeSQL(final ConditionContext conditionContext, final SQLParsedResult parsedResult) {
         if (HintManagerHolder.isDatabaseShardingOnly()) {
-            return new DatabaseRouter(shardingRule.getDataSourceRule(), shardingRule.getDatabaseShardingStrategy(), parsedResult.getSqlType()).route();
+            return new DatabaseRouter(shardingRule.getDataSourceRule(), shardingRule.getDatabaseShardingStrategy(), parsedResult.getType()).route();
         }
         Set<String> logicTables = Sets.newLinkedHashSet(Collections2.transform(parsedResult.getTables(), new Function<TableContext, String>() {
             
@@ -130,13 +130,13 @@
             }
         }));
         if (1 == logicTables.size()) {
-            return new SingleTableRouter(shardingRule, logicTables.iterator().next(), conditionContext, parsedResult.getSqlType()).route();
+            return new SingleTableRouter(shardingRule, logicTables.iterator().next(), conditionContext, parsedResult.getType()).route();
         } 
         if (shardingRule.isAllBindingTables(logicTables)) {
-            return new BindingTablesRouter(shardingRule, logicTables, conditionContext, parsedResult.getSqlType()).route();
+            return new BindingTablesRouter(shardingRule, logicTables, conditionContext, parsedResult.getType()).route();
         } 
         // TODO 可配置是否执行笛卡尔积
-        return new MixedTablesRouter(shardingRule, logicTables, conditionContext, parsedResult.getSqlType()).route();
+        return new MixedTablesRouter(shardingRule, logicTables, conditionContext, parsedResult.getType()).route();
     }
     
     private void amendSQLAccordingToRouteResult(final SQLParsedResult parsedResult, final List<Object> parameters, final SQLRouteResult sqlRouteResult) {
