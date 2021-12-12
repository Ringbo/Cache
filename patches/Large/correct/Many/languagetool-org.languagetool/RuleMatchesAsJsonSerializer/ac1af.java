diff --git a/languagetool-server/src/main/java/org/languagetool/server/RuleMatchesAsJsonSerializer.java b/languagetool-server/src/main/java/org/languagetool/server/RuleMatchesAsJsonSerializer.java
index 0230b36..00c344c 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/RuleMatchesAsJsonSerializer.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/RuleMatchesAsJsonSerializer.java
@@ -129,7 +129,7 @@
       }
     }
     g.writeStringField("description", match.getRule().getDescription());
-    g.writeStringField("issueType", match.getRule().getLocQualityIssueType().name());
+    g.writeStringField("issueType", match.getRule().getLocQualityIssueType().toString());
     if (match.getRule().getUrl() != null) {
       g.writeArrayFieldStart("urls");  // currently only one, but keep it extensible
       g.writeString(match.getRule().getUrl().toString());
