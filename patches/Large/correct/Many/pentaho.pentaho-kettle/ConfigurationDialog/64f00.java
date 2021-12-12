diff --git a/ui/src/org/pentaho/di/ui/core/dialog/ConfigurationDialog.java b/ui/src/org/pentaho/di/ui/core/dialog/ConfigurationDialog.java
index d691cda..0f99314 100644
--- a/ui/src/org/pentaho/di/ui/core/dialog/ConfigurationDialog.java
+++ b/ui/src/org/pentaho/di/ui/core/dialog/ConfigurationDialog.java
@@ -330,7 +330,7 @@
     fdVariables.top = new FormAttachment( 0, 10 );
     fdVariables.left = new FormAttachment( 0, 10 );
     fdVariables.bottom = new FormAttachment( 0, 221 );
-    fdVariables.right = new FormAttachment( 0, 601 );
+    fdVariables.right = new FormAttachment( 100, -10 );
 
     wVariables.setLayoutData( fdVariables );
   }
@@ -432,7 +432,7 @@
       shell.setSize( 653, 671 );
     }
     if ( Const.isLinux() ) {
-      shell.setSize( 653, 678 );
+      shell.setSize( 740, 678 );
     }
     if ( Const.isOSX() ) {
       shell.setSize( 653, 678 );
