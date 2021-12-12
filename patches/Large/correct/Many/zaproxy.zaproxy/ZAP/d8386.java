diff --git a/src/org/zaproxy/zap/ZAP.java b/src/org/zaproxy/zap/ZAP.java
index 76503e2..5d55ee6 100644
--- a/src/org/zaproxy/zap/ZAP.java
+++ b/src/org/zaproxy/zap/ZAP.java
@@ -437,16 +437,19 @@
                     Constant.messages.getString(
                             "start.gui.cmdline.invalid.session.options",
                             CommandLine.SESSION,
-                            CommandLine.NEW_SESSION));
+                            CommandLine.NEW_SESSION,
+                            Constant.getZapHome()));
         } else if (cmdLine.isEnabled(CommandLine.SESSION)) {
             Path sessionPath = SessionUtils.getSessionPath(cmdLine.getArgument(CommandLine.SESSION));
             if (!sessionPath.isAbsolute()) {
                 View.getSingleton().showWarningDialog(
-                        Constant.messages.getString("start.gui.cmdline.session.absolute.path.required"));
+                        Constant.messages.getString("start.gui.cmdline.session.absolute.path.required",
+                        		Constant.getZapHome()));
             } else {
                 if (!Files.exists(sessionPath)) {
                     View.getSingleton().showWarningDialog(
-                            Constant.messages.getString("start.gui.cmdline.session.does.not.exist"));
+                            Constant.messages.getString("start.gui.cmdline.session.does.not.exist",
+                            		Constant.getZapHome()));
                 } else {
                     createNewSession = !control.getMenuFileControl().openSession(sessionPath.toAbsolutePath().toString());
                 }
@@ -455,11 +458,13 @@
             Path sessionPath = SessionUtils.getSessionPath(cmdLine.getArgument(CommandLine.NEW_SESSION));
             if (!sessionPath.isAbsolute()) {
                 View.getSingleton().showWarningDialog(
-                        Constant.messages.getString("start.gui.cmdline.session.absolute.path.required"));
+                        Constant.messages.getString("start.gui.cmdline.session.absolute.path.required",
+                        		Constant.getZapHome()));
             } else {
                 if (Files.exists(sessionPath)) {
                     View.getSingleton().showWarningDialog(
-                            Constant.messages.getString("start.gui.cmdline.newsession.already.exist"));
+                            Constant.messages.getString("start.gui.cmdline.newsession.already.exist",
+                            		Constant.getZapHome()));
                 } else {
                     createNewSession = !control.getMenuFileControl().newSession(sessionPath.toAbsolutePath().toString());
                 }
