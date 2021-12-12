diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
index 34905da..f667f00 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/tools/ReflectionUtils.java
@@ -58,7 +58,7 @@
       for (; resources_.hasMoreElements();) {
         URL resource = resources_.nextElement();
         if (resource.getProtocol().equals("jar")) {
-          // TODO: make this network transparent
+          // TODO: make sure this is network transparent
           String jarPath = resource.getPath().substring(0, resource.getPath().indexOf('!'));
           uniqResources.add(new URL(jarPath));
           // System.err.println("added jar: " + jarPath);
@@ -70,14 +70,11 @@
 
       for (URL resource : uniqResources) {
         // System.err.println("trying resource: " + resource);
-        // System.err.println(" path:" + resource.getPath());
 
         // jars and directories are treated differently
         if (resource.getPath().endsWith("jar")) {
-          // String jarPath = resource.getPath().substring(0, resource.getPath().indexOf('!'));
 
-          // TODO: make this network transparent
-          JarFile currentFile = new JarFile(new File(resource.getPath()));
+          JarFile currentFile = new JarFile(new File(resource.toURI()));
           // jars are flat containers:
           for (Enumeration<JarEntry> e = currentFile.entries(); e.hasMoreElements();) {
             JarEntry current = (JarEntry) e.nextElement();
@@ -111,8 +108,7 @@
             }
           }
         } else {
-          // TODO: make it network transparent
-          File directory = new File(resource.getPath());
+          File directory = new File(resource.toURI());
 
           if (!directory.exists() && !directory.isDirectory()) {
             throw new Exception("directory does not exist: " + directory.getAbsolutePath());
