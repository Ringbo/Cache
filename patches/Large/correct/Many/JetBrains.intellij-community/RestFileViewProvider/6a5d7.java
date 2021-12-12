diff --git a/python/python-rest/src/com/jetbrains/rest/RestFileViewProvider.java b/python/python-rest/src/com/jetbrains/rest/RestFileViewProvider.java
index ebca194..81ae0f9 100644
--- a/python/python-rest/src/com/jetbrains/rest/RestFileViewProvider.java
+++ b/python/python-rest/src/com/jetbrains/rest/RestFileViewProvider.java
@@ -63,7 +63,7 @@
   @NotNull
   public Set<Language> getLanguages() {
     if (myLanguages == null) {
-      myLanguages = Sets.newLinkedHashSet();
+      myLanguages = Sets.newConcurrentHashSet();
       myLanguages.add(getBaseLanguage());
       Language djangoTemplateLanguage = Language.findLanguageByID("DjangoTemplate");
       if (djangoTemplateLanguage != null) {
