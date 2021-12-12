diff --git a/twitter4j-core/src/main/java/twitter4j/internal/util/z_T4JInternalParseUtil.java b/twitter4j-core/src/main/java/twitter4j/internal/util/z_T4JInternalParseUtil.java
index e0e7b63..de29d7a 100644
--- a/twitter4j-core/src/main/java/twitter4j/internal/util/z_T4JInternalParseUtil.java
+++ b/twitter4j-core/src/main/java/twitter4j/internal/util/z_T4JInternalParseUtil.java
@@ -110,7 +110,7 @@
     public static Date getDate(String name, String format) throws TwitterException {
         SimpleDateFormat sdf = formatMap.get().get(format);
         if (null == sdf) {
-            sdf = new SimpleDateFormat(format);
+            sdf = new SimpleDateFormat(format, Locale.US);
             sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
             formatMap.get().put(format, sdf);
         }
