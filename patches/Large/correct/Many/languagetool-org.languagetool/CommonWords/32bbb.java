diff --git a/languagetool-core/src/main/java/org/languagetool/language/CommonWords.java b/languagetool-core/src/main/java/org/languagetool/language/CommonWords.java
index dce53be..49bf0ec 100644
--- a/languagetool-core/src/main/java/org/languagetool/language/CommonWords.java
+++ b/languagetool-core/src/main/java/org/languagetool/language/CommonWords.java
@@ -56,7 +56,8 @@
               String key = line.toLowerCase();
               List<Language> languages = word2langs.get(key);
               if (languages == null) {
-                ArrayList<Language> l = new ArrayList<>();
+                // word2langs is static, so this can be accessed from multiple threads concurrently -> prevent exceptions
+                List<Language> l = Collections.synchronizedList(new LinkedList<>());
                 l.add(lang);
                 word2langs.put(key, l);
               } else {
