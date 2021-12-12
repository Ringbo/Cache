diff --git a/services/java/com/android/server/InputMethodManagerService.java b/services/java/com/android/server/InputMethodManagerService.java
index 44b8590..f2cf942 100644
--- a/services/java/com/android/server/InputMethodManagerService.java
+++ b/services/java/com/android/server/InputMethodManagerService.java
@@ -1761,7 +1761,7 @@
                     enabledSubtypeSet.add(String.valueOf(subtype.hashCode()));
                 }
                 ArrayList<InputMethodSubtype> subtypes = getSubtypes(imi);
-                CharSequence label = imi.loadLabel(pm);
+                final CharSequence label = imi.loadLabel(pm);
                 if (showSubtypes && enabledSubtypeSet.size() > 0) {
                     final int subtypeCount = imi.getSubtypeCount();
                     for (int j = 0; j < subtypeCount; ++j) {
@@ -1771,8 +1771,9 @@
                             int nameResId = subtype.getNameResId();
                             String mode = subtype.getMode();
                             if (nameResId != 0) {
-                                title = pm.getText(imi.getPackageName(), nameResId,
-                                        imi.getServiceInfo().applicationInfo);
+                                title = TextUtils.concat(pm.getText(imi.getPackageName(),
+                                        nameResId, imi.getServiceInfo().applicationInfo),
+                                        " (", label, ")");
                             } else {
                                 CharSequence language = subtype.getLocale();
                                 // TODO: Use more friendly Title and UI
