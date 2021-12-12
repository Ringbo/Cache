diff --git a/src/main/java/org/jabref/gui/BasePanel.java b/src/main/java/org/jabref/gui/BasePanel.java
index fa37f93..d221e3e 100644
--- a/src/main/java/org/jabref/gui/BasePanel.java
+++ b/src/main/java/org/jabref/gui/BasePanel.java
@@ -264,7 +264,8 @@
 
     @Subscribe
     public void listen(BibDatabaseContextChangedEvent event) {
-        this.markBaseChanged();
+        SwingUtilities.invokeLater(() -> this.markBaseChanged());
+
     }
 
     /**
