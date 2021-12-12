diff --git a/subprojects/core/src/main/groovy/org/gradle/util/ClasspathUtil.java b/subprojects/core/src/main/groovy/org/gradle/util/ClasspathUtil.java
index 63fea73..44c93f4 100644
--- a/subprojects/core/src/main/groovy/org/gradle/util/ClasspathUtil.java
+++ b/subprojects/core/src/main/groovy/org/gradle/util/ClasspathUtil.java
@@ -81,7 +81,7 @@
                 assert path.endsWith("/" + name);
                 return new File(path.substring(0, path.length() - (name.length() + 1)));
             } else if (location.getScheme().equals("jar")) {
-                String schemeSpecificPart = location.getSchemeSpecificPart();
+                String schemeSpecificPart = location.getRawSchemeSpecificPart();
                 int pos = schemeSpecificPart.indexOf("!");
                 if (pos > 0) {
                     assert schemeSpecificPart.substring(pos + 1).equals("/" + name);
