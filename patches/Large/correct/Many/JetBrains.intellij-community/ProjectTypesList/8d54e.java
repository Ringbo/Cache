diff --git a/java/idea-ui/src/com/intellij/ide/util/newProjectWizard/ProjectTypesList.java b/java/idea-ui/src/com/intellij/ide/util/newProjectWizard/ProjectTypesList.java
index b292f2d..42b485d 100644
--- a/java/idea-ui/src/com/intellij/ide/util/newProjectWizard/ProjectTypesList.java
+++ b/java/idea-ui/src/com/intellij/ide/util/newProjectWizard/ProjectTypesList.java
@@ -63,7 +63,7 @@
   private MinusculeMatcher myMatcher;
   private Pair<TemplateItem, Integer> myBestMatch;
 
-  private final TemplateItem myLoadingItem;
+  private TemplateItem myLoadingItem;
 
   public ProjectTypesList(JBList list, SearchTextField searchField, MultiMap<TemplatesGroup, ProjectTemplate> map, final WizardContext context) {
     myList = list;
@@ -71,7 +71,7 @@
 
     List<TemplateItem> items = buildItems(map);
     final RemoteTemplatesFactory factory = new RemoteTemplatesFactory();
-    final String groupName = factory.getGroups()[0];
+    final String groupName = RemoteTemplatesFactory.SAMPLES_GALLERY;
     final TemplatesGroup samplesGroup = new TemplatesGroup(groupName, "", null);
     myLoadingItem = new TemplateItem(new LoadingProjectTemplate(), samplesGroup) {
       @Override
