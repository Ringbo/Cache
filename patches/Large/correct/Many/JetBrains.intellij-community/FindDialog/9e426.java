diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
index 717ff6c..e453ccf 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
@@ -403,7 +403,7 @@
       setCaretPosition(comboBox, caretPosition);
     }
 
-    if (comboBox == myInputComboBox) scheduleResultsUpdate();
+    if (comboBox != myReplaceComboBox) scheduleResultsUpdate();
     validateFindButton();
   }
 
