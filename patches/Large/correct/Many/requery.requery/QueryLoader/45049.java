diff --git a/requery-android/src/main/java/io/requery/android/QueryLoader.java b/requery-android/src/main/java/io/requery/android/QueryLoader.java
index a7e1099..297a3a1 100644
--- a/requery-android/src/main/java/io/requery/android/QueryLoader.java
+++ b/requery-android/src/main/java/io/requery/android/QueryLoader.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2016 requery.io
+ * Copyright 2017 requery.io
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -70,7 +70,7 @@
         if (isStarted()) {
             super.deliverResult(result);
         }
-        if (previous != null) {
+        if (previous != null && previous != data) {
             previous.close();
         }
     }
