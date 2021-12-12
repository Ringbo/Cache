diff --git a/flex/src/com/intellij/javascript/flex/mxml/FlexXmlBackedSymbolContributor.java b/flex/src/com/intellij/javascript/flex/mxml/FlexXmlBackedSymbolContributor.java
index 26739c4..557d84e 100644
--- a/flex/src/com/intellij/javascript/flex/mxml/FlexXmlBackedSymbolContributor.java
+++ b/flex/src/com/intellij/javascript/flex/mxml/FlexXmlBackedSymbolContributor.java
@@ -24,7 +24,7 @@
   public NavigationItem[] getItemsByName(String name, final String pattern, Project project, boolean includeNonProjectItems) {
     Collection<NavigationItem> result = new THashSet<NavigationItem>();
     result.addAll(FlexXmlBackedMembersIndex.getItemsByName(name, project));
-    for (NavigationItem item : JavaScriptClassContributor.getItemsByNameStatic(name, pattern, project, includeNonProjectItems)) {
+    for (NavigationItem item : JavaScriptClassContributor.getItemsByNameStatic(name, project, includeNonProjectItems)) {
       if (item instanceof XmlBackedJSClassImpl) {
         result.add(item);
       }
