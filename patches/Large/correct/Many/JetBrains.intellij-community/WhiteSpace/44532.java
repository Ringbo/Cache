diff --git a/platform/lang-impl/src/com/intellij/formatting/WhiteSpace.java b/platform/lang-impl/src/com/intellij/formatting/WhiteSpace.java
index 7054fd0..ef446b2 100644
--- a/platform/lang-impl/src/com/intellij/formatting/WhiteSpace.java
+++ b/platform/lang-impl/src/com/intellij/formatting/WhiteSpace.java
@@ -327,10 +327,10 @@
       public void run() {
         if (spaceProperty != null) {
           if (getLineFeeds() == 0) {
-            if (getTotalSpaces() < spaceProperty.getMinSpaces()) {
+            if (spaceProperty.getMinSpaces() >= 0 && getTotalSpaces() < spaceProperty.getMinSpaces()) {
               setSpaces(spaceProperty.getMinSpaces(), 0);
             }
-            if (getTotalSpaces() > spaceProperty.getMaxSpaces()) {
+            if (spaceProperty.getMaxSpaces() >= 0 && getTotalSpaces() > spaceProperty.getMaxSpaces()) {
               setSpaces(spaceProperty.getMaxSpaces(), 0);
             }
           }
