diff --git a/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java b/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
index bf2a2e7..fd94c27 100644
--- a/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/split/SplitManager.java
@@ -213,7 +213,7 @@
                     expectedType = SchemaField.Type.LONG;
                 }
                 else if (literal instanceof StringLiteral) {
-                    value = ((StringLiteral) literal).getSlice();
+                    value = ((StringLiteral) literal).getValue();
                     expectedType = SchemaField.Type.STRING;
                 }
                 else {
