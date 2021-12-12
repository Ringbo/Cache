diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/quotas/QuotaCache.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/quotas/QuotaCache.java
index ad91617..d0e3f90 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/quotas/QuotaCache.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/quotas/QuotaCache.java
@@ -190,11 +190,11 @@
       // Prefetch online tables/namespaces
       for (TableName table: QuotaCache.this.rsServices.getOnlineTables()) {
         if (table.isSystemTable()) continue;
-        if (!QuotaCache.this.tableQuotaCache.contains(table)) {
+        if (!QuotaCache.this.tableQuotaCache.containsKey(table)) {
           QuotaCache.this.tableQuotaCache.putIfAbsent(table, new QuotaState());
         }
         String ns = table.getNamespaceAsString();
-        if (!QuotaCache.this.namespaceQuotaCache.contains(ns)) {
+        if (!QuotaCache.this.namespaceQuotaCache.containsKey(ns)) {
           QuotaCache.this.namespaceQuotaCache.putIfAbsent(ns, new QuotaState());
         }
       }
