diff --git a/community/logging/src/test/java/org/neo4j/logging/RotatingFileOutputStreamSupplierTest.java b/community/logging/src/test/java/org/neo4j/logging/RotatingFileOutputStreamSupplierTest.java
index 925ccf8..f4f86e6 100644
--- a/community/logging/src/test/java/org/neo4j/logging/RotatingFileOutputStreamSupplierTest.java
+++ b/community/logging/src/test/java/org/neo4j/logging/RotatingFileOutputStreamSupplierTest.java
@@ -279,7 +279,7 @@
         OutputStream outputStream = supplier.get();
 
         IOException exception = new IOException( "text exception" );
-        doThrow( exception ).when( fs ).move( any( File.class ), any( File.class ) );
+        doThrow( exception ).when( fs ).renameFile( any( File.class ), any( File.class ) );
 
         write( outputStream, "A string longer than 10 bytes" );
         assertThat( supplier.get(), is( outputStream ) );
