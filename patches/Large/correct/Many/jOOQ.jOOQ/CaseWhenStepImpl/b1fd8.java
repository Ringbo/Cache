diff --git a/jOOQ/src/main/java/org/jooq/impl/CaseWhenStepImpl.java b/jOOQ/src/main/java/org/jooq/impl/CaseWhenStepImpl.java
index 7ad3a06..69de2c8 100644
--- a/jOOQ/src/main/java/org/jooq/impl/CaseWhenStepImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/CaseWhenStepImpl.java
@@ -161,7 +161,7 @@
 
                 for (int i = 0; i < size; i++) {
                     if (i > 0) {
-                        context.formatSeparator();
+                        context.formatNewLine();
                     }
 
                     context.keyword(" when ");
@@ -180,7 +180,7 @@
 
                 for (int i = 0; i < size; i++) {
                     if (i > 0) {
-                        context.formatSeparator();
+                        context.formatNewLine();
                     }
 
                     context.keyword(" when ");
@@ -194,7 +194,7 @@
         }
 
         if (otherwise != null) {
-            context.formatSeparator()
+            context.formatNewLine()
                    .keyword(" else ")
                    .sql(otherwise);
         }
