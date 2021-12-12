diff --git a/services/autofill/java/com/android/server/autofill/ui/FillUi.java b/services/autofill/java/com/android/server/autofill/ui/FillUi.java
index f00b272..e9c98e9 100644
--- a/services/autofill/java/com/android/server/autofill/ui/FillUi.java
+++ b/services/autofill/java/com/android/server/autofill/ui/FillUi.java
@@ -503,7 +503,7 @@
                         final String value = item.getValue();
                         // No value, i.e. null, matches any filter
                         if (value == null
-                                || value.toLowerCase().contains(constraintLowerCase)) {
+                                || value.toLowerCase().startsWith(constraintLowerCase)) {
                             filteredItems.add(item);
                         }
                     }
