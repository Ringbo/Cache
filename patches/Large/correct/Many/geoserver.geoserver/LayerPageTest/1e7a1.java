diff --git a/src/web/core/src/test/java/org/geoserver/web/data/layer/LayerPageTest.java b/src/web/core/src/test/java/org/geoserver/web/data/layer/LayerPageTest.java
index 58e5734..90b2170 100644
--- a/src/web/core/src/test/java/org/geoserver/web/data/layer/LayerPageTest.java
+++ b/src/web/core/src/test/java/org/geoserver/web/data/layer/LayerPageTest.java
@@ -81,7 +81,7 @@
         String checkBoxPath = "table:listContainer:items:6:selectItemContainer:selectItem";
         CheckBox selector = (CheckBox) tester.getComponentFromLastRenderedPage(checkBoxPath);
         // dirty trick, how to set a form component value without a form
-        tester.getServletRequest().setParameter(selector.getInputName(), "true");
+        tester.getRequest().setParameter(selector.getInputName(), "true");
         tester.executeAjaxEvent(selector, "onclick");
         assertEquals(1, table.getSelection().size());
         LayerInfo li = (LayerInfo) table.getSelection().get(0);
