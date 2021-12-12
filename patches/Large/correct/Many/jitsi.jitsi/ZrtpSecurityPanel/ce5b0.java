diff --git a/src/net/java/sip/communicator/impl/gui/main/call/ZrtpSecurityPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/ZrtpSecurityPanel.java
index 73cfa37..c0e5f91 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/ZrtpSecurityPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/ZrtpSecurityPanel.java
@@ -182,7 +182,7 @@
         constraints.gridx = 0;
         constraints.gridy = 0;
         constraints.gridheight = 1;
-        constraints.weightx = 0f;
+        constraints.weightx = 0.5f;
         constraints.weighty = 0f;
         this.add(audioSecurityLabel, constraints);
 
@@ -191,7 +191,7 @@
         constraints.gridx = 0;
         constraints.gridy = 1;
         constraints.gridheight = 1;
-        constraints.weightx = 0f;
+        constraints.weightx = 0.5f;
         constraints.weighty = 0f;
         constraints.insets = new Insets(5, 0, 0, 0);
         this.add(videoSecurityLabel, constraints);
@@ -210,7 +210,7 @@
         constraints.gridx = 0;
         constraints.gridy = 2;
         constraints.gridheight = 1;
-        constraints.weightx = 0f;
+        constraints.weightx = 0.5f;
         constraints.weighty = 0f;
         constraints.insets = new Insets(5, 0, 0, 0);
         this.add(cipherLabel, constraints);
@@ -220,7 +220,7 @@
         constraints.gridx = 1;
         constraints.gridy = 0;
         constraints.gridheight = 3;
-        constraints.weightx = 1f;
+        constraints.weightx = 0.5f;
         constraints.weighty = 0f;
         constraints.insets = new Insets(0, 5, 0, 5);
         this.add(createSasPanel(), constraints);
