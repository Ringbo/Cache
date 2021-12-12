diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
index 2af9474..3aa710f 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelveChangesManager.java
@@ -75,7 +75,7 @@
   private final List<ShelvedChangeList> myRecycledShelvedChangeLists = new ArrayList<ShelvedChangeList>();
 
   @NonNls private static final String ATTRIBUTE_SHOW_RECYCLED = "show_recycled";
-  private final CompoundShelfFileProcesor myFileProcessor;
+  private final CompoundShelfFileProcessor myFileProcessor;
 
   public static final Topic<ChangeListener> SHELF_TOPIC = new Topic<ChangeListener>("shelf updates", ChangeListener.class);
   private boolean myShowRecycled;
@@ -84,10 +84,10 @@
     myProject = project;
     myBus = bus;
     if (!project.isDefault()) {
-      myFileProcessor = new CompoundShelfFileProcesor("shelf");
+      myFileProcessor = new CompoundShelfFileProcessor("shelf");
     }
     else {
-      myFileProcessor = new CompoundShelfFileProcesor(new StreamProvider[]{}, PathManager.getConfigPath() + File.separator + "shelf");
+      myFileProcessor = new CompoundShelfFileProcessor(new StreamProvider[]{}, PathManager.getConfigPath() + File.separator + "shelf");
     }
   }
 
@@ -182,7 +182,7 @@
       }
 
       myFileProcessor.savePathFile(
-        new CompoundShelfFileProcesor.ContentProvider(){
+        new CompoundShelfFileProcessor.ContentProvider(){
             public void writeContentTo(final Writer writer) throws IOException {
               UnifiedDiffWriter.write(patches, writer, "\n");
             }
