diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ConfigurationErrorsComponent.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ConfigurationErrorsComponent.java
index bbf11c6..ceec9ac 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ConfigurationErrorsComponent.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ConfigurationErrorsComponent.java
@@ -504,7 +504,7 @@
       if (myModel.getSize() == 0) {
         setBorder(null);
       } else {
-        if (getBorder() == null) setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0),
+        if (getBorder() == null) setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(5, 0, 5, 0, UIUtil.getPanelBackground()),
                                                    BorderFactory.createLineBorder(UIUtil.getPanelBackgound().darker())));
       }
 
