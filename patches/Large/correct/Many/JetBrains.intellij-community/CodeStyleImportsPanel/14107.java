diff --git a/java/java-impl/src/com/intellij/application/options/CodeStyleImportsPanel.java b/java/java-impl/src/com/intellij/application/options/CodeStyleImportsPanel.java
index ba3ba9e..ab8f748 100644
--- a/java/java-impl/src/com/intellij/application/options/CodeStyleImportsPanel.java
+++ b/java/java-impl/src/com/intellij/application/options/CodeStyleImportsPanel.java
@@ -90,7 +90,7 @@
     final MultiLineLabel oneImportPerDirectiveLabel = new MultiLineLabel("<% page import=\"com.company.Boo\"%>\n" +
                                                                          "<% page import=\"com.company.Far\"%>");
     final JPanel labelPanel = new JPanel(new BorderLayout());
-    labelPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(20, 10, 0, 0), IdeBorderFactory.createTitledBorderBoldWithIndent(
+    labelPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(20, 10, 0, 0), IdeBorderFactory.createTitledBorderSimpleWithoutIndent(
       ApplicationBundle.message("title.preview"))));
 
     JPanel resultPanel = new JPanel(new BorderLayout());
