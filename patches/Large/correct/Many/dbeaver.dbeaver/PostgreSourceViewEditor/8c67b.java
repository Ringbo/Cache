diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/ui/editors/PostgreSourceViewEditor.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/ui/editors/PostgreSourceViewEditor.java
index 59d671c..b9a45c4 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/ui/editors/PostgreSourceViewEditor.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/ui/editors/PostgreSourceViewEditor.java
@@ -55,7 +55,7 @@
     protected boolean isReadOnly()
     {
         PostgreScriptObject sourceObject = getSourceObject();
-        if (sourceObject instanceof PostgreProcedure || sourceObject instanceof PostgreTrigger) {
+        if (sourceObject instanceof PostgreProcedure || sourceObject instanceof PostgreTrigger || sourceObject instanceof PostgreViewBase) {
             return false;
         }
         return true;
