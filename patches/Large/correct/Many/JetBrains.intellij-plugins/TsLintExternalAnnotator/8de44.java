diff --git a/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java b/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
index d024585..77f9c62 100644
--- a/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
+++ b/tslint/src/com/intellij/lang/javascript/linter/tslint/highlight/TsLintExternalAnnotator.java
@@ -163,7 +163,7 @@
         List<IntentionAction> defaultIntentions = super.createListForError(configFile, configurable, errorBase);
         if (errorBase instanceof TsLinterError && ((TsLinterError)errorBase).hasFix()) {
           ArrayList<IntentionAction> result = ContainerUtil.newArrayList();
-          if (document != null) {
+          if (document != null && myOnTheFly) {
             result.add(new TsLintErrorFixAction((TsLinterError)errorBase, document));
           }
           result.add(fixAllFileIntention);
