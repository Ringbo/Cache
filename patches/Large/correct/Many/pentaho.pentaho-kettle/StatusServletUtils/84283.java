diff --git a/engine/src/main/java/org/pentaho/di/www/StatusServletUtils.java b/engine/src/main/java/org/pentaho/di/www/StatusServletUtils.java
index 2324916..00831c8 100644
--- a/engine/src/main/java/org/pentaho/di/www/StatusServletUtils.java
+++ b/engine/src/main/java/org/pentaho/di/www/StatusServletUtils.java
@@ -55,11 +55,11 @@
       themeName = doc.getElementsByTagName( "default-theme" ).item( 0 ).getTextContent();
 
       // Get theme CSS file
-      themeCss = relativePathSeparator
+      String themeDirStr = relativePathSeparator
           + "pentaho-solutions" + File.separator + "system" + File.separator
           + "common-ui" + File.separator + "resources" + File.separator
           + "themes" + File.separator + themeName + File.separator;
-      File themeDir = new File( themeCss );
+      File themeDir = new File( themeDirStr );
       for ( File fName : themeDir.listFiles() ) {
         if ( fName.getName().contains( ".css" ) ) {
           themeCss = fName.getName();
@@ -71,10 +71,10 @@
       relativePathSeparator = relativePathSeparator.replaceFirst( "(\\.\\.\\\\)", "" );
 
       // Get mantle theme CSS file
-      mantleThemeCss = relativePathSeparator + "webapps" + File.separator
+      String mantleThemeDirStr = relativePathSeparator + "webapps" + File.separator
           + "pentaho" + File.separator + "mantle" + File.separator
           + "themes" + File.separator + themeName + File.separator;
-      File mantleThemeDir = new File( mantleThemeCss );
+      File mantleThemeDir = new File( mantleThemeDirStr );
       for ( File fName : mantleThemeDir.listFiles() ) {
         if ( fName.getName().contains( ".css" ) ) {
           mantleThemeCss = fName.getName();
