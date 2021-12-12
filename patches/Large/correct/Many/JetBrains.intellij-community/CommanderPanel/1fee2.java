diff --git a/source/com/intellij/ide/commander/CommanderPanel.java b/source/com/intellij/ide/commander/CommanderPanel.java
index 4c006b8..1aecfde 100644
--- a/source/com/intellij/ide/commander/CommanderPanel.java
+++ b/source/com/intellij/ide/commander/CommanderPanel.java
@@ -183,7 +183,7 @@
     }
   }
 
-  final JList getList() {
+  public final JList getList() {
     return myList;
   }
 
