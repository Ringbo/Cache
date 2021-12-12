diff --git a/collect_app/src/main/java/org/odk/collect/android/external/ExternalAppsUtils.java b/collect_app/src/main/java/org/odk/collect/android/external/ExternalAppsUtils.java
index ba6c26d..3b2aafe 100644
--- a/collect_app/src/main/java/org/odk/collect/android/external/ExternalAppsUtils.java
+++ b/collect_app/src/main/java/org/odk/collect/android/external/ExternalAppsUtils.java
@@ -105,7 +105,7 @@
                 String paramEntryValue = paramEntry.getValue();
 
                 try {
-                    Object result = getValueRepresentedBy(paramEntry.getKey(), reference);
+                    Object result = getValueRepresentedBy(paramEntry.getValue(), reference);
 
                     if (result != null && result instanceof Serializable) {
                         intent.putExtra(paramEntry.getKey(), (Serializable) result);
