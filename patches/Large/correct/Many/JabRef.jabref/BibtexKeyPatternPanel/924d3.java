diff --git a/src/main/java/net/sf/jabref/gui/bibtexkeypattern/BibtexKeyPatternPanel.java b/src/main/java/net/sf/jabref/gui/bibtexkeypattern/BibtexKeyPatternPanel.java
index 8481821..283fbad 100644
--- a/src/main/java/net/sf/jabref/gui/bibtexkeypattern/BibtexKeyPatternPanel.java
+++ b/src/main/java/net/sf/jabref/gui/bibtexkeypattern/BibtexKeyPatternPanel.java
@@ -246,7 +246,7 @@
             setValue(entry.getValue(), entry.getKey(), keyPattern);
         }
 
-        if (keyPattern.getDefaultValue() == null) {
+        if (keyPattern.getDefaultValue() == null || keyPattern.getDefaultValue().isEmpty()) {
             defaultPat.setText("");
         } else {
             defaultPat.setText(keyPattern.getDefaultValue().get(0));
