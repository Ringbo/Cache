diff --git a/src/main/java/org/apache/commons/lang3/builder/Builder.java b/src/main/java/org/apache/commons/lang3/builder/Builder.java
index 3ce4ced..e54dc31 100644
--- a/src/main/java/org/apache/commons/lang3/builder/Builder.java
+++ b/src/main/java/org/apache/commons/lang3/builder/Builder.java
@@ -85,5 +85,5 @@
      * 
      * @return the object constructed or result calculated by the builder.
      */
-    public T build();
+    T build();
 }
