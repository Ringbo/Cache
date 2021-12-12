diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
index 792d889..98c5422 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/AbstractDeclarationCollector.java
@@ -323,7 +323,7 @@
          * Creates new instance of ClassFrame
          * @param parent parent frame
          */
-        public ClassFrame(LexicalFrame parent) {
+        ClassFrame(LexicalFrame parent) {
             super(parent);
             instanceMembers = Sets.newHashSet();
             instanceMethods = Sets.newHashSet();
