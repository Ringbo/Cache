diff --git a/curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java b/curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java
index 761c8ad..f4dba90 100644
--- a/curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java
+++ b/curator-framework/src/main/java/org/apache/curator/framework/imps/ReconfigBuilderImpl.java
@@ -203,7 +203,7 @@
     @Override
     public ReconfigBuilderMain inBackground()
     {
-        backgrounding = new Backgrounding();
+        backgrounding = new Backgrounding(true);
         return this;
     }
 
