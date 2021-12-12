diff --git a/astrid/plugin-src/com/todoroo/astrid/core/CustomFilterActivity.java b/astrid/plugin-src/com/todoroo/astrid/core/CustomFilterActivity.java
index c695141..5f28901 100644
--- a/astrid/plugin-src/com/todoroo/astrid/core/CustomFilterActivity.java
+++ b/astrid/plugin-src/com/todoroo/astrid/core/CustomFilterActivity.java
@@ -280,7 +280,7 @@
             if(instance.criterion.sql == null)
                 sql.append(TaskCriteria.activeAndVisible()).append(' ');
             else {
-                String subSql = instance.criterion.sql.replaceAll("?",
+                String subSql = instance.criterion.sql.replace("?",
                         instance.criterion.entryValues[instance.selectedIndex]);
                 subSql = CustomFilterCriterion.replacePlaceholders(subSql);
                 sql.append(Task.ID).append(" IN (").append(subSql).append(") ");
