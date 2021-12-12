diff --git a/jOOQ/src/main/java/org/jooq/impl/ParserImpl.java b/jOOQ/src/main/java/org/jooq/impl/ParserImpl.java
index e5572c7..f407626 100644
--- a/jOOQ/src/main/java/org/jooq/impl/ParserImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/ParserImpl.java
@@ -4577,7 +4577,8 @@
                     return SQLDataType.DATE;
                 else if (parseKeywordIf(ctx, "DECIMAL"))
                     return parseDataTypePrecisionScale(ctx, SQLDataType.DECIMAL);
-                else if (parseKeywordIf(ctx, "DOUBLE"))
+                else if (parseKeywordIf(ctx, "DOUBLE PRECISION") ||
+                         parseKeywordIf(ctx, "DOUBLE"))
                     return SQLDataType.DOUBLE;
                 else
                     throw ctx.unexpectedToken();
