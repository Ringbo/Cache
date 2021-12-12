diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/language/LanguageRepositoryImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/language/LanguageRepositoryImplTest.java
index 73e636d..37cae21 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/language/LanguageRepositoryImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/language/LanguageRepositoryImplTest.java
@@ -32,17 +32,17 @@
   private static final Language SOME_LANGUAGE = createLanguage(SOME_LANGUAGE_KEY, "_name");
 
   @Test(expected = IllegalArgumentException.class)
-  public void constructor_fails_is_language_have_the_same_key() throws Exception {
+  public void constructor_fails_is_language_have_the_same_key() {
     new LanguageRepositoryImpl(createLanguage(SOME_LANGUAGE_KEY, " 1"), createLanguage(SOME_LANGUAGE_KEY, " 2"));
   }
 
   @Test
-  public void find_on_empty_LanguageRepository_returns_absent() throws Exception {
+  public void find_on_empty_LanguageRepository_returns_absent() {
     assertThat(new LanguageRepositoryImpl().find(ANY_KEY).isPresent()).isFalse();
   }
 
   @Test
-  public void find_by_key_returns_the_same_object() throws Exception {
+  public void find_by_key_returns_the_same_object() {
     LanguageRepositoryImpl languageRepository = new LanguageRepositoryImpl(SOME_LANGUAGE);
     Optional<Language> language = languageRepository.find(SOME_LANGUAGE_KEY);
     assertThat(language.isPresent()).isTrue();
@@ -50,7 +50,7 @@
   }
 
   @Test
-  public void find_by_other_key_returns_absent() throws Exception {
+  public void find_by_other_key_returns_absent() {
     LanguageRepositoryImpl languageRepository = new LanguageRepositoryImpl(SOME_LANGUAGE);
     Optional<Language> language = languageRepository.find(ANY_KEY);
     assertThat(language.isPresent()).isFalse();
