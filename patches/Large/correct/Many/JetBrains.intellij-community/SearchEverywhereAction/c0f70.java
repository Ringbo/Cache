diff --git a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
index bfd00da..b007173 100644
--- a/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
+++ b/platform/lang-impl/src/com/intellij/ide/actions/SearchEverywhereAction.java
@@ -961,7 +961,7 @@
     @Override
     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
       Component cmp;
-      PsiFile file = null;
+      PsiElement file = null;
       myLocationString = null;
       String pattern = "*" + myPopupField.getText();
       Matcher matcher = NameUtil.buildMatcher(pattern, 0, true, true, pattern.toLowerCase().equals(pattern));
@@ -969,10 +969,10 @@
         cmp = More.get(isSelected);
       } else if (value instanceof VirtualFile
                  && myProject != null
-                 && (((VirtualFile)value).isDirectory()
+                 && ((((VirtualFile)value).isDirectory() && (file = PsiManager.getInstance(myProject).findDirectory((VirtualFile)value)) != null )
                      || (file = PsiManager.getInstance(myProject).findFile((VirtualFile)value)) != null)) {
         myFileRenderer.setPatternMatcher(matcher);
-        cmp = myFileRenderer.getListCellRendererComponent(list, file == null ? value : file, index, isSelected, cellHasFocus);
+        cmp = myFileRenderer.getListCellRendererComponent(list, file, index, isSelected, cellHasFocus);
       } else if (value instanceof PsiElement) {
         myPsiRenderer.setPatternMatcher(matcher);
         cmp = myPsiRenderer.getListCellRendererComponent(list, value, index, isSelected, isSelected);
