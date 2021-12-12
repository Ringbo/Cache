diff --git a/src/main/java/org/bytedeco/javacpp/tools/Builder.java b/src/main/java/org/bytedeco/javacpp/tools/Builder.java
index ab07942..dd84f4e 100644
--- a/src/main/java/org/bytedeco/javacpp/tools/Builder.java
+++ b/src/main/java/org/bytedeco/javacpp/tools/Builder.java
@@ -930,19 +930,19 @@
                     ClassProperties p2 = Loader.loadProperties(classArray, properties, true);
 
                     for (String s : preloads) {
-                        if (s.trim().endsWith("#")) {
+                        if (s.trim().endsWith("#") || s.trim().length() == 0) {
                             // the user specified an empty destination to skip the copy
                             continue;
                         }
                         URL[] urls = Loader.findLibrary(null, p, s);
                         File fi;
                         try {
-                            fi = new File(urls[0].toURI());
+                            fi = new File(new URI(urls[0].toURI().toString().split("#")[0]));
                         } catch (Exception e) {
                             // try with inherited paths as well
                             urls = Loader.findLibrary(null, p2, s);
                             try {
-                                fi = new File(urls[0].toURI());
+                                fi = new File(new URI(urls[0].toURI().toString().split("#")[0]));
                             } catch (Exception e2) {
                                 logger.warn("Could not find library " + s);
                                 continue;
