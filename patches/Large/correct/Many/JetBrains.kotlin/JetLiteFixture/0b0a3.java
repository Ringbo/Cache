diff --git a/idea/tests/org/jetbrains/jet/JetLiteFixture.java b/idea/tests/org/jetbrains/jet/JetLiteFixture.java
index e0c0051..a2142be 100644
--- a/idea/tests/org/jetbrains/jet/JetLiteFixture.java
+++ b/idea/tests/org/jetbrains/jet/JetLiteFixture.java
@@ -81,7 +81,7 @@
             public void verify(PicoContainer container) throws PicoIntrospectionException {
             }
         });
-        myProject = disposeOnTearDown(new MockProjectEx());
+        myProject = disposeOnTearDown(new MockProjectEx(getTestRootDisposable()));
         myPsiManager = new MockPsiManager(myProject);
         myFileFactory = new PsiFileFactoryImpl(myPsiManager);
         final MutablePicoContainer appContainer = getApplication().getPicoContainer();
