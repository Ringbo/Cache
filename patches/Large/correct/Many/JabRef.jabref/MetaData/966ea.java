diff --git a/src/main/java/net/sf/jabref/MetaData.java b/src/main/java/net/sf/jabref/MetaData.java
index 5f6efc6..3f0cbc6 100644
--- a/src/main/java/net/sf/jabref/MetaData.java
+++ b/src/main/java/net/sf/jabref/MetaData.java
@@ -501,7 +501,7 @@
     }
 
     public void setMode(BibDatabaseMode mode) {
-        putData(MetaData.DATABASE_TYPE, Collections.singletonList(mode.getFormattedName().toLowerCase()));
+        putData(MetaData.DATABASE_TYPE, Collections.singletonList(mode.getFormattedName().toLowerCase(Locale.ENGLISH)));
     }
 
     public void markAsProtected() {
