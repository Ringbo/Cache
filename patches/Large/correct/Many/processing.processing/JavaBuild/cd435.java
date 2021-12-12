diff --git a/java/src/processing/mode/java/JavaBuild.java b/java/src/processing/mode/java/JavaBuild.java
index 829ea29..316001b 100644
--- a/java/src/processing/mode/java/JavaBuild.java
+++ b/java/src/processing/mode/java/JavaBuild.java
@@ -523,11 +523,11 @@
           } else {
             if (packageMatch == null) {
               // use the default package name, since mixing with package-less code will break
-              packageMatch = new String[] { packageName };
+              packageMatch = new String[] { "", packageName };
               // add the package name to the source before writing it
               javaCode = "package " + packageName + ";" + javaCode;
             }
-            File packageFolder = new File(srcFolder, packageMatch[0].replace('.', '/'));
+            File packageFolder = new File(srcFolder, packageMatch[1].replace('.', File.separatorChar));
             packageFolder.mkdirs();
             Util.saveFile(javaCode, new File(packageFolder, filename));
           }
