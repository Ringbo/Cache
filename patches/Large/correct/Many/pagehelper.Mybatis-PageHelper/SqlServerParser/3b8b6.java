diff --git a/src/main/java/com/github/pagehelper/parser/SqlServerParser.java b/src/main/java/com/github/pagehelper/parser/SqlServerParser.java
index f36ba91..3abe586 100644
--- a/src/main/java/com/github/pagehelper/parser/SqlServerParser.java
+++ b/src/main/java/com/github/pagehelper/parser/SqlServerParser.java
@@ -102,7 +102,7 @@
         try {
             stmt = CCJSqlParserUtil.parse(sql);
         } catch (Throwable e) {
-            throw new PageException("不支持该SQL转换为分页查询!");
+            throw new PageException("不支持该SQL转换为分页查询!", e);
         }
         if (!(stmt instanceof Select)) {
             throw new PageException("分页语句必须是Select查询!");
