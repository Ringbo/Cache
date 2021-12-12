diff --git a/astrid/plugin-src/com/todoroo/astrid/producteev/ProducteevDetailExposer.java b/astrid/plugin-src/com/todoroo/astrid/producteev/ProducteevDetailExposer.java
index aecd454..545a3f8 100644
--- a/astrid/plugin-src/com/todoroo/astrid/producteev/ProducteevDetailExposer.java
+++ b/astrid/plugin-src/com/todoroo/astrid/producteev/ProducteevDetailExposer.java
@@ -67,7 +67,7 @@
                 responsibleId = metadata.getValue(ProducteevTask.RESPONSIBLE_ID);
             long creatorId = -1;
             if(metadata.containsNonNullValue(ProducteevTask.CREATOR_ID))
-                responsibleId = metadata.getValue(ProducteevTask.CREATOR_ID);
+                creatorId = metadata.getValue(ProducteevTask.CREATOR_ID);
 
             // display dashboard if not "no sync" or "default"
             StoreObject ownerDashboard = null;
@@ -98,9 +98,9 @@
             // display creator user if not the current one
             if(creatorId > 0 && ownerDashboard != null && creatorId !=
                     Preferences.getLong(ProducteevUtilities.PREF_USER_ID, 0L)) {
-                String user = getUserFromDashboard(ownerDashboard, responsibleId);
+                String user = getUserFromDashboard(ownerDashboard, creatorId);
                 if(user != null)
-                    builder.append("<img src='silk_user_gray'/> ").append( //$NON-NLS-1$
+                    builder.append("<img src='silk_user_orange'/> ").append( //$NON-NLS-1$
                             context.getString(R.string.producteev_PDE_task_from, user)).
                             append(TaskAdapter.DETAIL_SEPARATOR);
             }
