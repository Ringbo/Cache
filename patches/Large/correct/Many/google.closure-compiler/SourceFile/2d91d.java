diff --git a/src/com/google/javascript/jscomp/SourceFile.java b/src/com/google/javascript/jscomp/SourceFile.java
index aa30e29..650d772 100644
--- a/src/com/google/javascript/jscomp/SourceFile.java
+++ b/src/com/google/javascript/jscomp/SourceFile.java
@@ -109,7 +109,7 @@
       return;
     }
     try {
-      String[] sourceLines = getCode().split("\n");
+      String[] sourceLines = getCode().split("\n", -1);
       lineOffsets = new int[sourceLines.length];
       for (int ii = 1; ii < sourceLines.length; ++ii) {
         lineOffsets[ii] =
