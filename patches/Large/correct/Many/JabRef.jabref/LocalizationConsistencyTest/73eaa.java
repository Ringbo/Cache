diff --git a/src/test/java/org/jabref/logic/l10n/LocalizationConsistencyTest.java b/src/test/java/org/jabref/logic/l10n/LocalizationConsistencyTest.java
index 4fb752c..6514d14 100644
--- a/src/test/java/org/jabref/logic/l10n/LocalizationConsistencyTest.java
+++ b/src/test/java/org/jabref/logic/l10n/LocalizationConsistencyTest.java
@@ -117,7 +117,7 @@
                 "PASTE THESE INTO THE ENGLISH LANGUAGE FILE\n" +
                 missingKeys.parallelStream()
                         .map(key -> String.format("\n%s=%s\n", key.getKey(), key.getKey().replaceAll("\\\\ ", " ")))
-                        .collect(Collectors.toList()));
+                        .collect(Collectors.joining("\n")));
     }
 
     @Test
@@ -127,15 +127,17 @@
         assertEquals(Collections.emptySet(), missingKeys, "DETECTED LANGUAGE KEYS WHICH ARE NOT IN THE ENGLISH MENU FILE\n" +
                 "PASTE THESE INTO THE ENGLISH MENU FILE\n" +
                 missingKeys.parallelStream()
-                        .map(key -> String.format("%s=%s", key.getKey(), key.getKey()))
-                        .collect(Collectors.toList()));
+                        .map(key -> String.format("%s=%s", key.getKey(), key.getKey().replaceAll("\\\\ ", " ")))
+                        .collect(Collectors.joining("\n")));
     }
 
     @Test
     public void findObsoleteLocalizationKeys() throws IOException {
         Set<String> obsoleteKeys = LocalizationParser.findObsolete(LocalizationBundleForTest.LANG);
 
-        assertEquals(Collections.emptySet(), obsoleteKeys, "Obsolete keys found in language properties file: " + obsoleteKeys + "\n" +
+        assertEquals(Collections.emptySet(), obsoleteKeys, "Obsolete keys found in language properties file: \n" +
+                obsoleteKeys.stream().collect(Collectors.joining("\n")) +
+                "\n" +
                 "1. CHECK IF THE KEY IS REALLY NOT USED ANYMORE\n" +
                 "2. REMOVE THESE FROM THE ENGLISH LANGUAGE FILE\n");
     }
