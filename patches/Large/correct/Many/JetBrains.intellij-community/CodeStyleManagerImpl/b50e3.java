diff --git a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
index e54f052..d643998 100644
--- a/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
+++ b/source/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
@@ -1317,7 +1317,7 @@
     final String[] names = baseNameInfo.names;
     Set<String> uniqueNames = new HashSet<String>(names.length);
     for (String name : names) {
-      uniqueNames.add(suggestUniqueVariableName(name, place, false));
+      uniqueNames.add(suggestUniqueVariableName(name, place, true));
     }
 
     return new SuggestedNameInfo(uniqueNames.toArray(new String[uniqueNames.size()])) {
