diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefsAccessor.java b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefsAccessor.java
index 63e6bcb..d4e7bf1 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefsAccessor.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/prefs/model/UIPrefsAccessor.java
@@ -140,7 +140,8 @@
    
    public String getThemeErrorClass()
    {    
-      if (AceThemes.TEXTMATE.equals(theme().getValue()))
+      if ((theme().getValue() == null) ||
+          AceThemes.TEXTMATE.equals(theme().getValue()))
          return " ace_constant";
       else  
          return " ace_constant ace_language";
