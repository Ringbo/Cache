diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/CategoryActivity.java b/omniNotes/src/main/java/it/feio/android/omninotes/CategoryActivity.java
index e732f83..1e721bf 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/CategoryActivity.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/CategoryActivity.java
@@ -232,7 +232,7 @@
 						db.deleteCategory(category);
 
 						// Sets result to show proper message
-						setResult(RESULT_CANCELED);
+						setResult(RESULT_FIRST_USER);
 						finish();
                     }
                 }).build().show();
