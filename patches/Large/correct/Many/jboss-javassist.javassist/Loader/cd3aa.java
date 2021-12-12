diff --git a/src/main/javassist/Loader.java b/src/main/javassist/Loader.java
index 93f3ce3..97cc5ca 100644
--- a/src/main/javassist/Loader.java
+++ b/src/main/javassist/Loader.java
@@ -362,7 +362,7 @@
         int i = name.lastIndexOf('.');
         if (i != -1) {
             String pname = name.substring(0, i);
-            if (getPackage(pname) == null)
+            if (getDefinedPackage(pname) == null)
                 try {
                     definePackage(
                         pname, null, null, null, null, null, null, null);
