diff --git a/openapi/src/com/intellij/ide/startup/FileSystemSynchronizer.java b/openapi/src/com/intellij/ide/startup/FileSystemSynchronizer.java
index aec4251..b8d427a 100644
--- a/openapi/src/com/intellij/ide/startup/FileSystemSynchronizer.java
+++ b/openapi/src/com/intellij/ide/startup/FileSystemSynchronizer.java
@@ -97,7 +97,7 @@
       catch (ProcessCanceledException e) {
         throw e;
       }
-      catch (Exception e) {
+      catch (Throwable e) {
         LOG.error(e);
         myUpdateSets[i] = new ArrayList();
       }
@@ -177,7 +177,7 @@
           catch (ProcessCanceledException e) {
             throw e;
           }
-          catch (Exception e) {
+          catch (Throwable e) {
             LOG.error(e);
           }
           if (myUpdateSets[i].isEmpty()) {
@@ -187,7 +187,7 @@
             catch (ProcessCanceledException e) {
               throw e;
             }
-            catch (Exception e) {
+            catch (Throwable e) {
               LOG.error(e);
             }
             myUpdaters.set(i, null);
