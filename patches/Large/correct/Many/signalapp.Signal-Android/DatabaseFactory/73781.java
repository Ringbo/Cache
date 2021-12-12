diff --git a/src/org/thoughtcrime/securesms/database/DatabaseFactory.java b/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
index 5420a60..79d0bbb 100644
--- a/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
+++ b/src/org/thoughtcrime/securesms/database/DatabaseFactory.java
@@ -911,14 +911,14 @@
           long     threadId         = cursor.getLong(0);
           String   recipientIdsList = cursor.getString(1);
           String[] recipientIds     = recipientIdsList.split(" ");
-          String[] numbers          = new String[recipientIds.length];
+          String[] addresses         = new String[recipientIds.length];
 
           for (int i=0;i<recipientIds.length;i++) {
             Cursor resolved = canonicalAddressDatabase.query("canonical_addresses", new String[] {"address"}, "_id = ?", new String[] {recipientIds[i]}, null, null, null);
 
             if (resolved != null && resolved.moveToFirst()) {
               String address = resolved.getString(0);
-              numbers[i] = numberMigrator.migrate(address);
+              addresses[i] = numberMigrator.migrate(address);
             } else {
               throw new AssertionError("Unable to resolve: " + recipientIds[i]);
             }
@@ -927,7 +927,7 @@
           }
 
           ContentValues values = new ContentValues(1);
-          values.put("recipient_ids", Util.join(numbers, " "));
+          values.put("recipient_ids", Util.join(addresses, " "));
           db.update("thread", values, "_id = ?", new String[] {String.valueOf(threadId)});
         }
 
@@ -997,7 +997,7 @@
 
           ContentValues values = new ContentValues(1);
           values.put("recipient_ids", Util.join(addresses, " "));
-          db.update("thread", values, "_id = ?", new String[] {String.valueOf(id)});
+          db.update("recipient_preferences", values, "_id = ?", new String[] {String.valueOf(id)});
         }
 
         if (cursor != null) cursor.close();
@@ -1337,12 +1337,12 @@
         if (localNumberImprecise.charAt(0) == '+')
           localNumberImprecise = localNumberImprecise.substring(1);
 
-        if (localNumberImprecise.length() == number.length() || number.length() > localNumberImprecise.length())
+        if (localNumberImprecise.length() == bareNumber.length() || bareNumber.length() > localNumberImprecise.length())
           return "+" + number;
 
-        int difference = localNumberImprecise.length() - number.length();
+        int difference = localNumberImprecise.length() - bareNumber.length();
 
-        return "+" + localNumberImprecise.substring(0, difference) + number;
+        return "+" + localNumberImprecise.substring(0, difference) + bareNumber;
       }
     }
 
