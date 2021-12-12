diff --git a/src/com/github/begla/blockmania/generators/ObjectGeneratorTree.java b/src/com/github/begla/blockmania/generators/ObjectGeneratorTree.java
index f834508..cce67f7 100644
--- a/src/com/github/begla/blockmania/generators/ObjectGeneratorTree.java
+++ b/src/com/github/begla/blockmania/generators/ObjectGeneratorTree.java
@@ -51,7 +51,7 @@
         }
 
         // Generate the treetop
-        for (int y = height - 2; y < height + 2; y += 1) {
+        for (int y = height - 3; y < height + 1; y++) {
             for (int x = -2; x < 3; x++) {
                 for (int z = -2; z < 3; z++) {
                     if (!(x == -2 && z == -2) && !(x == 2 && z == 2) && !(x == -2 && z == 2) && !(x == 2 && z == -2)) {
