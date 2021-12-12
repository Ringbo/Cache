diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/SQLParser.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/SQLParser.java
index b595715..adc2339 100755
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/SQLParser.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/parsing/parser/SQLParser.java
@@ -291,7 +291,7 @@
             } else {
                 parseOtherCondition(sqlStatement);
             }
-        } else if (equalAny(DefaultKeyword.LIKE)) {
+        } else if (equalAny(Symbol.LT_GT, DefaultKeyword.LIKE)) {
             parseOtherCondition(sqlStatement);
         }
         skipIfEqual(Symbol.RIGHT_PAREN);
