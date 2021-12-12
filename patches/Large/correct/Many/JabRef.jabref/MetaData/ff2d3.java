diff --git a/src/main/java/net/sf/jabref/MetaData.java b/src/main/java/net/sf/jabref/MetaData.java
index 3c42893..5f6efc6 100644
--- a/src/main/java/net/sf/jabref/MetaData.java
+++ b/src/main/java/net/sf/jabref/MetaData.java
@@ -406,7 +406,7 @@
         if ((data == null) || data.isEmpty()) {
             return Optional.empty();
         }
-        return Optional.of(BibDatabaseMode.valueOf(data.get(0).toUpperCase()));
+        return Optional.of(BibDatabaseMode.valueOf(data.get(0).toUpperCase(Locale.ENGLISH)));
     }
 
     public boolean isProtected() {
