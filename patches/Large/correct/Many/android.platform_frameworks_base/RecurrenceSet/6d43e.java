diff --git a/core/java/android/pim/RecurrenceSet.java b/core/java/android/pim/RecurrenceSet.java
index bd7924a..5d09fb5 100644
--- a/core/java/android/pim/RecurrenceSet.java
+++ b/core/java/android/pim/RecurrenceSet.java
@@ -48,7 +48,8 @@
      * events table in the CalendarProvider.
      * @param values The values retrieved from the Events table.
      */
-    public RecurrenceSet(ContentValues values) {
+    public RecurrenceSet(ContentValues values)
+            throws EventRecurrence.InvalidFormatException {
         String rruleStr = values.getAsString(Calendar.Events.RRULE);
         String rdateStr = values.getAsString(Calendar.Events.RDATE);
         String exruleStr = values.getAsString(Calendar.Events.EXRULE);
@@ -65,7 +66,8 @@
      * @param cursor The cursor containing the RRULE, RDATE, EXRULE, and EXDATE
      * columns.
      */
-    public RecurrenceSet(Cursor cursor) {
+    public RecurrenceSet(Cursor cursor)
+            throws EventRecurrence.InvalidFormatException {
         int rruleColumn = cursor.getColumnIndex(Calendar.Events.RRULE);
         int rdateColumn = cursor.getColumnIndex(Calendar.Events.RDATE);
         int exruleColumn = cursor.getColumnIndex(Calendar.Events.EXRULE);
@@ -78,12 +80,14 @@
     }
 
     public RecurrenceSet(String rruleStr, String rdateStr,
-                  String exruleStr, String exdateStr) {
+                  String exruleStr, String exdateStr)
+            throws EventRecurrence.InvalidFormatException {
         init(rruleStr, rdateStr, exruleStr, exdateStr);
     }
 
     private void init(String rruleStr, String rdateStr,
-                      String exruleStr, String exdateStr) {
+                      String exruleStr, String exdateStr)
+            throws EventRecurrence.InvalidFormatException {
         if (!TextUtils.isEmpty(rruleStr) || !TextUtils.isEmpty(rdateStr)) {
 
             if (!TextUtils.isEmpty(rruleStr)) {
