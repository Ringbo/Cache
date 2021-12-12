diff --git a/java/idea-ui/src/com/intellij/ide/projectWizard/ProjectTypeStep.java b/java/idea-ui/src/com/intellij/ide/projectWizard/ProjectTypeStep.java
index a9a0a99..fc9b0f9 100644
--- a/java/idea-ui/src/com/intellij/ide/projectWizard/ProjectTypeStep.java
+++ b/java/idea-ui/src/com/intellij/ide/projectWizard/ProjectTypeStep.java
@@ -162,7 +162,7 @@
     String card;
     if (panel != null) {
       card = builder.getBuilderId();
-      if (!myCards.add(card)) {
+      if (myCards.add(card)) {
          myOptionsPanel.add(panel, card);
       }
     }
