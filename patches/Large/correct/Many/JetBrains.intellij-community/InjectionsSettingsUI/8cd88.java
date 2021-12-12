diff --git a/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/InjectionsSettingsUI.java b/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/InjectionsSettingsUI.java
index 3eee17d..39ffacf 100644
--- a/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/InjectionsSettingsUI.java
+++ b/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/InjectionsSettingsUI.java
@@ -331,7 +331,7 @@
 
   private class InjectionsTable extends TableView {
     private InjectionsTable(final List<BaseInjection> injections) {
-      super(new ListTableModel<BaseInjection>(createInjectionColumnInfos(), injections, -1));
+      super(new ListTableModel<BaseInjection>(createInjectionColumnInfos(), injections, 1));
       setAutoResizeMode(AUTO_RESIZE_LAST_COLUMN);
       getColumnModel().getColumn(2).setCellRenderer(createLanguageCellRenderer());
       getColumnModel().getColumn(1).setCellRenderer(createDisplayNameCellRenderer());
