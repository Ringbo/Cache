diff --git a/services/autofill/java/com/android/server/autofill/ui/FillUi.java b/services/autofill/java/com/android/server/autofill/ui/FillUi.java
index d566d3d..5e2b69e 100644
--- a/services/autofill/java/com/android/server/autofill/ui/FillUi.java
+++ b/services/autofill/java/com/android/server/autofill/ui/FillUi.java
@@ -489,7 +489,7 @@
                         final String value = item.getValue();
                         // No value, i.e. null, matches any filter
                         if (value == null
-                                || value.toLowerCase().contains(constraintLowerCase)) {
+                                || value.toLowerCase().startsWith(constraintLowerCase)) {
                             filteredItems.add(item);
                         }
                     }
