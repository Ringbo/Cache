diff --git a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
index 12652e9..9f6f12a 100644
--- a/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
+++ b/platform/platform-impl/src/com/intellij/openapi/updateSettings/impl/PluginDownloader.java
@@ -149,7 +149,7 @@
         }
         String text = IdeBundle.message("error.plugin.was.not.installed", getPluginName(), errorMessage);
         String title = IdeBundle.message("title.failed.to.download");
-        app.invokeLater(() -> Messages.showErrorDialog(text, title));
+        app.invokeLater(() -> Messages.showErrorDialog(text, title), ModalityState.any());
       }
       return false;
     }
