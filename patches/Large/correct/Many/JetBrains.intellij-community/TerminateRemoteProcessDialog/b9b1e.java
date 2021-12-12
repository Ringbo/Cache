diff --git a/platform/lang-impl/src/com/intellij/execution/TerminateRemoteProcessDialog.java b/platform/lang-impl/src/com/intellij/execution/TerminateRemoteProcessDialog.java
index 58bb014..997e7ba 100644
--- a/platform/lang-impl/src/com/intellij/execution/TerminateRemoteProcessDialog.java
+++ b/platform/lang-impl/src/com/intellij/execution/TerminateRemoteProcessDialog.java
@@ -53,7 +53,7 @@
 
     @Override
     public boolean isToBeShown() {
-      return myAlwaysUseDefault ? !myDetachIsDefault : myDontTerminate;
+      return myAlwaysUseDefault ? myDetachIsDefault : myDontTerminate;
     }
 
     @Override
