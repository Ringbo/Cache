diff --git a/src/net/java/sip/communicator/impl/gui/main/call/conference/BasicConferenceParticipantPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/conference/BasicConferenceParticipantPanel.java
index 452ecd9..c4ce446 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/conference/BasicConferenceParticipantPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/conference/BasicConferenceParticipantPanel.java
@@ -270,10 +270,10 @@
 
         peerDetailsPanel.add(imageLabel, constraints);
 
-        constraints.fill = GridBagConstraints.HORIZONTAL;
+        constraints.fill = GridBagConstraints.BOTH;
         constraints.gridx = 1;
         constraints.gridy = 0;
-        constraints.weightx = 1;
+        constraints.weightx = 1f;
         constraints.weighty = 0;
         constraints.insets = new Insets(5, 20, 5, 20);
 
