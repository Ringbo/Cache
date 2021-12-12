diff --git a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/tsdb/MemoryTableMeta.java b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/tsdb/MemoryTableMeta.java
index dcd490f..0a0f631 100644
--- a/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/tsdb/MemoryTableMeta.java
+++ b/parse/src/main/java/com/alibaba/otter/canal/parse/inbound/mysql/tsdb/MemoryTableMeta.java
@@ -74,7 +74,11 @@
             try {
                 // druid暂时flush privileges语法解析有问题
                 if (!StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "flush")
-                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "grant")) {
+                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "grant")
+                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "create user")
+                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "drop user")
+                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "create database")
+                    && !StringUtils.startsWithIgnoreCase(StringUtils.trim(ddl), "drop database")) {
                     repository.console(ddl);
                 }
             } catch (Throwable e) {
