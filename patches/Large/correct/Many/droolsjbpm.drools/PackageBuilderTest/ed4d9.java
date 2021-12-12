diff --git a/drools-compiler/src/test/java/org/drools/compiler/PackageBuilderTest.java b/drools-compiler/src/test/java/org/drools/compiler/PackageBuilderTest.java
index ea2576b..2f28b48 100644
--- a/drools-compiler/src/test/java/org/drools/compiler/PackageBuilderTest.java
+++ b/drools-compiler/src/test/java/org/drools/compiler/PackageBuilderTest.java
@@ -82,7 +82,7 @@
 
         builder.addPackage( packageDescr );
 
-        assertLength( 3,
+        assertLength( 1,
                       builder.getErrors() );
     }
 
