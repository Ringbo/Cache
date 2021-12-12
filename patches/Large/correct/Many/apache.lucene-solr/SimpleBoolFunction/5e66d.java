diff --git a/solr/src/java/org/apache/solr/search/function/SimpleBoolFunction.java b/solr/src/java/org/apache/solr/search/function/SimpleBoolFunction.java
index 6a4da8b..bb35c9d 100644
--- a/solr/src/java/org/apache/solr/search/function/SimpleBoolFunction.java
+++ b/solr/src/java/org/apache/solr/search/function/SimpleBoolFunction.java
@@ -63,7 +63,7 @@
   @Override
   public boolean equals(Object o) {
     if (this.getClass() != o.getClass()) return false;
-    SingleFunction other = (SingleFunction)o;
+    SimpleBoolFunction other = (SimpleBoolFunction)o;
     return this.source.equals(other.source);
   }
 
