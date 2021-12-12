diff --git a/src/core/org/apache/jmeter/gui/action/Save.java b/src/core/org/apache/jmeter/gui/action/Save.java
index 2c8dabb..554e1c9 100644
--- a/src/core/org/apache/jmeter/gui/action/Save.java
+++ b/src/core/org/apache/jmeter/gui/action/Save.java
@@ -122,7 +122,7 @@
 
     @Override
     public void doAction(ActionEvent e) throws IllegalUserActionException {
-        HashTree subTree = null;
+        HashTree subTree;
         boolean fullSave = false; // are we saving the whole tree?
         if (!commands.contains(e.getActionCommand())) {
             throw new IllegalUserActionException("Invalid user command:" + e.getActionCommand());
@@ -238,10 +238,10 @@
                     log.warn("Failed to delete backup file " + expiredBackupFile.getName()); //$NON-NLS-1$
                 }
             }
-        } catch(RuntimeException | Error ex) {
+        } catch(RuntimeException ex) {
             throw ex;
         }
-        catch (Throwable ex) {
+        catch (Exception ex) {
             log.error("Error saving tree:", ex);
             throw new IllegalUserActionException("Couldn't save test plan to file: " + updateFile, ex);
         } 
