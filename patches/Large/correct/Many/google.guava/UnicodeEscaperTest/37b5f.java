diff --git a/guava-tests/test/com/google/common/escape/UnicodeEscaperTest.java b/guava-tests/test/com/google/common/escape/UnicodeEscaperTest.java
index 36eccdf..4d901c8 100644
--- a/guava-tests/test/com/google/common/escape/UnicodeEscaperTest.java
+++ b/guava-tests/test/com/google/common/escape/UnicodeEscaperTest.java
@@ -185,7 +185,7 @@
     }
   }
 
-  private String escapeAsString(Escaper e, String s) {
+  private static String escapeAsString(Escaper e, String s) {
     return e.escape(s);
   }
 }
