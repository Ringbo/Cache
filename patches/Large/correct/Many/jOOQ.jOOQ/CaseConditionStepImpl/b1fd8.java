diff --git a/jOOQ/src/main/java/org/jooq/impl/CaseConditionStepImpl.java b/jOOQ/src/main/java/org/jooq/impl/CaseConditionStepImpl.java
index fa55558..07e0c11 100644
--- a/jOOQ/src/main/java/org/jooq/impl/CaseConditionStepImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/CaseConditionStepImpl.java
@@ -124,7 +124,7 @@
         int size = conditions.size();
         for (int i = 0; i < size; i++) {
             if (i > 0) {
-                context.formatSeparator();
+                context.formatNewLine();
             }
 
             context.keyword(" when ")
@@ -134,7 +134,7 @@
         }
 
         if (otherwise != null) {
-            context.formatSeparator()
+            context.formatNewLine()
                    .keyword(" else ")
                    .sql(otherwise);
         }
