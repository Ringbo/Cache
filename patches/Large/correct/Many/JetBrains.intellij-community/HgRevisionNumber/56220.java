diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/HgRevisionNumber.java b/plugins/hg4idea/src/org/zmlx/hg4idea/HgRevisionNumber.java
index f88c014..ea51390 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/HgRevisionNumber.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/HgRevisionNumber.java
@@ -66,7 +66,7 @@
     this.changeset = changeset.trim();
     isWorkingVersion = changeset.endsWith("+");
     int subjectIndex = commitMessage.indexOf('\n');
-    mySubject = subjectIndex == -1 ? commitMessage : commitMessage.substring(subjectIndex);
+    mySubject = subjectIndex == -1 ? commitMessage : commitMessage.substring(0, subjectIndex);
   }
 
   public String getChangeset() {
