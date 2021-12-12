diff --git a/java/compiler/forms-compiler/testSrc/com/intellij/uiDesigner/core/SpansTest.java b/java/compiler/forms-compiler/testSrc/com/intellij/uiDesigner/core/SpansTest.java
index d1748b2..71cf98a 100644
--- a/java/compiler/forms-compiler/testSrc/com/intellij/uiDesigner/core/SpansTest.java
+++ b/java/compiler/forms-compiler/testSrc/com/intellij/uiDesigner/core/SpansTest.java
@@ -49,7 +49,7 @@
 
     panel.doLayout();
 
-    assertEquals(130, panel.getPreferredSize().width);
+    assertEquals("b=" + button.getWidth() + ", f1=" + field1.getWidth() + ", f2=" + field2.getWidth(), 130, panel.getPreferredSize().width);
 
     panel.setSize(new Dimension(500, panel.getHeight()));
     panel.doLayout();
