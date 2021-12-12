diff --git a/AndroidAsync/src/com/koushikdutta/async/http/filter/InflaterInputFilter.java b/AndroidAsync/src/com/koushikdutta/async/http/filter/InflaterInputFilter.java
index a9390ad..84608d6 100644
--- a/AndroidAsync/src/com/koushikdutta/async/http/filter/InflaterInputFilter.java
+++ b/AndroidAsync/src/com/koushikdutta/async/http/filter/InflaterInputFilter.java
@@ -15,7 +15,7 @@
     @Override
     protected void report(Exception e) {
         if (e != null && mInflater.getRemaining() > 0) {
-            e = new IOException("data still remaining in inflater", e);
+            e = new Exception("data still remaining in inflater", e);
         }
         super.report(e);
     }
