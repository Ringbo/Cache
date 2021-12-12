diff --git a/src/web/core/src/test/java/org/geoserver/web/wicket/property/PropertyEditorFormComponentTest.java b/src/web/core/src/test/java/org/geoserver/web/wicket/property/PropertyEditorFormComponentTest.java
index fc4a11f..4460723 100644
--- a/src/web/core/src/test/java/org/geoserver/web/wicket/property/PropertyEditorFormComponentTest.java
+++ b/src/web/core/src/test/java/org/geoserver/web/wicket/property/PropertyEditorFormComponentTest.java
@@ -72,7 +72,7 @@
         try {
             tester.assertComponent("form:props:container:list:3:remove",AjaxLink.class);
             fail();
-        } catch(Exception e) {}
+        } catch(AssertionError e) {}
 
         ListView list = 
             (ListView) tester.getComponentFromLastRenderedPage("form:props:container:list");
