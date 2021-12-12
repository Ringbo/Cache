diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/actions/datasource/DataSourceInvalidateHandler.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/actions/datasource/DataSourceInvalidateHandler.java
index 6390eba..7d8d7f1 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/actions/datasource/DataSourceInvalidateHandler.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/actions/datasource/DataSourceInvalidateHandler.java
@@ -50,7 +50,7 @@
     @Override
     public Object execute(ExecutionEvent event) throws ExecutionException
     {
-        DBCExecutionContext context = getExecutionContext(event, true);
+        DBCExecutionContext context = getExecutionContext(event, false);
         if (context != null) {
             execute(HandlerUtil.getActiveShell(event), context);
         } else {
