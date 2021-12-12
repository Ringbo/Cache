diff --git a/collect_app/src/main/java/org/odk/collect/android/utilities/WebUtils.java b/collect_app/src/main/java/org/odk/collect/android/utilities/WebUtils.java
index 3f6608d..7ebefbb 100644
--- a/collect_app/src/main/java/org/odk/collect/android/utilities/WebUtils.java
+++ b/collect_app/src/main/java/org/odk/collect/android/utilities/WebUtils.java
@@ -426,7 +426,7 @@
             } catch (Exception e) {
                 String error = "Parsing failed with " + e.getMessage()
                         + "while accessing " + u.toString();
-                Timber.e(e, error);
+                Timber.e(error);
                 return new DocumentFetchResult(error, 0);
             }
 
@@ -464,7 +464,7 @@
             String error = "Error: " + cause + " while accessing "
                     + u.toString();
 
-            Timber.w(e, error);
+            Timber.w(error);
             return new DocumentFetchResult(error, 0);
         }
     }
