diff --git a/platform/core-impl/src/com/intellij/codeInsight/completion/OffsetTranslator.java b/platform/core-impl/src/com/intellij/codeInsight/completion/OffsetTranslator.java
index cf844f8..9b422f2 100644
--- a/platform/core-impl/src/com/intellij/codeInsight/completion/OffsetTranslator.java
+++ b/platform/core-impl/src/com/intellij/codeInsight/completion/OffsetTranslator.java
@@ -31,14 +31,14 @@
 /**
  * @author peter
  */
-public class OffsetTranslator implements Disposable {
+class OffsetTranslator implements Disposable {
   static final Key<OffsetTranslator> RANGE_TRANSLATION = Key.create("completion.rangeTranslation");
 
   private final PsiFile myOriginalFile;
   private final Document myCopyDocument;
   private final LinkedList<DocumentEvent> myTranslation = new LinkedList<DocumentEvent>();
 
-  public OffsetTranslator(final Document originalDocument, final PsiFile originalFile, Document copyDocument) {
+  OffsetTranslator(final Document originalDocument, final PsiFile originalFile, Document copyDocument) {
     myOriginalFile = originalFile;
     myCopyDocument = copyDocument;
     myCopyDocument.putUserData(RANGE_TRANSLATION, this);
@@ -63,7 +63,7 @@
           myTranslation.addFirst(e);
         }
       }
-    });
+    }, this);
 
     originalFile.getProject().getMessageBus().connect(this).subscribe(PsiModificationTracker.TOPIC, new PsiModificationTracker.Listener() {
       long lastModCount = originalFile.getViewProvider().getModificationStamp();
@@ -90,7 +90,7 @@
   }
 
   @Nullable
-  public Integer translateOffset(Integer offset) {
+  Integer translateOffset(Integer offset) {
     for (DocumentEvent event : myTranslation) {
       offset = translateOffset(offset, event);
       if (offset == null) {
