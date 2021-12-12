diff --git a/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendarBooking.java b/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendarBooking.java
index 656ac20..7c96c02 100644
--- a/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendarBooking.java
+++ b/modules/apps/calendar/calendar-service/src/main/java/com/liferay/calendar/upgrade/v1_0_1/UpgradeCalendarBooking.java
@@ -23,7 +23,7 @@
 
 	@Override
 	protected void doUpgrade() throws Exception {
-		if (!tableHasColumn("CalendarBooking", "vEventUid")) {
+		if (!hasColumn("CalendarBooking", "vEventUid")) {
 			runSQL("alter table CalendarBooking add vEventUid STRING null");
 		}
 
