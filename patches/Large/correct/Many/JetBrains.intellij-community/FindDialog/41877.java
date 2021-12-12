diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
index 81cd035..a8e9f0f 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindDialog.java
@@ -360,7 +360,7 @@
             navigateToSelectedUsage(myResultsPreviewTable);
           }
         }
-      }.registerCustomShortcutSet(CommonShortcuts.getEditSource(), comboBox);
+      }.registerCustomShortcutSet(CommonShortcuts.getEditSource(), comboBox, myDisposable);
     }
   }
 
