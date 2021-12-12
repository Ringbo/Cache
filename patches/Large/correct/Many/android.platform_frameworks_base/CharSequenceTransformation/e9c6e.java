diff --git a/core/java/android/service/autofill/CharSequenceTransformation.java b/core/java/android/service/autofill/CharSequenceTransformation.java
index 8ab856e..2413e97 100644
--- a/core/java/android/service/autofill/CharSequenceTransformation.java
+++ b/core/java/android/service/autofill/CharSequenceTransformation.java
@@ -86,7 +86,7 @@
             }
             try {
                 final Matcher matcher = field.first.matcher(value);
-                if (!matcher.matches()) {
+                if (!matcher.find()) {
                     if (sDebug) Log.d(TAG, "match for " + field.first + " failed on id " + id);
                     return;
                 }
