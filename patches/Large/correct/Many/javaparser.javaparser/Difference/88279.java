diff --git a/javaparser-core/src/main/java/com/github/javaparser/printer/lexicalpreservation/Difference.java b/javaparser-core/src/main/java/com/github/javaparser/printer/lexicalpreservation/Difference.java
index 621a87e..c8c96eb 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/printer/lexicalpreservation/Difference.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/printer/lexicalpreservation/Difference.java
@@ -449,7 +449,7 @@
                     Removed removed = (Removed)diffEl;
                     if ((removed.element instanceof LexicalDifferenceCalculator.CsmChild) && nodeTextEl instanceof ChildTextElement) {
                         nodeText.removeElement(nodeTextIndex);
-                        if (nodeTextIndex > nodeText.getElements().size() && nodeText.getElements().get(nodeTextIndex).isToken(3)) {
+                        if (nodeTextIndex < nodeText.getElements().size() && nodeText.getElements().get(nodeTextIndex).isToken(3)) {
                             nodeTextIndex = considerCleaningTheLine(nodeText, nodeTextIndex);
                         }
                         diffIndex++;
