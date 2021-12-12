diff --git a/curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java b/curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java
index b65f863..c9bbbf6 100644
--- a/curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java
+++ b/curator-framework/src/main/java/org/apache/curator/framework/imps/GetConfigBuilderImpl.java
@@ -80,7 +80,7 @@
     @Override
     public Ensembleable<byte[]> inBackground()
     {
-        backgrounding = new Backgrounding();
+        backgrounding = new Backgrounding(true);
         return this;
     }
 
