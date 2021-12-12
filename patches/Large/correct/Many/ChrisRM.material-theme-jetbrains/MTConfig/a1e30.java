diff --git a/src/main/java/com/chrisrm/idea/MTConfig.java b/src/main/java/com/chrisrm/idea/MTConfig.java
index 67974b2..7691c7b 100644
--- a/src/main/java/com/chrisrm/idea/MTConfig.java
+++ b/src/main/java/com/chrisrm/idea/MTConfig.java
@@ -68,7 +68,7 @@
   // They are public so they can be serialized
   public String version;
 
-  public MTThemeFacade selectedTheme = MTThemes.OCEANIC;
+  public MTThemes selectedTheme = MTThemes.OCEANIC;
   public String highlightColor = ACCENT_COLOR;
   public boolean highlightColorEnabled = false;
   public Integer highlightThickness = 2;
@@ -149,7 +149,7 @@
   }
 
   public void setSelectedTheme(final MTThemeFacade selectedTheme) {
-    this.selectedTheme = selectedTheme;
+    this.selectedTheme = (MTThemes) selectedTheme;
   }
 
   /**
