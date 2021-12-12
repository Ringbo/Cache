diff --git a/src/main/java/com/chrisrm/idea/MTBundledThemesManager.java b/src/main/java/com/chrisrm/idea/MTBundledThemesManager.java
index d6cc347..e571f22 100644
--- a/src/main/java/com/chrisrm/idea/MTBundledThemesManager.java
+++ b/src/main/java/com/chrisrm/idea/MTBundledThemesManager.java
@@ -82,7 +82,7 @@
   }
 
   private MTBundledTheme loadBundledTheme(final String resource, final BundledThemeEP ep) throws Exception {
-    final URL url = ep.getClass().getResource(resource);
+    final URL url = ep.getLoaderForClass().getResource(resource);
     if (url == null) {
       throw new Exception("Cannot read theme from " + resource);
     }
