diff --git a/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/ChangeReporter.java b/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/ChangeReporter.java
index 9cb7207..c8fdeeb 100644
--- a/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/ChangeReporter.java
+++ b/subprojects/core/src/main/groovy/org/gradle/internal/filewatch/ChangeReporter.java
@@ -47,7 +47,7 @@
             return;
         }
 
-        if (aggregatedEvents.size() < SHOW_INDIVIDUAL_CHANGES_LIMIT) {
+        if (existingType != null || aggregatedEvents.size() < SHOW_INDIVIDUAL_CHANGES_LIMIT) {
             aggregatedEvents.put(file, event.getType());
         } else if (event.getType() != CREATE || event.getFile().isDirectory()) { // ignore file create events in change count calculation since creation also causes a modification event
             moreChangesCount++;
