diff --git a/src/main/java/net/sf/jabref/gui/groups/GroupSelector.java b/src/main/java/net/sf/jabref/gui/groups/GroupSelector.java
index 4ada9f9..bb92ad0 100644
--- a/src/main/java/net/sf/jabref/gui/groups/GroupSelector.java
+++ b/src/main/java/net/sf/jabref/gui/groups/GroupSelector.java
@@ -253,7 +253,7 @@
         helpButton.setMargin(butIns);
         openSettings.setMargin(butIns);
         newButton.addActionListener(e -> {
-            GroupDialog gd = new GroupDialog(frame, panel, null);
+            GroupDialog gd = new GroupDialog(frame, null);
             gd.setVisible(true);
             if (gd.okPressed()) {
                 AbstractGroup newGroup = gd.getResultingGroup();
@@ -787,7 +787,7 @@
         public void actionPerformed(ActionEvent e) {
             final GroupTreeNodeViewModel node = getNodeToUse();
             final AbstractGroup oldGroup = node.getNode().getGroup();
-            final GroupDialog gd = new GroupDialog(frame, panel, oldGroup);
+            final GroupDialog gd = new GroupDialog(frame, oldGroup);
             gd.setVisible(true);
             if (gd.okPressed()) {
                 AbstractGroup newGroup = gd.getResultingGroup();
@@ -835,7 +835,7 @@
 
         @Override
         public void actionPerformed(ActionEvent e) {
-            final GroupDialog gd = new GroupDialog(frame, panel, null);
+            final GroupDialog gd = new GroupDialog(frame, null);
             gd.setVisible(true);
             if (!gd.okPressed()) {
                 return; // ignore
@@ -866,7 +866,7 @@
 
         @Override
         public void actionPerformed(ActionEvent e) {
-            final GroupDialog gd = new GroupDialog(frame, panel, null);
+            final GroupDialog gd = new GroupDialog(frame, null);
             gd.setVisible(true);
             if (!gd.okPressed()) {
                 return; // ignore
