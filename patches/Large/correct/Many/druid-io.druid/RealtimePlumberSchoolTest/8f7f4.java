diff --git a/server/src/test/java/io/druid/segment/realtime/plumber/RealtimePlumberSchoolTest.java b/server/src/test/java/io/druid/segment/realtime/plumber/RealtimePlumberSchoolTest.java
index ff4808f..3a9cdd3 100644
--- a/server/src/test/java/io/druid/segment/realtime/plumber/RealtimePlumberSchoolTest.java
+++ b/server/src/test/java/io/druid/segment/realtime/plumber/RealtimePlumberSchoolTest.java
@@ -125,8 +125,7 @@
           {
             return new JSONParseSpec(
                 new TimestampSpec("timestamp", "auto"),
-                new DimensionsSpec(null, null, null),
-                JSONParseSpec.JSON
+                new DimensionsSpec(null, null, null)
             );
           }
 
