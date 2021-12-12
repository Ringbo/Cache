diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrls7Test.java b/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrls7Test.java
index dce86df..53e1425 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrls7Test.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/ExternalJavadocUrls7Test.java
@@ -31,7 +31,7 @@
            "  void <caret>foo(Class<?>... cl) { }\n" +
            "}",
 
-           "foo(java.lang.Class...)", "foo(java.lang.Class<?>...)"
+           "foo(java.lang.Class...)", "foo(java.lang.Class<?>...)", "foo-java.lang.Class...-", "foo-java.lang.Class<?>...-"
     );
   }
 
@@ -42,7 +42,7 @@
            "}\n" +
            "class Comparator<X>{}",
 
-           "sort(T[], Comparator)", "sort(T[], Comparator<? super T>)"
+           "sort(T[], Comparator)", "sort(T[], Comparator<? super T>)", "sort-T:A-Comparator-", "sort-T:A-Comparator<? super T>-"
     );
   }
 }
