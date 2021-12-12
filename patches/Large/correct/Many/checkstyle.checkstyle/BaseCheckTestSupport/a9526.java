diff --git a/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java b/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
index 5a1c98c..bb6aab9 100644
--- a/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
+++ b/src/it/java/com/google/checkstyle/test/base/BaseCheckTestSupport.java
@@ -34,7 +34,7 @@
     static class BriefLogger
         extends DefaultLogger
     {
-        public BriefLogger(OutputStream out) throws UnsupportedEncodingException
+        BriefLogger(OutputStream out) throws UnsupportedEncodingException
         {
             super(out, true);
         }
