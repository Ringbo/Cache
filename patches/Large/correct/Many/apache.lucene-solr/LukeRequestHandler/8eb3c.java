diff --git a/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java b/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
index 83d85da..dc68f97 100644
--- a/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
+++ b/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
@@ -301,7 +301,7 @@
 
       f.add( "type", (ftype==null)?null:ftype.getTypeName() );
       f.add( "schema", getFieldFlags( sfield ) );
-      if (schema.getDynamicPattern(sfield.getName()) != null) {
+      if (sfield != null && schema.getDynamicPattern(sfield.getName()) != null) {
     	  f.add("dynamicBase", schema.getDynamicPattern(sfield.getName()));
       }
 
