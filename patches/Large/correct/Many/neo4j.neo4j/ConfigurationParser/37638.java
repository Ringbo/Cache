diff --git a/community/src/main/java/org/neo4j/visualization/graphviz/ConfigurationParser.java b/community/src/main/java/org/neo4j/visualization/graphviz/ConfigurationParser.java
index 1ac26eb..2cad040 100644
--- a/community/src/main/java/org/neo4j/visualization/graphviz/ConfigurationParser.java
+++ b/community/src/main/java/org/neo4j/visualization/graphviz/ConfigurationParser.java
@@ -120,7 +120,7 @@
         }
     }
 
-    private List<StyleParameter> styles = new ArrayList<StyleParameter>();
+    private final List<StyleParameter> styles = new ArrayList<StyleParameter>();
 
     public final StyleParameter[] styles( StyleParameter... params )
     {
@@ -227,7 +227,7 @@
         private String untilNonAlfa( int start )
         {
             int end = start;
-            while ( Character.isLetter( pattern.charAt( end ) ) )
+            while ( end < pattern.length() && Character.isLetter( pattern.charAt( end ) ) )
             {
                 end++;
             }
