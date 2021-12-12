diff --git a/plugins/ant/src/com/intellij/lang/ant/dom/CustomAntElementsRegistry.java b/plugins/ant/src/com/intellij/lang/ant/dom/CustomAntElementsRegistry.java
index 8bf4aa8..7119413 100644
--- a/plugins/ant/src/com/intellij/lang/ant/dom/CustomAntElementsRegistry.java
+++ b/plugins/ant/src/com/intellij/lang/ant/dom/CustomAntElementsRegistry.java
@@ -283,21 +283,21 @@
       clazz = loader.loadClass(classname);
     }
     catch (ClassNotFoundException e) {
-      error = e.getMessage();
+      error = "Class not found " + e.getMessage();
       if (error == null) {
         error = "";
       }
       clazz = null;
     }
     catch (NoClassDefFoundError e) {
-      error = e.getMessage();
+      error = "Class definition not found " + e.getMessage();
       if (error == null) {
         error = "";
       }
       clazz = null;
     }
     catch (UnsupportedClassVersionError e) {
-      error = e.getMessage();
+      error = "Unsupported class version " + e.getMessage();
       if (error == null) {
         error = "";
       }
@@ -309,7 +309,7 @@
   private void addCustomDefinition(@NotNull AntDomNamedElement declaringTag, String customTagName, String nsUri, Class clazz, String error) {
     final XmlName xmlName = new XmlName(customTagName, nsUri == null? "" : nsUri);
     if (error != null) {
-      myErrors.put(xmlName, customTagName);
+      myErrors.put(xmlName, error);
     }
     myCustomElements.put(xmlName, clazz);
     myDeclarations.put(xmlName, declaringTag);
