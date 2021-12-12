diff --git a/java/java-psi-impl/src/com/intellij/lang/java/parser/ReferenceParser.java b/java/java-psi-impl/src/com/intellij/lang/java/parser/ReferenceParser.java
index 85f8b90..2d44d44 100644
--- a/java/java-psi-impl/src/com/intellij/lang/java/parser/ReferenceParser.java
+++ b/java/java-psi-impl/src/com/intellij/lang/java/parser/ReferenceParser.java
@@ -379,7 +379,7 @@
     if (expect(builder, start)) {
       while (true) {
         endsWithError = false;
-        PsiBuilder.Marker classReference = parseJavaCodeReference(builder, true, true, false, false);
+        PsiBuilder.Marker classReference = parseJavaCodeReference(builder, false, true, false, false);
         if (classReference == null) {
           error(builder, JavaErrorMessages.message("expected.identifier"));
           endsWithError = true;
