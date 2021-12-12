diff --git a/java/java-impl/src/com/intellij/psi/impl/source/codeStyle/javadoc/JDParser.java b/java/java-impl/src/com/intellij/psi/impl/source/codeStyle/javadoc/JDParser.java
index d996c7d..21d0c41 100644
--- a/java/java-impl/src/com/intellij/psi/impl/source/codeStyle/javadoc/JDParser.java
+++ b/java/java-impl/src/com/intellij/psi/impl/source/codeStyle/javadoc/JDParser.java
@@ -362,7 +362,7 @@
         continue;
       }
       while (true) {
-        if (seq.length() < width) {
+        if (seq.length() < width || isMarked) {
           // keep remaining line and proceed with next paragraph
           seq = isMarked ? seq : seq.trim();
           list.add(seq);
