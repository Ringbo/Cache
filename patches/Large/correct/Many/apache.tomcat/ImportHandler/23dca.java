diff --git a/java/javax/el/ImportHandler.java b/java/javax/el/ImportHandler.java
index 8852f8f..25d406a 100644
--- a/java/javax/el/ImportHandler.java
+++ b/java/javax/el/ImportHandler.java
@@ -152,7 +152,7 @@
         if (className != null) {
             Class<?> clazz = findClass(className, true);
             if (clazz != null) {
-                clazzes.put(className, clazz);
+                clazzes.put(name, clazz);
                 return clazz;
             }
         }
