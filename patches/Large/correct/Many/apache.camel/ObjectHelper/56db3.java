diff --git a/core/camel-util/src/main/java/org/apache/camel/util/ObjectHelper.java b/core/camel-util/src/main/java/org/apache/camel/util/ObjectHelper.java
index 74a9aa2..d357fe2 100644
--- a/core/camel-util/src/main/java/org/apache/camel/util/ObjectHelper.java
+++ b/core/camel-util/src/main/java/org/apache/camel/util/ObjectHelper.java
@@ -499,7 +499,7 @@
      */
     public static InputStream loadResourceAsStream(String name, ClassLoader loader) {
         try {
-            URL res = loadResourceAsURL(name);
+            URL res = loadResourceAsURL(name, loader);
             return res != null ? res.openStream() : null;
         } catch (IOException e) {
             return null;
