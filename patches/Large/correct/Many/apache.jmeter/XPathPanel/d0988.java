diff --git a/src/components/org/apache/jmeter/assertions/gui/XPathPanel.java b/src/components/org/apache/jmeter/assertions/gui/XPathPanel.java
index 63eb998..bcd4564 100644
--- a/src/components/org/apache/jmeter/assertions/gui/XPathPanel.java
+++ b/src/components/org/apache/jmeter/assertions/gui/XPathPanel.java
@@ -94,7 +94,7 @@
      * @param xpath
      */
     public void setXPath(String xpath) {
-        this.xpath.setText(xpath);
+        this.xpath.setInitialText(xpath);
     }
 
     /**
