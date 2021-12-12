diff --git a/plugins-management/src/com/intellij/ide/plugins/PluginManagerMain.java b/plugins-management/src/com/intellij/ide/plugins/PluginManagerMain.java
index e676a9d..aee15f1 100644
--- a/plugins-management/src/com/intellij/ide/plugins/PluginManagerMain.java
+++ b/plugins-management/src/com/intellij/ide/plugins/PluginManagerMain.java
@@ -247,8 +247,7 @@
           list = RepositoryHelper.Process(mySynchStatus);
         }
         catch (Exception e) {
-          Messages
-            .showErrorDialog(getMainPanel(), IdeBundle.message("error.list.of.plugins.was.not.loaded"), IdeBundle.message("title.plugins"));
+          Messages.showErrorDialog(IdeBundle.message("error.list.of.plugins.was.not.loaded"), IdeBundle.message("title.plugins"));
         }
         return list;
       }
