diff --git a/modules/apps/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/upgrade/test/UpgradeCalendarTest.java b/modules/apps/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/upgrade/test/UpgradeCalendarTest.java
index 9cdc593..a10e625 100644
--- a/modules/apps/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/upgrade/test/UpgradeCalendarTest.java
+++ b/modules/apps/calendar/calendar-test/src/testIntegration/java/com/liferay/calendar/upgrade/test/UpgradeCalendarTest.java
@@ -68,7 +68,7 @@
 		try (Connection con = DataAccess.getUpgradeOptimizedConnection()) {
 			connection = con;
 
-			Assert.assertTrue(tableHasColumn("Calendar", "timeZoneId"));
+			Assert.assertTrue(hasColumn("Calendar", "timeZoneId"));
 		}
 	}
 
