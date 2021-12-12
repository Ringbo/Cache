diff --git a/src/main/java/com/alibaba/druid/wall/spi/MySqlWallProvider.java b/src/main/java/com/alibaba/druid/wall/spi/MySqlWallProvider.java
index b2e8724..4d1cc9f 100644
--- a/src/main/java/com/alibaba/druid/wall/spi/MySqlWallProvider.java
+++ b/src/main/java/com/alibaba/druid/wall/spi/MySqlWallProvider.java
@@ -39,7 +39,9 @@
 
     @Override
     public SQLStatementParser createParser(String sql) {
-        return new MySqlStatementParser(sql, SQLParserFeature.EnableSQLBinaryOpExprGroup
+        return new MySqlStatementParser(sql
+                , SQLParserFeature.EnableSQLBinaryOpExprGroup
+                , SQLParserFeature.StrictForWall
         );
     }
 
