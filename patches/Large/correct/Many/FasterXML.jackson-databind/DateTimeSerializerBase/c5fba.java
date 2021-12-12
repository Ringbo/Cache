diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase.java b/src/main/java/com/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase.java
index b4c51e2..6394890 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase.java
@@ -59,7 +59,8 @@
                     return withFormat(Boolean.TRUE, null);
                 }
 
-                if (format.getShape() == JsonFormat.Shape.STRING) {
+                if (format.getShape() == JsonFormat.Shape.STRING || format.hasPattern()
+                                || format.hasLocale() || format.hasTimeZone()) {
                     TimeZone tz = format.getTimeZone();
                     final String pattern = format.hasPattern()
                                            ? format.getPattern()
