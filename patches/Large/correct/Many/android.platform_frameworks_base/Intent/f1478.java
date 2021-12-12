diff --git a/core/java/android/content/Intent.java b/core/java/android/content/Intent.java
index ff9f6ab..53912e1 100644
--- a/core/java/android/content/Intent.java
+++ b/core/java/android/content/Intent.java
@@ -4295,7 +4295,7 @@
                 int j = uri.indexOf(')', i);
                 while (i < j) {
                     int sep = uri.indexOf('!', i);
-                    if (sep < 0) sep = j;
+                    if (sep < 0 || sep > j) sep = j;
                     if (i < sep) {
                         intent.addCategory(uri.substring(i, sep));
                     }
