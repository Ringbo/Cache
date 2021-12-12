diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/DeckOptions.java b/AnkiDroid/src/main/java/com/ichi2/anki/DeckOptions.java
index 5032d36..40b3b78 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/DeckOptions.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/DeckOptions.java
@@ -323,7 +323,7 @@
                                 calendar.set(Calendar.MINUTE, reminder.getJSONArray("time").getInt(1));
                                 calendar.set(Calendar.SECOND, 0);
 
-                                alarmManager.setInexactRepeating(
+                                alarmManager.setRepeating(
                                         AlarmManager.RTC_WAKEUP,
                                         calendar.getTimeInMillis(),
                                         AlarmManager.INTERVAL_DAY,
@@ -356,7 +356,7 @@
                             calendar.set(Calendar.MINUTE, reminder.getJSONArray("time").getInt(1));
                             calendar.set(Calendar.SECOND, 0);
 
-                            alarmManager.setInexactRepeating(
+                            alarmManager.setRepeating(
                                     AlarmManager.RTC_WAKEUP,
                                     calendar.getTimeInMillis(),
                                     AlarmManager.INTERVAL_DAY,
