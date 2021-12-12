diff --git a/src/org/thoughtcrime/securesms/database/DatabaseFactory.java b/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
index e42fb2f..7acd5e5 100644
--- a/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
+++ b/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
@@ -922,10 +922,10 @@
             if (resolved != null && resolved.moveToFirst()) {
               String address = resolved.getString(0);
               addresses[i] = DelimiterUtil.escape(numberMigrator.migrate(address), ' ');
-            } else if (recipientIds[i].equals("-1")) {
+            } else if (TextUtils.isEmpty(recipientIds[i]) || recipientIds[i].equals("-1")) {
               addresses[i] = "Unknown";
             } else {
-              throw new AssertionError("Unable to resolve: " + recipientIds[i]);
+              throw new AssertionError("Unable to resolve: " + recipientIds[i] + ", recipientIdsList: '" + recipientIdsList + "'");
             }
 
             if (resolved != null) resolved.close();
@@ -995,10 +995,10 @@
             if (resolved != null && resolved.moveToFirst()) {
               String address = resolved.getString(0);
               addresses[i] = DelimiterUtil.escape(numberMigrator.migrate(address), ' ');
-            } else if (recipientIds[i].equals("-1")) {
+            } else if (TextUtils.isEmpty(recipientIds[i]) || recipientIds[i].equals("-1")) {
               addresses[i] = "Unknown";
             } else {
-              throw new AssertionError("Unable to resolve: " + recipientIds[i]);
+              throw new AssertionError("Unable to resolve: " + recipientIds[i] + ", recipientIdsList: '" + recipientIdsList + "'");
             }
 
             if (resolved != null) resolved.close();
