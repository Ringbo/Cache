diff --git a/source/com/intellij/openapi/roots/impl/libraries/LibraryImpl.java b/source/com/intellij/openapi/roots/impl/libraries/LibraryImpl.java
index 4ca13ec..10ded16 100644
--- a/source/com/intellij/openapi/roots/impl/libraries/LibraryImpl.java
+++ b/source/com/intellij/openapi/roots/impl/libraries/LibraryImpl.java
@@ -201,7 +201,7 @@
       final String[] orderedRootUrls1 = getUrls(type);
       final String[] orderedRootUrls2 = mySource.getUrls(type);
       if (!Arrays.equals(orderedRootUrls1, orderedRootUrls2)) {
-        return false;
+        return true;
       }
     }
     return false;
