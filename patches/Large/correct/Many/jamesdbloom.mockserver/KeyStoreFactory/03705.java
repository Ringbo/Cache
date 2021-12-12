diff --git a/mockserver-core/src/main/java/org/mockserver/socket/KeyStoreFactory.java b/mockserver-core/src/main/java/org/mockserver/socket/KeyStoreFactory.java
index 542300e..8f07fc3 100644
--- a/mockserver-core/src/main/java/org/mockserver/socket/KeyStoreFactory.java
+++ b/mockserver-core/src/main/java/org/mockserver/socket/KeyStoreFactory.java
@@ -93,7 +93,7 @@
                 subjectAlternativeNames.add(new GeneralName(GeneralName.dNSName, subjectAlternativeName));
             }
         }
-        if (subjectAlternativeNameDomains != null) {
+        if (subjectAlternativeNameIps != null) {
             for (String subjectAlternativeName : subjectAlternativeNameIps) {
                 subjectAlternativeNames.add(new GeneralName(GeneralName.iPAddress, subjectAlternativeName));
             }
