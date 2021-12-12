diff --git a/src/org/pentaho/di/version/BuildVersion.java b/src/org/pentaho/di/version/BuildVersion.java
index 44ab0fc..c50b170 100644
--- a/src/org/pentaho/di/version/BuildVersion.java
+++ b/src/org/pentaho/di/version/BuildVersion.java
@@ -74,7 +74,7 @@
             
             // read the file into a String
             int c=inputStream.read();
-            while ( c!=0 && c!='\n' && c!='\r' )
+            while ( c>0 && c!='\n' && c!='\r' )
             {
                 if (c!=' ' && c!='\t') buffer.append((char)c);  // no spaces or tabs please ;-)
                 c=inputStream.read();
