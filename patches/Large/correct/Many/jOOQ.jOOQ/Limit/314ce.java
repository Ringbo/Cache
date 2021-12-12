diff --git a/jOOQ/src/main/java/org/jooq/impl/Limit.java b/jOOQ/src/main/java/org/jooq/impl/Limit.java
index 1c4a45e..7204ba3 100644
--- a/jOOQ/src/main/java/org/jooq/impl/Limit.java
+++ b/jOOQ/src/main/java/org/jooq/impl/Limit.java
@@ -160,7 +160,7 @@
                        .formatSeparator()
                        .keyword("limit")
                        .sql(' ').visit(offsetOrZero)
-                       .sql(", ").visit(numberOfRows)
+                       .sql(", ").visit(numberOfRowsOrMax)
                        .castMode(castMode);
 
                 break;
@@ -214,7 +214,7 @@
                        xxxxxxxxxxxxxxxxxx
                        xxxxxx xxxxxxxxxxxxxxxxxxxxxx
                        xxxxxx xxxxxxxxxxxxxxxxx xxxxxxx
-                       xxxxxx xxxxxxxxxxxxxxxxxxxxxx
+                       xxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxx
                        xxxxxx xxxxxxxxxxxxxxxx xxxxxx
                        xxxxxxxxxxxxxxxxxxxxxx
 
@@ -232,7 +232,7 @@
                            xxxxxx xxx
 
                 xxxxxxxxxxxxxxxxxxxxxxxx
-                       xxxxxx xxxxxxxxxxxxxxxxxxxxxx
+                       xxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxxxxxx
 
                 xxxxxx
@@ -243,7 +243,7 @@
             xxxx xxxxxxx x
                 xxxxxxxxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxx
-                       xxxxxx xxxxxxxxxxxxxxxxxxxxxxx
+                       xxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxxx
 
                 xx xxxxxxxxxxxxxxx
                     xxxxxxxxxxxxx xxxxxxxxxxxxxxxxx xxxx
@@ -268,7 +268,7 @@
                 xxxxxxxxxxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxxxxx
                        xxxxxxxxxxxxxxx xxxxxxx
-                       xxxxxx xxxxxxxxxxxxxxxxxxxxxx
+                       xxxxxx xxxxxxxxxxxxxxxxxxxxxxxxxxx
                        xxxxxx xxxxxxxxxxxxxxxx xxxxxx
                        xxxxxxxxxxxxxxxxxxxxxx
 
