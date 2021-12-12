diff --git a/src/main/java/net/sf/jabref/logic/journals/Abbreviations.java b/src/main/java/net/sf/jabref/logic/journals/Abbreviations.java
index cd6e7f2..25bb913 100644
--- a/src/main/java/net/sf/jabref/logic/journals/Abbreviations.java
+++ b/src/main/java/net/sf/jabref/logic/journals/Abbreviations.java
@@ -50,7 +50,7 @@
 
         // Read personal list
         String personalJournalList = jabRefPreferences.get(JabRefPreferences.PERSONAL_JOURNAL_LIST);
-        if (personalJournalList != null) {
+        if (personalJournalList != null && !personalJournalList.trim().isEmpty()) {
             try {
                 journalAbbrev.readJournalListFromFile(new File(personalJournalList));
             } catch (FileNotFoundException e) {
