diff --git a/core/java/android/provider/CalendarContract.java b/core/java/android/provider/CalendarContract.java
index 1ef0916..a28585c 100644
--- a/core/java/android/provider/CalendarContract.java
+++ b/core/java/android/provider/CalendarContract.java
@@ -1442,9 +1442,9 @@
                         attendeeValues.put(Attendees.ATTENDEE_STATUS,
                                 subCursor.getInt(COLUMN_ATTENDEE_STATUS));
                         attendeeValues.put(Attendees.ATTENDEE_IDENTITY,
-                                subCursor.getInt(COLUMN_ATTENDEE_IDENTITY));
+                                subCursor.getString(COLUMN_ATTENDEE_IDENTITY));
                         attendeeValues.put(Attendees.ATTENDEE_ID_NAMESPACE,
-                                subCursor.getInt(COLUMN_ATTENDEE_ID_NAMESPACE));
+                                subCursor.getString(COLUMN_ATTENDEE_ID_NAMESPACE));
                         entity.addSubValue(Attendees.CONTENT_URI, attendeeValues);
                     }
                 } finally {
