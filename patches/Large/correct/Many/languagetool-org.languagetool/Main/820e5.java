diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/openoffice/Main.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/openoffice/Main.java
index 03a596e..ef31ed7 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/openoffice/Main.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/openoffice/Main.java
@@ -363,7 +363,7 @@
       Object textPortion = portionEnum.nextElement();
       XPropertySet textProps = (XPropertySet) UnoRuntime.queryInterface(XPropertySet.class, textPortion);
       String type = (String)textProps.getPropertyValue("TextPortionType");
-      if ("Footnote".equals(type)) {
+      if ("Footnote".equals(type) || "DocumentIndexMark".equals(type)) {
         // a footnote reference appears as one character in the text. we don't use a whitespace
         // because we don't want to trigger the "no whitespace before comma" rule in this case:
         // my footnote¹, foo bar
