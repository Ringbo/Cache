diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/async/ONDashClockExtension.java b/omniNotes/src/main/java/it/feio/android/omninotes/async/ONDashClockExtension.java
index 5415653..c51964b 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/async/ONDashClockExtension.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/async/ONDashClockExtension.java
@@ -96,7 +96,7 @@
         List<Note> today = new ArrayList<>();
         for (Note note : DbHelper.getInstance().getNotesActive()) {
             activeNotes.add(note);
-            if (note.getAlarm() != null) {
+            if (note.getAlarm() != null && !note.isReminderFired()) {
                 reminders.add(note);
                 if (DateHelper.isSameDay(Long.valueOf(note.getAlarm()), Calendar.getInstance().getTimeInMillis())) {
                     today.add(note);
