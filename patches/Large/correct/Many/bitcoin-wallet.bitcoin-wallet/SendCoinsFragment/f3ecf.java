diff --git a/src/de/schildbach/wallet/SendCoinsFragment.java b/src/de/schildbach/wallet/SendCoinsFragment.java
index eb90440..bc92be4 100644
--- a/src/de/schildbach/wallet/SendCoinsFragment.java
+++ b/src/de/schildbach/wallet/SendCoinsFragment.java
@@ -238,7 +238,7 @@
 
 								final Uri uri = AddressBookProvider.CONTENT_URI.buildUpon().appendPath(receivingAddress.toString()).build();
 								final Cursor cursor = activity.managedQuery(uri, null, null, null, null);
-								if (cursor.getCount() == 0)
+								if (cursor != null && cursor.getCount() == 0)
 									showAddAddressDialog(receivingAddress.toString());
 							}
 						};
