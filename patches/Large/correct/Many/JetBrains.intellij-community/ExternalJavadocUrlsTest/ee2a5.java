diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrlsTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrlsTest.java
index 28fb79a..b67315f 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrlsTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrlsTest.java
@@ -38,7 +38,7 @@
            "  void <caret>foo(Class<?>... cl) { }\n" +
            "}",
 
-           "foo-java.lang.Class...-", "foo-java.lang.Class<?>...-");
+           "foo-java.lang.Class...-", "foo-java.lang.Class<?>...-", "foo(java.lang.Class...)", "foo(java.lang.Class<?>...)");
 
   }
 
@@ -48,7 +48,7 @@
            "}\n" +
            "class Comparator<X>{}",
 
-           "sort-T:A-Comparator-", "sort-T:A-Comparator<? super T>-");
+           "sort-T:A-Comparator-", "sort-T:A-Comparator<? super T>-", "sort(T[], Comparator)", "sort(T[], Comparator<? super T>)");
   }
 
   protected void doTest(String text, String... expected) {
