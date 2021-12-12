diff --git a/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java b/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
index 17f2368..2d3801e 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/PackageBuilder.java
@@ -148,7 +148,7 @@
         try {
             xmlReader.read( reader );
         } catch ( final SAXException e ) {
-            throw new DroolsParserException( e.getCause() );
+            throw new DroolsParserException( e.toString(), e.getCause() );
         }
 
         addPackage( xmlReader.getPackageDescr() );
