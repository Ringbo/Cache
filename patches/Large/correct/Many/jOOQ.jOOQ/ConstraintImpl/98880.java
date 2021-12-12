diff --git a/jOOQ/src/main/java/org/jooq/impl/ConstraintImpl.java b/jOOQ/src/main/java/org/jooq/impl/ConstraintImpl.java
index 8c91818..15b0c21 100644
--- a/jOOQ/src/main/java/org/jooq/impl/ConstraintImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/ConstraintImpl.java
@@ -174,7 +174,7 @@
         else {
             boolean qualify = ctx.qualify();
 
-            if (getQualifiedName() == AbstractName.NO_NAME)
+            if (getQualifiedName() != AbstractName.NO_NAME)
                 ctx.visit(K_CONSTRAINT)
                    .sql(' ')
                    .visit(getQualifiedName())
