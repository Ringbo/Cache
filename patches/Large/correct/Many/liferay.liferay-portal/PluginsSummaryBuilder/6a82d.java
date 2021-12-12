diff --git a/portal-impl/src/com/liferay/portal/tools/PluginsSummaryBuilder.java b/portal-impl/src/com/liferay/portal/tools/PluginsSummaryBuilder.java
index ac54601..4487430 100644
--- a/portal-impl/src/com/liferay/portal/tools/PluginsSummaryBuilder.java
+++ b/portal-impl/src/com/liferay/portal/tools/PluginsSummaryBuilder.java
@@ -436,7 +436,9 @@
 
 			Set<String> ticketIds = _extractTicketIds(pluginDir, range);
 
-			if (range.endsWith("^.." + _latestHASH) && ticketIds.isEmpty()) {
+			if (range.endsWith("^.." + _latestHASH) && ticketIds.isEmpty() &&
+				(relengChangeLogEntries.size() > 1)) {
+
 				continue;
 			}
 
