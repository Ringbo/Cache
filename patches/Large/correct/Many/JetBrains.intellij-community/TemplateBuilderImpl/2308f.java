diff --git a/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java b/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
index 1624708..8fc8788 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/template/TemplateBuilderImpl.java
@@ -190,7 +190,7 @@
     int start = 0;
     for (final RangeMarker element : myElements) {
       int offset = element.getStartOffset() - containerStart;
-      LOG.assertTrue(start > offset, "container: " + myContainerElement.getClass() + " markers: " +
+      LOG.assertTrue(start <= offset,"container: " + myContainerElement.getClass() + " markers: " +
                                      StringUtil.join(myElements, new Function<RangeMarker, String>() {
                                                        @Override
                                                        public String fun(RangeMarker rangeMarker) {
