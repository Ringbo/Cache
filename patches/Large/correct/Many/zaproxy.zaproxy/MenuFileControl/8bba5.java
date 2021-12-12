diff --git a/src/org/parosproxy/paros/control/MenuFileControl.java b/src/org/parosproxy/paros/control/MenuFileControl.java
index 43c6fc0..1d6d25d 100644
--- a/src/org/parosproxy/paros/control/MenuFileControl.java
+++ b/src/org/parosproxy/paros/control/MenuFileControl.java
@@ -41,6 +41,7 @@
 // ZAP: 2015/01/29 Issue 1489: Version number in window title
 // ZAP: 2015/02/05 Issue 1524: New Persist Session dialog
 // ZAP: 2015/04/02 Issue 321: Support multiple databases
+// ZAP: 2015/12/14 Log exception and internationalise error message
 
 package org.parosproxy.paros.control;
  
@@ -506,9 +507,9 @@
             setTitle();
             //view.getMainFrame().setTitle(file.getName().replaceAll(".session\\z","") + " - " + Constant.PROGRAM_NAME);
         } else {
-            view.showWarningDialog("Error opening session file");
+            view.showWarningDialog(Constant.messages.getString("menu.file.openSession.errorFile"));
             if (file != null) {
-                log.error("Error opening session file " + file.getAbsolutePath());
+                log.error("Error opening session file " + file.getAbsolutePath(), e);
             } else {
             	// File is null for table based sessions (ie non HSQLDB)
                 log.error(e.getMessage(), e);
