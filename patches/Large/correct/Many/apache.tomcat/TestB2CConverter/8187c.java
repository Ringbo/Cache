diff --git a/test/org/apache/tomcat/util/buf/TestB2CConverter.java b/test/org/apache/tomcat/util/buf/TestB2CConverter.java
index a8d35ae..9b26189 100644
--- a/test/org/apache/tomcat/util/buf/TestB2CConverter.java
+++ b/test/org/apache/tomcat/util/buf/TestB2CConverter.java
@@ -43,7 +43,7 @@
         B2CConverter conv = new B2CConverter("UTF-16");
 
         ByteChunk bc = new ByteChunk();
-        CharChunk cc = new CharChunk();
+        CharChunk cc = new CharChunk(32);
 
 
         for (int i = 0; i < msgCount; i++) {
