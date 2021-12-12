diff --git a/core/src/main/java/org/apache/calcite/adapter/jdbc/JdbcRules.java b/core/src/main/java/org/apache/calcite/adapter/jdbc/JdbcRules.java
index dd0c461..a3dbd74 100644
--- a/core/src/main/java/org/apache/calcite/adapter/jdbc/JdbcRules.java
+++ b/core/src/main/java/org/apache/calcite/adapter/jdbc/JdbcRules.java
@@ -382,7 +382,7 @@
             public boolean test(@Nullable Project project) {
               assert project != null;
               return out.dialect.supportsWindowFunctions()
-                  && !RexOver.containsOver(project.getProjects(), null);
+                  || !RexOver.containsOver(project.getProjects(), null);
             }
           },
           Convention.NONE, out, relBuilderFactory, "JdbcProjectRule");
