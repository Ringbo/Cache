diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index 8c9ac2c..c7e60c3 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -1306,7 +1306,7 @@
     JMenuItem copyForumItem = newJMenuItemShift(tr("Copy for Forum"), 'C');
     copyForumItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
-          getCurrentTab().handleHTMLCopy();
+          getCurrentTab().handleDiscourseCopy();
         }
       });
     menu.add(copyForumItem);
@@ -1314,7 +1314,7 @@
     JMenuItem copyHTMLItem = newJMenuItemAlt(tr("Copy as HTML"), 'C');
     copyHTMLItem.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
-          getCurrentTab().handleDiscourseCopy();
+          getCurrentTab().handleHTMLCopy();
         }
       });
     menu.add(copyHTMLItem);
