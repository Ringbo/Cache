diff --git a/plugins/org.jkiss.dbeaver.ui.navigator/src/org/jkiss/dbeaver/ui/navigator/actions/NavigatorHandlerObjectBase.java b/plugins/org.jkiss.dbeaver.ui.navigator/src/org/jkiss/dbeaver/ui/navigator/actions/NavigatorHandlerObjectBase.java
index 4e46180..979b8fd 100644
--- a/plugins/org.jkiss.dbeaver.ui.navigator/src/org/jkiss/dbeaver/ui/navigator/actions/NavigatorHandlerObjectBase.java
+++ b/plugins/org.jkiss.dbeaver.ui.navigator/src/org/jkiss/dbeaver/ui/navigator/actions/NavigatorHandlerObjectBase.java
@@ -126,7 +126,7 @@
             // No editor found - create new command context
             DBSObject object = ((DBNDatabaseNode) container).getObject();
             if (object != null) {
-                return new CommandTarget(new SimpleCommandContext(DBUtils.getDefaultContext(object, true), !openEditor));
+                return new CommandTarget(new SimpleCommandContext(DBUtils.getDefaultContext(object, false), !openEditor));
             }
         }
         return new CommandTarget();
