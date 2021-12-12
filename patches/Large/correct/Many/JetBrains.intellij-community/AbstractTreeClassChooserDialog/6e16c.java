diff --git a/platform/lang-impl/src/com/intellij/ide/util/AbstractTreeClassChooserDialog.java b/platform/lang-impl/src/com/intellij/ide/util/AbstractTreeClassChooserDialog.java
index ee380a3..f88562b 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/AbstractTreeClassChooserDialog.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/AbstractTreeClassChooserDialog.java
@@ -572,7 +572,7 @@
 
           @Override
           public boolean process(T aClass) {
-            if (System.currentTimeMillis() - start > 500) {
+            if (System.currentTimeMillis() - start > 500 && !ApplicationManager.getApplication().isUnitTestMode()) {
               return false;
             }
             if ((getTreeClassChooserDialog().getFilter().isAccepted(aClass)) && aClass.getName() != null) {
