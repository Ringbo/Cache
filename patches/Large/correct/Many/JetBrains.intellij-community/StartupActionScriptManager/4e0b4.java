diff --git a/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java b/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
index 91ddc51..2cf8452 100644
--- a/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
+++ b/platform/bootstrap/src/com/intellij/ide/startup/StartupActionScriptManager.java
@@ -78,7 +78,7 @@
         //noinspection unchecked
         return (List<ActionCommand>)ois.readObject();
       }
-      catch (Exception e) {    // ClassNotFoundException / IOException
+      catch (Throwable e) {    // ClassNotFoundException / IOException
         fileCorrupted = true;
         LOG.error("Internal file was corrupted. Problem is fixed.\nIf some plugins has been installed/uninstalled, please re-install/-uninstall them.", e);
         //noinspection InstanceofCatchParameter
@@ -195,8 +195,9 @@
 
     public void execute() throws IOException {
       if (!mySource.exists()) {
-        //noinspection HardCodedStringLiteral
-        LOG.error("Source file " + mySource.getAbsolutePath() + " does not exist for action " + this);
+        // Note, that we can not use LOG at this moment because it throws AssertionError 
+        //noinspection HardCodedStringLiteral,UseOfSystemOutOrSystemErr
+        System.err.println("Source file " + mySource.getAbsolutePath() + " does not exist for action " + this);
       }
       else if (!canCreateFile(myDestination)) {
         JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
@@ -209,7 +210,8 @@
           ZipUtil.extract(mySource, myDestination, myFilenameFilter);
         }
         catch(Exception ex) {
-          LOG.error(ex);
+          //noinspection CallToPrintStackTrace
+          ex.printStackTrace();
           JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                                         MessageFormat.format("<html>Failed to extract ZIP file {0}<br>to<br>{1}<br>You may need to re-download the plugin you tried to install.",
                                                              mySource.getAbsolutePath(), myDestination.getAbsolutePath()),
@@ -234,8 +236,8 @@
 
     public void execute() throws IOException {
       if (mySource != null && mySource.exists() && !FileUtilRt.delete(mySource)) {
-        //noinspection HardCodedStringLiteral
-        LOG.error("Action " + this + " failed.");
+        //noinspection HardCodedStringLiteral,UseOfSystemOutOrSystemErr
+        System.err.println("Action " + this + " failed.");
         JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                                       MessageFormat.format("<html>Cannot delete {0}<br>Please, check your access rights on folder <br>{1}",
                                                            mySource.getAbsolutePath(), mySource.getAbsolutePath()),
