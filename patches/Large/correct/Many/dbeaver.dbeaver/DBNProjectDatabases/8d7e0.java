diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNProjectDatabases.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNProjectDatabases.java
index 8eb8c65..bad5015 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNProjectDatabases.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNProjectDatabases.java
@@ -305,7 +305,7 @@
                 if (dbmNode != null) {
                     DBNEvent.NodeChange nodeChange;
                     Boolean enabled = event.getEnabled();
-                    Object source = this;
+                    Object source = event;
                     if (event.getAction() == DBPEvent.Action.OBJECT_SELECT) {
                         nodeChange = DBNEvent.NodeChange.REFRESH;
                         if (enabled != null && enabled) {
