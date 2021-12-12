diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/WhereClauseParser.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/WhereClauseParser.java
index 82cdfb1..d28c05b 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/WhereClauseParser.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/clause/WhereClauseParser.java
@@ -95,7 +95,7 @@
             } else {
                 parseOtherCondition(sqlStatement);
             }
-        } else if (lexerEngine.equalAny(Symbol.LT_GT, DefaultKeyword.LIKE)) {
+        } else if (lexerEngine.equalAny(Symbol.LT_GT, Symbol.BANG_EQ, Symbol.BANG_GT, Symbol.BANG_LT, DefaultKeyword.LIKE)) {
             parseOtherCondition(sqlStatement);
         }
         lexerEngine.skipIfEqual(Symbol.RIGHT_PAREN);
