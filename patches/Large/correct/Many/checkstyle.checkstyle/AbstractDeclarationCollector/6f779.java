diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
index e8ea3c7..372ad06 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
@@ -246,7 +246,7 @@
         /** Add a name to the frame.
          * @param nameToAdd the name we're adding
          */
-        void addName(String nameToAdd) {
+        private void addName(String nameToAdd) {
             varNames.add(nameToAdd);
         }
 
@@ -262,7 +262,7 @@
          * @param nameToFind the name we're looking for
          * @return whether it was found
          */
-        LexicalFrame getIfContains(String nameToFind) {
+        private LexicalFrame getIfContains(String nameToFind) {
             LexicalFrame frame = null;
 
             if (contains(nameToFind)) {
