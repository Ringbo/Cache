diff --git a/javaparser-testing/src/test/java/com/github/javaparser/bdd/steps/ParsingSteps.java b/javaparser-testing/src/test/java/com/github/javaparser/bdd/steps/ParsingSteps.java
index 75ad0de..e14e296 100644
--- a/javaparser-testing/src/test/java/com/github/javaparser/bdd/steps/ParsingSteps.java
+++ b/javaparser-testing/src/test/java/com/github/javaparser/bdd/steps/ParsingSteps.java
@@ -283,6 +283,6 @@
     @Then("the package name is $package")
     public void thenThePackageNameIs(String expected) {
         PackageDeclaration node = (PackageDeclaration) state.get("selectedNode");
-        assertEquals(expected, node.getName().getName());
+        assertEquals(expected, node.getName().toString());
     }
 }
