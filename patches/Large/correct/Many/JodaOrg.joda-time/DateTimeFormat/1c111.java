diff --git a/JodaTime/src/java/org/joda/time/format/DateTimeFormat.java b/JodaTime/src/java/org/joda/time/format/DateTimeFormat.java
index 954615d..9031ff9 100644
--- a/JodaTime/src/java/org/joda/time/format/DateTimeFormat.java
+++ b/JodaTime/src/java/org/joda/time/format/DateTimeFormat.java
@@ -621,7 +621,7 @@
         public DateTimeField getField(Chronology chrono) {
             DateTimeField wrappedField = iWrappedType.getField(chrono);
             RemainderDateTimeField field = iRecent;
-            if (field.getWrappedField() == wrappedField) {
+            if (field != null && field.getWrappedField() == wrappedField) {
                 return field;
             }
             field = new RemainderDateTimeField(wrappedField, iType, iDivisor);
