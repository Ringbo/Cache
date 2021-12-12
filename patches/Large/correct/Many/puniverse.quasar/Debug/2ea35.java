diff --git a/quasar-core/src/main/java/co/paralleluniverse/common/util/Debug.java b/quasar-core/src/main/java/co/paralleluniverse/common/util/Debug.java
index baadaa9..8e35ece 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/common/util/Debug.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/common/util/Debug.java
@@ -182,7 +182,7 @@
             if (!dumped) {
                 if (filename == null) {
                     filename = getDumpFile();
-                    if (filename.trim().equals(""))
+                    if (filename == null || filename.trim().equals(""))
                         filename = null;
                 }
                 if (filename == null) {
