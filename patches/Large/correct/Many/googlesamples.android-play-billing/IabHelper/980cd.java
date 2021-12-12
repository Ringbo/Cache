diff --git a/TrivialDrive/app/src/main/java/com/example/android/trivialdrivesample/util/IabHelper.java b/TrivialDrive/app/src/main/java/com/example/android/trivialdrivesample/util/IabHelper.java
index f1b81b0..b6f2c94 100644
--- a/TrivialDrive/app/src/main/java/com/example/android/trivialdrivesample/util/IabHelper.java
+++ b/TrivialDrive/app/src/main/java/com/example/android/trivialdrivesample/util/IabHelper.java
@@ -600,7 +600,7 @@
                 }
 
                 if (querySkuDetails) {
-                    r = querySkuDetails(ITEM_TYPE_SUBS, inv, moreItemSkus);
+                    r = querySkuDetails(ITEM_TYPE_SUBS, inv, moreSubsSkus);
                     if (r != BILLING_RESPONSE_RESULT_OK) {
                         throw new IabException(r, "Error refreshing inventory (querying prices of subscriptions).");
                     }
