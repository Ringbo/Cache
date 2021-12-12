diff --git a/common/src/main/java/org/apache/drill/common/expression/SchemaPath.java b/common/src/main/java/org/apache/drill/common/expression/SchemaPath.java
index 659639a..28f060e 100644
--- a/common/src/main/java/org/apache/drill/common/expression/SchemaPath.java
+++ b/common/src/main/java/org/apache/drill/common/expression/SchemaPath.java
@@ -59,7 +59,7 @@
     Collections.reverse(paths);
     NameSegment s = null;
     for(String p : paths){
-      s = new NameSegment(p);
+      s = new NameSegment(p, s);
     }
     return new SchemaPath(s);
   }
