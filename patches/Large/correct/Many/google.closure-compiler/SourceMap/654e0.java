diff --git a/src/com/google/javascript/jscomp/SourceMap.java b/src/com/google/javascript/jscomp/SourceMap.java
index 6c96be7..7ac8421 100644
--- a/src/com/google/javascript/jscomp/SourceMap.java
+++ b/src/com/google/javascript/jscomp/SourceMap.java
@@ -180,7 +180,9 @@
         lineNo = sourceMapping.getLineNumber();
         charNo = sourceMapping.getColumnPosition();
         String identifier = sourceMapping.getIdentifier();
-        if (sourceMapping != null && !identifier.isEmpty()) {
+        // TODO(bradfordcsmith): When we move off of GWT we should be able
+        //     to use sourceMapping.hasIdentifier() instead of a null check.
+        if (identifier != null && !identifier.isEmpty()) {
           originalName = identifier;
         }
       }
