diff --git a/community/values/src/main/java/org/neo4j/values/virtual/VirtualValues.java b/community/values/src/main/java/org/neo4j/values/virtual/VirtualValues.java
index a733946..83ca313 100644
--- a/community/values/src/main/java/org/neo4j/values/virtual/VirtualValues.java
+++ b/community/values/src/main/java/org/neo4j/values/virtual/VirtualValues.java
@@ -68,9 +68,9 @@
         return new LabelValue( id, value );
     }
 
-    public static LabelSet labels( LabelValue... labelIds )
+    public static LabelSet labels( LabelValue... labels )
     {
-        return new LabelSet.ArrayBasedLabelSet( labelIds );
+        return new LabelSet.ArrayBasedLabelSet( labels );
     }
 
     public static NodeReference node( long id )
