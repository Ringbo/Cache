diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/ex/InspectionProfileTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/ex/InspectionProfileTest.java
index 6896366..e38307d 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/ex/InspectionProfileTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/ex/InspectionProfileTest.java
@@ -453,7 +453,7 @@
   }
 
   private static InspectionProfileImpl createProfile(@NotNull InspectionToolRegistrar registrar) {
-    InspectionProfileImpl base = new InspectionProfileImpl("Base", registrar, InspectionProfileManager.getInstance());
+    InspectionProfileImpl base = new InspectionProfileImpl("Base", registrar, InspectionProfileManager.getInstance(), null, null);
     return new InspectionProfileImpl("Foo", registrar, InspectionProfileManager.getInstance(), base, null);
   }
 
