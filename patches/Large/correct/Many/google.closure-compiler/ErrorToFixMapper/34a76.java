diff --git a/src/com/google/javascript/refactoring/ErrorToFixMapper.java b/src/com/google/javascript/refactoring/ErrorToFixMapper.java
index b8e572c..b7c7500 100644
--- a/src/com/google/javascript/refactoring/ErrorToFixMapper.java
+++ b/src/com/google/javascript/refactoring/ErrorToFixMapper.java
@@ -102,7 +102,7 @@
         .insertBefore(error.node, "!")
         .setDescription("Make type non-nullable")
         .build();
-    return ImmutableList.of(qmark, bang);
+    return ImmutableList.of(bang, qmark);
   }
 
   private static SuggestedFix removeNode(JSError error) {
