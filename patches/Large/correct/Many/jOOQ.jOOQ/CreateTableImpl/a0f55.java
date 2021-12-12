diff --git a/jOOQ/src/main/java/org/jooq/impl/CreateTableImpl.java b/jOOQ/src/main/java/org/jooq/impl/CreateTableImpl.java
index 3b48c93..2a7278b 100644
--- a/jOOQ/src/main/java/org/jooq/impl/CreateTableImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/CreateTableImpl.java
@@ -253,7 +253,9 @@
                    .sql(' ');
                 Tools.toSQLDDLTypeDeclaration(ctx, type);
 
-                if (asList().contains(ctx.family()))
+                // [#5356] Some dialects require the DEFAULT clause prior to the
+                //         NULL constraints clause
+                if (asList(HSQLDB).contains(ctx.family()))
                     acceptDefault(ctx, type);
 
                 if (type.nullable()) {
@@ -266,7 +268,7 @@
                     ctx.sql(' ').keyword("not null");
                 }
 
-                if (!asList().contains(ctx.family()))
+                if (!asList(HSQLDB).contains(ctx.family()))
                     acceptDefault(ctx, type);
 
                 if (i < columnFields.size() - 1)
