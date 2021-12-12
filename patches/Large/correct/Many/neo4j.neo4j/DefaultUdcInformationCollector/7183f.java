diff --git a/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java b/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
index 376f9e5..7396a97 100644
--- a/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
+++ b/community/udc/src/main/java/org/neo4j/ext/udc/impl/DefaultUdcInformationCollector.java
@@ -114,7 +114,7 @@
         }
     }
 
-    public String filterVersionForUDC( String version )
+    public static String filterVersionForUDC( String version )
     {
         if ( !version.contains( "+" ) )
         {
