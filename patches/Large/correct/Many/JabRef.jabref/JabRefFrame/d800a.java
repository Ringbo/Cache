diff --git a/src/main/java/net/sf/jabref/gui/JabRefFrame.java b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
index 9a83ec8..f7599e0 100644
--- a/src/main/java/net/sf/jabref/gui/JabRefFrame.java
+++ b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
@@ -127,7 +127,7 @@
 
     private PositionWindow pw;
 
-    private final GeneralAction checkIntegrity = new GeneralAction(Actions.CHECK_INTEGRITY, Localization.lang("Check integrity")) {
+    private final GeneralAction checkIntegrity = new GeneralAction(Actions.CHECK_INTEGRITY, Localization.menuTitle("Check integrity")) {
 
         @Override
         public void actionPerformed(ActionEvent e) {
