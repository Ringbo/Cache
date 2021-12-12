diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
index 5536195..ff79d91 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditor.java
@@ -1582,7 +1582,7 @@
         @Override
         public String getName()
         {
-            String name = lastGoodQuery == null ? null : lastGoodQuery.getQuery();
+            String name = lastGoodQuery == null ? null : lastGoodQuery.getOriginalQuery();
             if (name == null) {
                 name = "SQL";
             }
