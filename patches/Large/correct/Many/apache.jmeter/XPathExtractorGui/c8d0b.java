diff --git a/src/components/org/apache/jmeter/extractor/gui/XPathExtractorGui.java b/src/components/org/apache/jmeter/extractor/gui/XPathExtractorGui.java
index 48377ad..426e9f7 100644
--- a/src/components/org/apache/jmeter/extractor/gui/XPathExtractorGui.java
+++ b/src/components/org/apache/jmeter/extractor/gui/XPathExtractorGui.java
@@ -72,7 +72,7 @@
     public void configure(TestElement el) {
         super.configure(el);
         XPathExtractor xpe = (XPathExtractor) el;
-        showScopeSettings(xpe);
+        showScopeSettings(xpe,true);
         xpathQueryField.setText(xpe.getXPathQuery());
         defaultField.setText(xpe.getDefaultValue());
         refNameField.setText(xpe.getRefName());
@@ -119,7 +119,7 @@
 
         Box box = Box.createVerticalBox();
         box.add(makeTitlePanel());
-        box.add(createScopePanel());
+        box.add(createScopePanel(true));
         xml.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), JMeterUtils
                 .getResString("xpath_assertion_option"))); //$NON-NLS-1$
         box.add(xml);
