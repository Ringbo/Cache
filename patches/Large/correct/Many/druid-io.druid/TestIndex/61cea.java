diff --git a/processing/src/test/java/io/druid/segment/TestIndex.java b/processing/src/test/java/io/druid/segment/TestIndex.java
index 434042b..9582321 100644
--- a/processing/src/test/java/io/druid/segment/TestIndex.java
+++ b/processing/src/test/java/io/druid/segment/TestIndex.java
@@ -182,7 +182,7 @@
                     "\t",
                     Arrays.asList(COLUMNS)
                 ),
-                null, null, null
+                null, null, null, null
             );
             boolean runOnce = false;
             int lineCount = 0;
