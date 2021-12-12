diff --git a/astrid/plugin-src/com/todoroo/astrid/gtasks/sync/GtasksSyncV2Provider.java b/astrid/plugin-src/com/todoroo/astrid/gtasks/sync/GtasksSyncV2Provider.java
index 5d1f288..309a6e6 100644
--- a/astrid/plugin-src/com/todoroo/astrid/gtasks/sync/GtasksSyncV2Provider.java
+++ b/astrid/plugin-src/com/todoroo/astrid/gtasks/sync/GtasksSyncV2Provider.java
@@ -115,7 +115,7 @@
                 } catch (GoogleTasksException e) {
                     handler.handleException("gtasks-sync=io", e, e.getType()); //$NON-NLS-1$
                 } catch (IOException e) {
-                    handler.handleException("gtasks-sync=io", e, e.getMessage()); //$NON-NLS-1$
+                    handler.handleException("gtasks-sync=io", e, e.toString()); //$NON-NLS-1$
                 }
 
                 StoreObject[] lists = gtasksListService.getLists();
@@ -158,7 +158,7 @@
                 } catch (GoogleTasksException e) {
                     handler.handleException("gtasks-sync-io", e, e.getType()); //$NON-NLS-1$
                 } catch (IOException e) {
-                    handler.handleException("gtasks-sync-io", e, e.getMessage()); //$NON-NLS-1$
+                    handler.handleException("gtasks-sync-io", e, e.toString()); //$NON-NLS-1$
                 } finally {
                     callback.incrementProgress(10);
                 }
@@ -262,7 +262,7 @@
                 errorHandler.handleException("gtasks-sync-io", e, e.getType()); //$NON-NLS-1$
         } catch (IOException e) {
             if (errorHandler != null)
-                errorHandler.handleException("gtasks-sync-io", e, e.getMessage()); //$NON-NLS-1$
+                errorHandler.handleException("gtasks-sync-io", e, e.toString()); //$NON-NLS-1$
         }
     }
 
