diff --git a/src/java/org/apache/lucene/document/Field.java b/src/java/org/apache/lucene/document/Field.java
index 3d47858..82759bf 100644
--- a/src/java/org/apache/lucene/document/Field.java
+++ b/src/java/org/apache/lucene/document/Field.java
@@ -132,10 +132,10 @@
     return new Field(name, value, true, true, true);
   }
 
-  /** Constructs a Date-valued Field that is tokenized and indexed,
-      and is stored in the index, for return with hits. */
+  /** Constructs a Date-valued Field that is not tokenized and is indexed,
+      and stored in the index, for return with hits. */
   public static final Field Keyword(String name, Date value) {
-    return new Field(name, DateField.dateToString(value), true, true, true);
+    return new Field(name, DateField.dateToString(value), true, true, false);
   }
 
   /** Constructs a String-valued Field that is tokenized and indexed,
