diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/DefaultGenerator.java b/jOOQ-codegen/src/main/java/org/jooq/util/DefaultGenerator.java
index bb7c3da..21f1b0e 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/DefaultGenerator.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/DefaultGenerator.java
@@ -2239,7 +2239,7 @@
                 out.print("Value");
             }
             out.print("(");
-            out.print(strategy.getJavaIdentifier(parameter));
+            out.print(strategy.getFullJavaIdentifier(parameter));
             out.println(", value);");
             out.println("\t}");
 
